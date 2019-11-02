package com.spring.boot.adapter.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NoticeDto {
    private String noticeId;
    private String title;
    private String content;
    private String regDt;
}