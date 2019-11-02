package com.spring.boot.core.notice.boundary;

import com.spring.boot.core.domain.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> list();
    Notice detail(final Notice notice);
}
