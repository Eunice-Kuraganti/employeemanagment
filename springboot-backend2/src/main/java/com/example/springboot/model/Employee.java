package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This contains Database related logic and is responsible to talk to database
@Entity 
//specifies class as an entity and maps to db table
@Table(name = "employees")
public class Employee {
	
	@Id //making id as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//strategy to generate primary key
	private long id;
	
	//@column is to specify name of the column Even if there is no column annotation it works fine.
	@Column(name = "first_name")
	private String firstName;//if column annotation is not specified then jpa internally takes this string property name as column name

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	//default constructor
	public Employee() {
		
	}
	//parameterized constructor
	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}