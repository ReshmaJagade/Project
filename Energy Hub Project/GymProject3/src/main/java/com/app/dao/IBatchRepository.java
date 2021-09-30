package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.pojos.Batch;
public interface IBatchRepository extends JpaRepository<Batch, Integer>{

}
