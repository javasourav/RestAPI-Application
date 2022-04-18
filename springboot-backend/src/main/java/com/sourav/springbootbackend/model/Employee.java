package com.sourav.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	@Id
	private long id;
	@Column(name= "first_name", nullable= false)
	private String firstName;
	@Column(name= "last_name")
	private String lastName;
	@Column(name= "email")
	private String email;
	
	}


