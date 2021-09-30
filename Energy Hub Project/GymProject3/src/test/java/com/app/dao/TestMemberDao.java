package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Member;
import com.app.service.IMemberService;


@SpringBootTest
public class TestMemberDao {

	
	@Autowired
	private IMemberService memberService;

	public void addAdmin() {

		// Admin newadmin=new
		// Admin("shruti",LocalDate.of(2020,02,02),"shruti@gmail.com","female","7276722445","shruti","123");

	}

	
	
	
	
//	public Member(String firstName, String lastName, String address, @NotBlank String emailId, String gender,
//	String mobileNo, @NotBlank String userName, @NotBlank String password, @NotBlank String confirmPassword,
//	LocalDate dob, Trainer allocatedTrainer, Set<Package> packages)
	
//	@Test
//	public void addMember()
//	{
//	//	Member m=new Member("subod","bhave", "pune","sb@gmail.com", "male", "9876543210","subod",
//	//			"123","123",LocalDate.of(1996,8,9));
//		Member m=new Member("sachin","kumar", "pune","sk@gmail.com", "male", "9811543210","sachin",
//				"123","123",LocalDate.of(1996,10,10));
//		
//		Member m1=memberService.addMember(m, 4,1);
//	//	System.out.println(m1.getId());
//	}
//	
	
	
//	@Test
//	public void updateMember()
//	{
//		Member m=new Member("subod","bhave", "mumbai","sb@gmail.com", "male", "9876543210","subod",
//				"1234","1234",LocalDate.of(1996,8,9));
//		Member m1=memberService.updateMember(m, 1, 1, 1);
//		
//	}
	
	
//	@Test
//	public void addMember()
//	{
//		m1=null;
//		Member m=new Member();
//	//	Trainer t=new Trainer("raju","gaikwad", "pune","raju@gmail.com", "male", "960763401","raju", "111","111","zumba1", LocalDate.of(1995,4,15), 8);
//		Member m1=memberService.addMember(m1, 1, 1);
//		System.out.println(m1.getId());
//	}
//	
	
	
	
	@Test
	public void displayMember() {
		
		
	
	List<Member> m = memberService.getAllMember();
//	//	System.out.println(m.iterator());
//		for(Member m1:m)
//		{
//			//System.out.println(m1.getFirstName());
//			m1.getPackages().forEach(p->System.out.println(p.getId()));
//		}

	}
//	
//	@Test
//	public void deleteTrainerById() {
//		String msg=trainerService.deleteTrainer(2);
//		System.out.println(msg);
//	}
	
	
//	@Test
//	public void getMemberById() {
//		
//	Member m=	memberService.getMemberById(1);
//		assertEquals(1,m.getId());
//		System.out.println(m);
//	}
//	
	
	
}
