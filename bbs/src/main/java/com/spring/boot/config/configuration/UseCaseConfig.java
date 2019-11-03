package com.spring.boot.config.configuration;

import com.spring.boot.bbs.data.repository.NoticeRepository;
import com.spring.boot.core.notice.usecase.NoticeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Autowired
    private NoticeRepository noticeRepository;

    @Bean(value = "noticeService")
    public NoticeUseCase noticeUseCase() {
        return new NoticeUseCase(noticeRepository);
    }
}
