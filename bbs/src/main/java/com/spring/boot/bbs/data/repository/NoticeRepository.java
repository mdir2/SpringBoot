package com.spring.boot.bbs.data.repository;

import com.spring.boot.core.domain.Notice;

import java.util.List;

public class NoticeRepository implements com.spring.boot.core.notice.boundary.NoticeRepository {
    @Override
    public List<Notice> list() {
        return null;
    }

    @Override
    public Notice detail(final Notice notice) {
        return null;
    }
}
