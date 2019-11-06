package com.spring.boot.core.qna.boundary;

import com.spring.boot.core.domain.Qna;

import java.util.List;

public interface QnaRepository {
    List<Qna> list();
    Qna detail(final Qna qna);
}
