package com.spring.boot.core.notice.boundary;

import com.spring.boot.core.domain.Notice;

import java.util.List;

public interface NoticeRepository {
    List<Notice> list();
    Notice detail(final Notice notice);
}