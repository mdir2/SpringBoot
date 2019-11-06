package com.spring.boot.bbs.controller;

import com.spring.boot.adapter.dto.NoticeDto;
import com.spring.boot.adapter.dto.factory.NoticeDtoFactory;
import com.spring.boot.adapter.notice.NoticeAdapter;
import com.spring.boot.core.domain.Notice;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @ApiOperation(value = "공지사항 조회")
    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> list() {
        Map<String, Object> resMap = new HashMap<>();
        List<Notice> list = noticeAdapter.list();
        resMap.put("datas", list);
        return ResponseEntity.ok().body(resMap);
    }

    @ApiOperation(value = "공지사항 상세 조회")
    @ApiImplicitParam(
            name = "noticeId",
            value = "공지사항 아이디",
            required = true,
            dataType = "string",
            paramType = "query"
    )
    @GetMapping("/{noticeId}")
    public ResponseEntity<Map<String, Object>> detail(@PathVariable String noticeId) {
        Map<String, Object> resMap = new HashMap<>();
        Notice result = noticeAdapter.detail(Notice.builder().noticeId(noticeId).build());
        resMap.put("data", result);
        return ResponseEntity.ok().body(resMap);
    }
}
