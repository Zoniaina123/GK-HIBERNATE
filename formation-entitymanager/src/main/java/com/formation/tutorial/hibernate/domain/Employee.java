package com.formation.tutorial.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sylvain LALLIER
 *
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@Column(name = "employee_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	private String name;
	
	private String email;
	
	private Company company;

	

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "employee_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", email=" + email + "]";
	}



}
