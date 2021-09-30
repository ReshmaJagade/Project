package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.User;

public interface IUserRepository extends JpaRepository<User,Integer> {

	@Query("select u from User u where u.userName=?1 and u.password=?2")
	User findByUserName(String username,String password);
	
	@Query("select u from User u where u.userName=?1")
	User findByUserName1(String username);
}
