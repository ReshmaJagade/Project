package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Member;
import com.app.pojos.User;
public interface IMemberRepository extends JpaRepository<Member,Integer>{

	//Member save(Member m);

	//Use:inherited method:List<User> findAll()
		//Use inherited method : <S extends T> S save(S entity)
		//Use inherited method : deleteById(ID id)
		//Use inherited method :findById(ID id)
	
	
	//List<Member> findByName(String name);

@Query("select m from Member m where m.userName=?1")
Member findByName(String username);

	
}
