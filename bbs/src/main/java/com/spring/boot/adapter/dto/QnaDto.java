package com.spring.boot.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QnaDto implements Serializable {
    private String qnaId;
    private String title;
    private String content;
    private String regDt;
}
