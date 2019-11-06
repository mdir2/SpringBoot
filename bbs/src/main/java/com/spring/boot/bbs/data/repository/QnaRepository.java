package com.spring.boot.bbs.data.repository;

import com.spring.boot.bbs.data.jpa.entity.QnaEntity;
import com.spring.boot.bbs.data.jpa.repository.QnaJpaRepository;
import com.spring.boot.core.domain.Qna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class QnaRepository implements com.spring.boot.core.qna.boundary.QnaRepository {

    @Autowired
    private QnaJpaRepository qnaJpaRepository;

    @Override
    public List<Qna> list() {
        return qnaJpaRepository.findAll().stream().map(this::qna).collect(Collectors.toList());
    }

    @Override
    public Qna detail(final Qna qna) {
        return this.qna(qnaJpaRepository.findById(qna.getQnaId()).orElseGet(() -> QnaEntity.builder().build()));
    }

    private Qna qna(final QnaEntity qnaEntity) {
        return Qna.builder()
                .qnaId(qnaEntity.getQnaId())
                .title(qnaEntity.getTitle())
                .content(qnaEntity.getContent())
                .regDt(qnaEntity.getRegDt())
                .build();
    }
}
