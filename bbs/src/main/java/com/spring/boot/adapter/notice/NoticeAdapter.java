package com.spring.boot.adapter.notice;

import com.spring.boot.core.domain.Notice;
import com.spring.boot.core.notice.boundary.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NoticeAdapter {
    @Autowired
    private NoticeService noticeService;

    public List<Notice> list() {
        return noticeService.list();
    }

    public Notice detail(Notice notice) {
        return noticeService.detail(notice);
    }
}
