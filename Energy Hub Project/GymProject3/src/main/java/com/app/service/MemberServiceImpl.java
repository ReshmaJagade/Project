package com.app.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.PackageHandlingException;
import com.app.dao.IMemberRepository;
import com.app.dao.IPackageRepository;
import com.app.dao.ITrainerRepository;
import com.app.dao.IUserRepository;
import com.app.pojos.Member;
import com.app.pojos.Package;
import com.app.pojos.Trainer;
import com.app.pojos.User;
import com.app.pojos.UserRole;
@Service
@Transactional
public class MemberServiceImpl implements IMemberService{

	@Autowired
	private IMemberRepository memberRepo;
	@Autowired
	private ITrainerRepository trainerRepo;
	@Autowired
	private IPackageRepository packageRepo;
	@Autowired
	private IUserRepository userRepo;
	@Autowired 
	private IUserService userService;
	
	
	
	
//	@Override
//	public Member addMember(Member m, int trainerId,Set<Package> p) {
//		
//		Trainer t = trainerRepo.findById(trainerId).orElseThrow(() 
//				-> new PackageHandlingException("Invalid trainer id"));
//		Set<Package> packages=new HashSet<>();
//	for(Package p1:p)
//	{
//		Package p2=packageRepo.findById(p1.getId()).orElseThrow(() 
//						-> new PackageHandlingException("Invalid Package id"));
//		
//	//	Package p1 =packageRepo.findById().orElseThrow(() 
//	//			-> new PackageHandlingException("Invalid Package id"));
//		
//	packages.add(p2);
//		System.out.println(packages);
////	m.getPackages().add(p2);
//
//	}
//
//	for(Package p2:packages)
//	{
//		m.getPackages().add(p2);
//	}
//	//m.getPackages().addAll(packages);
//	
//	m.setPackages(packages);
//	
//	m.setAllocatedTrainer(t);
//		Member newmember =memberRepo.save(m);
//		return newmember;
//	}
//	

//	@Override
//	public Member addMember(Member m, int trainerId,int packageId) {
//		
//		Trainer t = trainerRepo.findById(trainerId).orElseThrow(() 
//				-> new PackageHandlingException("Invalid trainer id"));
//		
//		Package p =packageRepo.findById(packageId).orElseThrow(() 
//				-> new PackageHandlingException("Invalid Package id"));
//		
//		m.getPackages().addAll(Arrays.asList(p));
//		m.setAllocatedTrainer(t);
//		Member newmember =memberRepo.save(m);
//		return newmember;
//	}
	
	

	@Override
	public Member validate(Member m) {
		if(m.getPassword().equals(m.getConfirmPassword()) & m.getPassword().length()>=5)
			return m;
		else
			throw new PackageHandlingException("invalid password entered");
		
	}


	@Override
	public Member addMember(Member m, int trainerId, int packageId) {
		Package p =packageRepo.findById(packageId).orElseThrow(() 
			-> new PackageHandlingException("Invalid Package id"));
	
		Trainer t=trainerRepo.findById(trainerId).orElseThrow(() 
				-> new PackageHandlingException("Invalid Package id"));
		m.setAllocatedTrainer(t);
		m.setSelectedPackage(p);
		Member m1=memberRepo.save(m);
		User u=new User(m1.getUserName(),m1.getPassword());
		u.setRole(UserRole.valueOf("MEMBER"));
		userRepo.save(u);
		System.out.println(u);
		return m1;
	}


//	@Override
//	public Member updateMember(Member m, int trainerId, int packageId, int MemberId) {
//	     Trainer t=trainerRepo.findById(trainerId).orElseThrow(()
//					-> new PackageHandlingException("Invalid Trainer id"));
//	     Package p=packageRepo.findById(MemberId).orElseThrow(()
//					-> new PackageHandlingException("Invalid Package id"));
//	     m.setAllocatedTrainer(t);
//	     m.setSelectedPackage(p);
//	    
//		return memberRepo.save(m);
//	}


	@Override
	public Member updateMember(Member m, int trainerId, int packageId, int MemberId) {
//		Member m=memberRepo.findById(MemberId).orElseThrow(()
//				-> new PackageHandlingException("Invalid Trainer id"));
	     Trainer t=trainerRepo.findById(trainerId).orElseThrow(()
					-> new PackageHandlingException("Invalid Trainer id"));
	     Package p=packageRepo.findById(packageId).orElseThrow(()
					-> new PackageHandlingException("Invalid Package id"));
	     m.setAllocatedTrainer(t);
	     m.setSelectedPackage(p);
	    
		return memberRepo.save(m);
	}

	@Override
	public List<Member> getAllMember() {
		return memberRepo.findAll();
	}


	@Override
	public Member getMemberById(int memberId) {
		return memberRepo.findById(memberId).orElseThrow(()
				-> new PackageHandlingException("Invalid member id"));
	}
	
	@Override
	public String deleteMember(int memberId) {
	Member m=memberRepo.findById(memberId).orElseThrow(()
			-> new PackageHandlingException("Invalid member id"));
			memberRepo.deleteById(memberId);
		userService.deleteUser(m.getUserName());
		return "member details deleted for ID=" + memberId;
	}


	@Override
	public Member getMemberByName(String userName) {
		Member m=memberRepo.findByName(userName);
		return m;
	}


//
//	@Override
//	public Member updateMember(Member m, int trainerId, int packageId,int memberId) {
//		Trainer t = trainerRepo.findById(trainerId).orElseThrow(() 
//				-> new PackageHandlingException("Invalid trainer id"));
//		
//		Package p =packageRepo.findById(packageId).orElseThrow(() 
//				-> new PackageHandlingException("Invalid Package id"));
//		
//		Member oldMember=memberRepo.findById(memberId).orElseThrow(() 
//				-> new PackageHandlingException("Invalid trainer id"));
//		oldMember.setAddress(m.getAddress());
//		oldMember.setAllocatedTrainer(t);
//		oldMember.setConfirmPassword(m.getConfirmPassword());
//		oldMember.setDob(m.getDob());
//		oldMember.setEmailId(m.getEmailId());
//		oldMember.setFirstName(m.getFirstName());
//		oldMember.setGender(m.getGender());
//		oldMember.setLastName(m.getLastName());
//		oldMember.setMobileNo(m.getMobileNo());
//		oldMember.setPackages(m.getPackages());
//		oldMember.setPassword(m.getPassword());
//		oldMember.setUserName(m.getUserName());
//		Member updatedMember=memberRepo.save(oldMember);
//		return updatedMember;
//	}
	
	
	
	@Override
	public int countMembers() {
	 return	(int)memberRepo.count();
	}
}
