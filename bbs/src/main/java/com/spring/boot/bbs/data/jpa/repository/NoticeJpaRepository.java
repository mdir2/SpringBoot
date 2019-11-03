package com.spring.boot.bbs.data.jpa.repository;

import com.spring.boot.bbs.data.jpa.entity.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoticeJpaRepository extends JpaRepository<NoticeEntity, String> {
    @Override
    Optional<NoticeEntity> findById(String noticeId);
}
