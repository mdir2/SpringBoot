package com.spring.boot.core.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Notice {
    private String noticeId;
    private String title;
    private String content;
    private String regDt;

    // 가공작업이 필요하면 해줌
}
