package com.app.pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
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
@Table(name="package")
public class Package extends BaseEntity {
	@Column(name="package_name",length = 30,unique=true)
	private String packageName;
	@Column(length = 30)
	private Double amount;
	@Column(length = 30)
	private String duration;
	//@ManyToMany(mappedBy = "packages", fetch = FetchType.LAZY)
    //private Set<Member> members = new HashSet<>();
//	public Package(String packageName, Double amount, String duration) {
//		super();
//		this.packageName = packageName;
//		this.amount = amount;
//		this.duration = duration;
//	}	
//	@Override
//	public Integer getId() {
//		
//		return super.getId();
//	}
	
	
	
}