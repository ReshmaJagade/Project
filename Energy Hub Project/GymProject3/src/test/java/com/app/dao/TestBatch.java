package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.pojos.Trainer;
import com.app.service.IBatchService;
import com.app.service.ITrainerService;
import com.app.pojos.Batch;
import com.app.pojos.Branch;

@SpringBootTest
public class TestBatch {

	@Autowired
	private IBatchService batchService;
	@Autowired
	private ITrainerService trainerService;
	@Autowired
	private IBranchRepository branchRepo;
//	@Test
//	public void addBatch() {
//	//	Trainer t=new Trainer("ram","sham", "pune","ram@gmail.com", "male", "9604863401","ram1", "1234","1234","zumba", LocalDate.of(1997,5,15), 5);
//	//	Branch b=new Branch("Branch1","pune");
//
//		Batch newBatch=new Batch("monday","4 to 6","zumba");
//        Batch b=batchService.addBatch(newBatch, 1, 1);
//        System.out.println(b);
//	}
	
//	@Test
//	public void deleteBatchById()
//	{
//		String msg=batchService.deleteBatch(5);
//		System.out.println(msg);
//	}
	
//	@Test
//	public void getAllBatch() {
//		List<Batch> b=batchService.getAllBatch();
//		System.out.println(b);
//	}
//	
}
