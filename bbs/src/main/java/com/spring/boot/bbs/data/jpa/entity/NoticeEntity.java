package com.spring.boot.bbs.data.jpa.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = "tb_board_notice")
public class NoticeEntity {
    @Id
    @Column(name = "notice_id")
    private String noticeId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "reg_dt")
    private String reg_dt;
}
