package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IBranchRepository;
import com.app.pojos.Branch;
@Service
@Transactional
public class BranchServiceImpl implements IBranchService {

	@Autowired
	private IBranchRepository branchRepo;
	
	@Override
	public Branch addBranch(Branch b) {
		Branch newbranch  = branchRepo.save(b);
		return newbranch;
	}


	@Override
	public List<Branch> getAllBranches() {
		return branchRepo.findAll();
	}

	@Override
	public String deleteBranch(int BranchId) {
		branchRepo.deleteById(BranchId);
		return "branch details deleted for ID:"+BranchId;
	}

}
