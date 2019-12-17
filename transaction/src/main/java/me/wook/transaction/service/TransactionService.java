package me.wook.transaction.service;

import me.wook.transaction.bbs.entity.Bbs;
import me.wook.transaction.bbs.repository.BbsRepository;
import me.wook.transaction.user.entity.User;
import me.wook.transaction.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TransactionService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private BbsRepository bbsRepository;
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void exception() throws Exception {
        userRepository.save(new User());
        throw new Exception();
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void runtime() throws RuntimeException {
        userRepository.save(new User());
        throw new RuntimeException();
    }
    
    @Transactional
    public void exceptionWithBbs() throws Exception {
        exception();
        bbsRepository.save(new Bbs());
    }
    
    @Transactional
    public void runtimeWithBbs() throws RuntimeException {
        runtime();
        bbsRepository.save(new Bbs());
    }
}
