package com.niit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */


@SpringBootApplication
@EnableEurekaClient
public class UserTrackApplicationMain
{
    public static void main(String[] args) {
        SpringApplication.run(UserTrackApplicationMain.class, args);
    }

}
