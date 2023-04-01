package com.niit.service;

import com.niit.domain.User;
import com.niit.repository.UserTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class UserTrackServiceImpl implements UserTrackService{

    private UserTrackRepository userTrackRepository;

    @Autowired
    public  UserTrackServiceImpl(UserTrackRepository userTrackRepository){ this.userTrackRepository = userTrackRepository;}


    @Override
    public User registerUser(User user) {
        return userTrackRepository.save(user);
    }
}
