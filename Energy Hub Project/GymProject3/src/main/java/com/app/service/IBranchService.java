package com.app.service;

import java.util.List;

import com.app.pojos.Branch;
public interface IBranchService {

	Branch addBranch(Branch b);
	

	String deleteBranch(int BranchId);
	


	List<Branch> getAllBranches();	
}
