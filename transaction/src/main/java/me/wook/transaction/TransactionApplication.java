package me.wook.transaction;

import me.wook.transaction.bbs.repository.BbsRepository;
import me.wook.transaction.service.TransactionService;
import me.wook.transaction.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionApplication.class, args);
    }
    
    @Autowired
    private TransactionService transactionService;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private BbsRepository bbsRepository;
    
    @GetMapping("/exception")
    public String exception() throws Exception {
        try {
            transactionService.exceptionWithBbs();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user: " + userRepository.count() + ", bbs: " + bbsRepository.count();
    }
    
    @GetMapping("/runtime")
    public String runtime() {
        try {
            transactionService.runtimeWithBbs();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return "user: " + userRepository.count() + ", bbs: " + bbsRepository.count();
    }
}
