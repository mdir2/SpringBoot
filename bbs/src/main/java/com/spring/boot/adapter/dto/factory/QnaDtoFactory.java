package com.spring.boot.adapter.dto.factory;

import com.spring.boot.adapter.dto.QnaDto;
import com.spring.boot.core.domain.Qna;

public class QnaDtoFactory {
    public static QnaDto qnaDto(Qna qna) {
        return QnaDto
                .builder()
                .qnaId(qna.getQnaId())
                .title(qna.getTitle())
                .content(qna.getContent())
                .regDt(qna.getRegDt())
                .build();
    }

    public static Qna qna(QnaDto qnaDto) {
        return Qna
                .builder()
                .qnaId(qnaDto.getQnaId())
                .title(qnaDto.getTitle())
                .content(qnaDto.getContent())
                .regDt(qnaDto.getRegDt())
                .build();
    }
}
