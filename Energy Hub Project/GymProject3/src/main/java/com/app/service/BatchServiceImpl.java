/**
 * 
 */
package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.BatchHandlingException;
import com.app.custom_exception.PackageHandlingException;
import com.app.dao.IBatchRepository;
import com.app.dao.IBranchRepository;
import com.app.pojos.Batch;
import com.app.pojos.Branch;
import com.app.pojos.Package;
import com.app.pojos.Trainer;

@Service
@Transactional
public class BatchServiceImpl implements IBatchService {

	@Autowired
	private IBatchRepository batchRepo;
    @Autowired
    private ITrainerService trainerService;
    @Autowired
    private IBranchRepository branchRepo;
    @Override
	public Batch addBatch(Batch b, int trainerId, int branchId) {
		Trainer trainer=trainerService.getTrainerById(trainerId);
		Branch branch=branchRepo.getById(branchId);
		b.setAllocatedTrainer(trainer);
		b.setBranchEnrolled(branch);
		return batchRepo.save(b);
	}
	@Override
	public String deleteBatch(int BatchId) {
		batchRepo.deleteById(BatchId);
		return "Package details deleted for ID=" + BatchId;
		
	}
	@Override
	public List<Batch> getAllBatch() {
	
		return batchRepo.findAll();
		
	}
	@Override
	public Batch getBatchById(int batchId) {
		return batchRepo.findById(batchId).orElseThrow(() 
				-> new BatchHandlingException("Invalid Batch id"));
	}
	

}
