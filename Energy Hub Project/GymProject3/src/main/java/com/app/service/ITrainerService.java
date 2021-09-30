package com.app.service;

import java.util.List;

import com.app.pojos.Trainer;

public interface ITrainerService {
	
	//add a method to validate trainer
	Trainer validate(Trainer t);
	
	
//add a method to add a trainer
	Trainer addTrainer(Trainer t);

	// add a method to get all Trainer
	List<Trainer> getAllTrainer();
	
	//add a method to get trainer by id
	Trainer getTrainerById(int trainerId);
	
	//add a method to delete trainer
		String deleteTrainer(int trainerId);
		
		
	//add a method to update trainer
		Trainer updateTrainer(Trainer t,int trainerId);
}
