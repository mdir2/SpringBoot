package com.spring.boot.adapter.dto.factory;

import com.spring.boot.adapter.dto.NoticeDto;
import com.spring.boot.core.domain.Notice;

public class NoticeDtoFactory {

    public static NoticeDto noticeDTO(Notice notice) {
        return NoticeDto.builder()
                .noticeId(notice.getNoticeId())
                .title(notice.getTitle())
                .content(notice.getContent())
                .regDt(notice.getRegDt())
                .build();
    }

    public static Notice notice(NoticeDto noticeDto) {
        return Notice.builder()
                .noticeId(noticeDto.getNoticeId())
                .title(noticeDto.getTitle())
                .content(noticeDto.getContent())
                .regDt(noticeDto.getRegDt())
                .build();
    }
}
