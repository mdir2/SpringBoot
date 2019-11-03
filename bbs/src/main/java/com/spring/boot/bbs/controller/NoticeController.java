package com.spring.boot.bbs.controller;

import com.spring.boot.adapter.dto.NoticeDto;
import com.spring.boot.adapter.dto.factory.NoticeDtoFactory;
import com.spring.boot.adapter.notice.NoticeAdapter;
import com.spring.boot.core.domain.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeAdapter noticeAdapter;

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> list() {
        Map<String, Object> resMap = new HashMap<>();
        List<Notice> list = noticeAdapter.list();
        resMap.put("datas", list);
        return ResponseEntity.ok().body(resMap);
    }

    @GetMapping("/{noticeId}")
    public ResponseEntity<Map<String, Object>> detail(@Valid NoticeDto noticeDto) {
        Map<String, Object> resMap = new HashMap<>();
        Notice result = noticeAdapter.detail(NoticeDtoFactory.notice(noticeDto));
        resMap.put("data", result);
        return ResponseEntity.ok().body(resMap);
    }
}
