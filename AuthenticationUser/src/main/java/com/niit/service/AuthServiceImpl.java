package com.niit.service;

import com.niit.domain.User;
import com.niit.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService{

    private AuthRepository authRepository;


    @Autowired
    public AuthServiceImpl(AuthRepository authRepository)
    {
        this.authRepository = authRepository;
    }


    @Override
    public User saveUser(User user) {
        return authRepository.save(user);
    }
}
