package com.spring.boot.bbs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @GetMapping("/list")
    public ResponseEntity<List<Map<String, Object>>> list() {
        List<Map<String, Object>> list = new ArrayList<>();
        MultiValueMap map = new LinkedMultiValueMap();
        map.add("a", "a");
        map.add("a", "b");
        map.add("a", "c");
        map.add("a", "d");
        list.add(map);
        return ResponseEntity.ok().body(list);
    }
}
