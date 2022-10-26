package com.visitor.vms.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class UserEntity {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="branchid")
	private Integer branchid;
	
	@Column (name="firstname")
	private String firstname;
	
	@Column (name="lastname")
	private String lastname;
	
	@Column (name="mail")
	private String mail;

	@Column	(name="password")
	private String password;

	public Integer getBranchid() {
		return branchid;
	}

	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String email) {
		this.mail = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
