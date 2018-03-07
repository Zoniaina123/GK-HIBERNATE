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
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

}
