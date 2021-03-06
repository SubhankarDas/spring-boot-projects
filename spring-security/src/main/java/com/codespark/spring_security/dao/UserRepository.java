package com.codespark.spring_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codespark.spring_security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
