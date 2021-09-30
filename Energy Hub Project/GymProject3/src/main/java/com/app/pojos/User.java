package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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
@Table(name = "user")
public class User extends BaseEntity{
	@Column(length=20,unique = true)
	@NotBlank
	private String userName;
	@Column(length=20)
	@NotBlank
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	private UserRole role;
	
	public User(@NotBlank String userName, @NotBlank String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
	
}

