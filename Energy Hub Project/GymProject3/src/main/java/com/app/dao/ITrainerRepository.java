package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Trainer;

public interface ITrainerRepository extends JpaRepository<Trainer, Integer>{

}
