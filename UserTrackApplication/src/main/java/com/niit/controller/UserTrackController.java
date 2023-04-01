package com.niit.controller;


import com.niit.domain.User;
import com.niit.service.UserTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserTrackController {

    private UserTrackService userTrackService;

    @Autowired
    public UserTrackController(UserTrackService userTrackService)
    {
        this.userTrackService = userTrackService;
    }


    @PostMapping("/user")
    public ResponseEntity<?> regidterUser(@RequestBody User user)  {
        return new ResponseEntity<>(userTrackService.registerUser(user), HttpStatus.CREATED);
    }

}
