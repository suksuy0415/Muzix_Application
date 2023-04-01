package com.niit.repository;

import com.niit.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserTrackRepository extends MongoRepository<User,String> {
}
