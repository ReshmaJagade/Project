package com.app.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="admin")
public class Admin extends BaseEntity {
	@Column(name="admin_name",length = 30)
	private String adminName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	@NotBlank
	@Column(name="email_id",length = 30,unique =true)
	private String emailId;
	
	@Column(length = 30)
	private String gender;
	
	@Column(name="mobile_no",length = 30)
	private String mobileNo;
	@NotBlank
	@Column(length = 30,unique = true)
	private String userName;
	@NotBlank
	@Column(length = 30)
	private String password;
	

}