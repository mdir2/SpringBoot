package com.spring.boot.core.qna.usecase;

import com.spring.boot.core.domain.Qna;
import com.spring.boot.core.qna.boundary.QnaRepository;
import com.spring.boot.core.qna.boundary.QnaService;

import java.util.List;

public class QnaUseCase implements QnaService {

    private QnaRepository qnaRepository;

    public QnaUseCase(final QnaRepository qnaRepository) {
        this.qnaRepository = qnaRepository;
    }

    @Override
    public List<Qna> list() {
        return qnaRepository.list();
    }

    @Override
    public Qna detail(final Qna qna) {
        return qnaRepository.detail(qna);
    }
}
