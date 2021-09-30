package com.app.service;

import java.util.List;
import java.util.Set;

import com.app.pojos.Member;
import com.app.pojos.Package;
import com.app.pojos.Trainer;

public interface IMemberService {

	
	//add a method to validate trainer
		Member validate(Member m);
	
	
	// add a method to get all member
	List<Member> getAllMember();
	
	//add a method to get member by id
	Member getMemberById(int memberId);
	
	//add a method to delete member
		String deleteMember(int memberId);
		
		
		
		//add a method to get member by userName
		Member getMemberByName(String userName);
		
		//Member addMember(Member m, int trainerId,int packageId);

 //   Member addMember(Member m, int trainerId, int packageId);
    
	Member addMember(Member m, int trainerId,int packageId);
    
    //add a method to update member
    Member updateMember(Member m,int trainerId, int packageId,int MemberId);
    
    
  //add a method to count the total members
  	int countMembers();
}
