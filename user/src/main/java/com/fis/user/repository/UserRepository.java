package com.fis.user.repository;

import com.fis.user.bean.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);

}