package com.formation.tutorial.hibernate.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company implements Serializable {
	private int id;
	private String name;
	private Collection<Employee> employees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany
	public Collection<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Collection<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
