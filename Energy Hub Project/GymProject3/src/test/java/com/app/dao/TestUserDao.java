package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.pojos.Package;
import com.app.pojos.Trainer;
import com.app.pojos.User;
import com.app.pojos.UserRole;
import com.app.service.IPackageService;
import com.app.service.ITrainerService;
import com.app.service.IUserService;

@SpringBootTest
public class TestUserDao {

	@Autowired
	private IUserService userService;
	@Autowired
	private IPackageService packageService;
	@Autowired
	private ITrainerService trainerService;

	public void addAdmin() {

		// Admin newadmin=new
		// Admin("shruti",LocalDate.of(2020,02,02),"shruti@gmail.com","female","7276722445","shruti","123");

	}

//	@Test
//	public void addUser() {
//	//	User u=new User("shruti","123",UserRole.valueOf("ADMIN"));
//		User u=new User("saurabh","1234",UserRole.valueOf("MEMBER"));
//		userService.addUser(u);
//		assertEquals(3,u.getId());
//	}

//
//	@Test
//	public void validateUser() {
//		User u=userService.validateUser("shruti","123");
//		assertEquals("shruti",u.getUserName());
//		assertEquals("123",u.getPassword());
//		System.out.println(u.getUserName());
//	}

//	@Test
//	public void addPackage() {
//	//	Package p=new Package("Gold",1500.00,"3 months");
//		Package p=new Package("Gold",2000.0,"6 months");
//		packageService.addPackage(p);
//		assertEquals(1,p.getId());
//		System.out.println(p.getPackageName());
//		
//	}

//	@Test
//	public void getPackageById() {
//		
//	Package p=	packageService.getPackageById(1);
//		assertEquals(1,p.getId());
//		System.out.println(p);
//	}
//	@Test
//	public void deletePackageById() {
//		String msg=packageService.deletePackage(3);
//		System.out.println(msg);
//	}
//@Test
//public void displayPackage() {
//	List<Package> p=packageService.getAllPackages();
//	System.out.println(p);
//	
//}
//	@Test
//	public void updatePackage()
//	{
//		Package p=new Package("silver",1500.0,"4 months");
//		Package p1=packageService.updatePackageDetails(p,1);
//		System.out.println(p1);
//	}

	@Test
	public void addTrainer()
	{
	//	Trainer t=new Trainer("ram","sham", "pune","ram@gmail.com", "male", "9604863401","ram1", "1234","1234","zumba", LocalDate.of(1997,5,15), 5);
	//	Trainer t=new Trainer("raju","gaikwad", "pune","raju@gmail.com", "male", "960763401","raju", "111","111","zumba1", LocalDate.of(1995,4,15), 8);
		Trainer t=new Trainer("omkar","jagtap", "pune","omkar@gmail.com", "male", "960553401","omki", "9112","9112","Athletics", LocalDate.of(2000,9,9), 5);
		Trainer t1=trainerService.addTrainer(t);
		System.out.println(t1.getId());
	}
//	@Test
//	public void displayTrainer() {
//		List<Trainer> t = trainerService.getAllTrainer();
//		System.out.println(t);
//
//	}
	
//	@Test
//	public void deleteTrainerById() {
//		String msg=trainerService.deleteTrainer(2);
//		System.out.println(msg);
//	}
//	
	
//	@Test
//	public void getTrainerById() {
//		
//	Trainer t=	trainerService.getTrainerById(1);
//		assertEquals(1,t.getId());
//		System.out.println(t);
//	}
	
	
//	@Test
//	public void updateTrainer()
//	{
//		//Trainer t=new Trainer("raju","gaikwad", "pune","raju@gmail.com", "male", "960763401","raju", "111","111","zumba1", LocalDate.of(1995,4,15), 8);
//		Trainer t=new Trainer("ram","sham", "mumbai","ram@gmail.com", "male", "9604863401","ram1", "1234","1234","zumba", LocalDate.of(1997,5,15), 5);
//		Trainer t1=trainerService.updateTrainer(t, 1);
//	}
}
