package com.app.service;

import java.util.List;

import com.app.pojos.Batch;
public interface IBatchService {
//add a method to add batch
	Batch addBatch(Batch b,int TrainerId,int BranchId);
	
//add a method to delete batch
	String deleteBatch(int BatchId);
	

// add a method to get all Trainer
	List<Batch> getAllBatch();

	Batch getBatchById(int batch_id);	
}
