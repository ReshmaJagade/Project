package com.app.pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name="member")
public class Member extends BaseEntity{
	
	@Column(name="first_name",length = 30)
	private String firstName;
	@Column(name="last_name",length = 30)
	private String lastName;
	@Column(length = 30)
	private String address;
	@Column(name = "email_id",length  = 30,unique = true)
	@NotBlank
	private String emailId;
	@Column(length =  30)
	private String gender;
	@Column(length = 30)
	private String mobileNo;
	@Column(length = 30,unique = true)
	@NotBlank
	private String userName;
	@NotBlank
	@Column(length = 30)
	private String password;
	@NotBlank
	@Column(length = 30)
	private String confirmPassword;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	@ManyToOne
	@JoinColumn(name="trainer_id")
	private Trainer allocatedTrainer;
////	@ManyToMany
////	@JoinTable(name="member_package",
////    joinColumns=@JoinColumn(name = "member_id"),
////	inverseJoinColumns = @JoinColumn(name="package_id") )
////	private Set<Package> packages=new HashSet<>(); '
//	//fetch = FetchType.LAZY,
//	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
//	@JoinTable(name = "member_package",
//	        joinColumns = {
//	                @JoinColumn(name = "member_id", referencedColumnName = "id",
//	                        nullable = false, updatable = false)},
//	        inverseJoinColumns = {
//	                @JoinColumn(name = "package_id", referencedColumnName = "id",
//	                        nullable = false, updatable = false)})
//	private Set<Package> packages = new HashSet<>();
//
	@ManyToOne
	@JoinColumn(name="package_id")
	private Package selectedPackage;
	
public Member(String firstName, String lastName, String address, @NotBlank String emailId, String gender,
		String mobileNo, @NotBlank String userName, @NotBlank String password, @NotBlank String confirmPassword,
		LocalDate dob) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.emailId = emailId;
	this.gender = gender;
	this.mobileNo = mobileNo;
	this.userName = userName;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.dob = dob;
}

	

	
	
}
