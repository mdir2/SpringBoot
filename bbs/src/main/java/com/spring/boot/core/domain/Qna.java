package com.spring.boot.core.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Qna {
    private String qnaId;
    private String title;
    private String content;
    private String regDt;
}
