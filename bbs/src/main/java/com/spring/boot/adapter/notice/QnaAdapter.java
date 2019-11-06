package com.spring.boot.adapter.notice;

import com.spring.boot.core.domain.Qna;
import com.spring.boot.core.qna.boundary.QnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QnaAdapter {
    @Autowired
    private QnaService qnaService;

    public List<Qna> list() {
        return qnaService.list();
    }

    public Qna detail(final Qna qna) {
        return qnaService.detail(qna);
    }
}
