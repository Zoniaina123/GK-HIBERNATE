package com.formation.tutorial.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private Long id;
	
	private String name;
	private String sexe;
	
	
	public Student() {
	}

	
	public Student(Long id, String name, String sexe) {
		super();
		this.id = id;
		this.name = name;
		this.sexe = sexe;

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sexe=" + sexe + "]";
	}
	
	
}
