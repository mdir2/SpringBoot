package com.spring.boot.config.configuration;

import com.spring.boot.bbs.data.repository.NoticeRepository;
import com.spring.boot.bbs.data.repository.QnaRepository;
import com.spring.boot.core.notice.usecase.NoticeUseCase;
import com.spring.boot.core.qna.usecase.QnaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Autowired
    private NoticeRepository noticeRepository;

    @Autowired
    private QnaRepository qnaRepository;

    @Bean
    public NoticeUseCase noticeUseCase() {
        return new NoticeUseCase(noticeRepository);
    }

    @Bean
    public QnaUseCase qnaUseCase() { return new QnaUseCase(qnaRepository);}
}
