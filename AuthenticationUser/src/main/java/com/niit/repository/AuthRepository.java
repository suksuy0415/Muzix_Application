package com.niit.repository;

import com.niit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<User,String> {
}
