package com.spring.boot.bbs.controller;

import com.spring.boot.adapter.dto.QnaDto;
import com.spring.boot.adapter.dto.factory.QnaDtoFactory;
import com.spring.boot.adapter.notice.QnaAdapter;
import com.spring.boot.core.domain.Qna;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/qna")
public class QnaController {

    @Autowired
    private QnaAdapter qnaAdapter;

    @ApiOperation(value = "Q&A 조회")
    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> list() {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("datas", qnaAdapter.list());
        return ResponseEntity.ok().body(resMap);
    }

    @ApiOperation(value = "Q&A 상세 조회")
    @ApiImplicitParam(
            name = "qnaId",
            value = "Q&A 아이디",
            required = true,
            dataType = "string",
            paramType = "query"
    )
    @GetMapping("/{qnaId}")
    public ResponseEntity<Map<String, Object>> detail(@Valid QnaDto qnaDto) {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("data", qnaAdapter.detail(QnaDtoFactory.qna(qnaDto)));
        return ResponseEntity.ok().body(resMap);
    }
}