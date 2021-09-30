package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="branch")
public class Branch extends BaseEntity {
	@Column(name="branch_name",length = 30)
	private String branchName;
	
	@Column(length = 30)
	private String address;

	

}