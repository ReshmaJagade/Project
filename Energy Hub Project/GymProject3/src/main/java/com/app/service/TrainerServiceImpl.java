package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.pojos.User;
import com.app.pojos.UserRole;
import com.app.custom_exception.PackageHandlingException;
import com.app.dao.ITrainerRepository;
import com.app.dao.IUserRepository;
import com.app.pojos.Trainer;
import com.app.pojos.User;
@Service
@Transactional
public class TrainerServiceImpl implements ITrainerService{

	@Autowired
	private ITrainerRepository trainerRepo;
	@Autowired
	private IUserRepository userRepo;
	@Autowired IUserService userService;
	
	
	
	
	
	@Override
	public Trainer validate(Trainer t) {
		if(t.getPassword().equals(t.getConfirmPassword()) & t.getPassword().length()>=5)
			return t;
		else
			throw new PackageHandlingException("invalid password entered");
	}

	@Override
	public Trainer addTrainer(Trainer t) {
	
		Trainer t1= trainerRepo.save(t);
		User u=new User(t1.getUserName(),t1.getPassword());
		u.setRole(UserRole.valueOf("TRAINER"));
		User u1=userRepo.save(u);
		System.out.println(u1);
		return t1;
		
		
	}

	@Override
	public List<Trainer> getAllTrainer() {
		return trainerRepo.findAll();
	}

	@Override
	public Trainer getTrainerById(int trainerId) {
		return trainerRepo.findById(trainerId).orElseThrow(() -> new PackageHandlingException("Invalid Trainer id"));
	}

	@Override
	public String deleteTrainer(int trainerId) {
		Trainer t=trainerRepo.findById(trainerId).orElseThrow(() -> new PackageHandlingException("Invalid Trainer id"));
		trainerRepo.deleteById(trainerId);
		userService.deleteUser(t.getUserName());
		return "Package details deleted for ID=" + trainerId;
	}

	@Override
	public Trainer updateTrainer(Trainer t, int trainerId) {
		Trainer t1=trainerRepo.findById(trainerId).orElseThrow(() -> new PackageHandlingException("Invalid Trainer id"));
		t1.setAddress(t.getAddress());
		t1.setConfirmPassword(t.getConfirmPassword());
		t1.setDob(t.getDob());
		t1.setEmailId(t.getEmailId());
		t1.setExperience(t.getExperience());
		t1.setFirstName(t.getFirstName());
		t1.setGender(t.getGender());
        t1.setLastName(t.getLastName());
        t1.setMobileNo(t.getMobileNo());
        t1.setPassword(t.getPassword());
        t1.setSpecialization(t.getSpecialization());
        t1.setUserName(t.getUserName());
        Trainer updatedTrainer=trainerRepo.save(t1);
        return updatedTrainer;
       
	}
	

}
