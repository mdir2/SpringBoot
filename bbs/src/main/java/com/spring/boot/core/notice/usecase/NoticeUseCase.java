package com.spring.boot.core.notice.usecase;

import com.spring.boot.core.domain.Notice;
import com.spring.boot.core.notice.boundary.NoticeRepository;
import com.spring.boot.core.notice.boundary.NoticeService;

import java.util.List;

public class NoticeUseCase implements NoticeService {

    private NoticeRepository noticeRepository;

    public NoticeUseCase(final NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    @Override
    public List<Notice> list() {
        return noticeRepository.list();
    }

    @Override
    public Notice detail(final Notice notice) {
        return noticeRepository.detail(notice);
    }
}
