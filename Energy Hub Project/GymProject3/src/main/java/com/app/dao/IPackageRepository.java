package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Package;

public interface IPackageRepository extends JpaRepository<Package,Integer>{

	//Use:inherited method:List<User> findAll()
		//Use inherited method : <S extends T> S save(S entity)
		//Use inherited method : deleteById(ID id)
		//Use inherited method :findById(ID id)
	

}
