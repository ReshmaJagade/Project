package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="batches")
public class Batch extends BaseEntity {
	@Column(length = 30)
	private String day;
	
	@Column(name="batch_time",length = 30)
	private String batchTime;
	
	@Column(length = 30)
	private String type;
	@ManyToOne
	@JoinColumn(name="trainer_id")
	private Trainer allocatedTrainer;
	
	@ManyToOne //many to one multiplicity
	@JoinColumn(name = "branch_id") //specifying FK col name
	private Branch branchEnrolled;

	public Batch(String day, String batchTime, String type) {
		super();
		this.day = day;
		this.batchTime = batchTime;
		this.type = type;
	}

	
	
	
}