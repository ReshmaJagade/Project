package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "trainer")
public class Trainer extends BaseEntity{
	@Column(name="first_name",length = 30)
	private String firstName;
	@Column(name="last_name",length = 30)
	private String lastName;
	@Column(length = 30)
	private String address;
	@NotBlank
	@Column(name = "email_id",length  = 30,unique = true)
	private String emailId;
	@Column(length =  30)
	private String gender;
	@Column(length = 30)
	private String mobileNo;
	@Column(length = 30,unique = true)
	@NotBlank
	private String userName;
	@Column(length = 30)
	@NotBlank
	private String password;
	@Column(length = 30)
	@NotBlank
	private String confirmPassword;
	@Column(length = 30)
	private String specialization;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private int experience;

	

}
