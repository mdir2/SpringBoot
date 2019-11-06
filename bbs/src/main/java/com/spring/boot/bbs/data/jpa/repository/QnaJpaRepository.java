package com.spring.boot.bbs.data.jpa.repository;

import com.spring.boot.bbs.data.jpa.entity.QnaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QnaJpaRepository extends JpaRepository<QnaEntity, String> {
    @Override
    List<QnaEntity> findAll();

    @Override
    Optional<QnaEntity> findById(String qnaId);
}
