package com.spring.boot.bbs.data.repository;

import com.spring.boot.bbs.data.jpa.entity.NoticeEntity;
import com.spring.boot.bbs.data.jpa.repository.NoticeJpaRepository;
import com.spring.boot.core.domain.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class NoticeRepository implements com.spring.boot.core.notice.boundary.NoticeRepository {

    @Autowired
    private NoticeJpaRepository noticeJpaRepository;

    @Override
    public List<Notice> list() {
        return noticeJpaRepository.findAll().stream().map(this::notice).collect(Collectors.toList());
    }

    @Override
    public Notice detail(final Notice notice) {
        final String noticeId = notice.getNoticeId();
        return this.notice(noticeJpaRepository.findById(noticeId).orElseThrow());
    }

    private Notice notice(NoticeEntity noticeEntity) {
        return Notice.builder()
                .noticeId(noticeEntity.getNoticeId())
                .title(noticeEntity.getTitle())
                .content(noticeEntity.getContent())
                .regDt(noticeEntity.getRegDt())
                .build();
    }
}
