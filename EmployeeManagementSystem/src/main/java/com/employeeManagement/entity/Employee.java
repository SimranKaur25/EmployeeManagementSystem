package com.employeeManagement.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",nullable=false,updatable=false)
	private Long id;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="firstname",nullable=false)
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="jobTitle",nullable=false)
	private String jobTitle;
	
	@Column(name="age",nullable=false)
	private Integer age;
	
	@Column(name="startDate",nullable=false)
	private Date startDate;
	
	@Column(name="endDate")
	private Date endDate;
	
	

	public Employee(String firstname, String lastname, String jobTitle, Integer age, Date date, Date date2) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.jobTitle = jobTitle;
		this.age = age;
		this.startDate = date;
		this.endDate = date2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", jobTitle=" + jobTitle
				+ ", age=" + age + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
}
