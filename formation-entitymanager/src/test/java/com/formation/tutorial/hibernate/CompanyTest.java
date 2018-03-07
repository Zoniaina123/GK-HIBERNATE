package com.formation.tutorial.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.formation.tutorial.hibernate.domain.Company;
import com.formation.tutorial.hibernate.domain.Employee;

public class CompanyTest {

	public static void main(String[] args) {	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emplyee");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("Starting Transaction");
		entityManager.getTransaction().begin();
		
		Company c = new Company();
		c.setName("Zou Company ");
		
		// get all the objects from Employee table
		List<Employee> listEmployee = entityManager.createQuery("SELECT e FROM Employee e").getResultList();
		
		c.setEmployees(listEmployee);

		if (listEmployee == null) {
			System.out.println("No employee found . ");
		} else {
			for (Employee empl : listEmployee) {
				System.out.println("Employee name= " + empl.getName() + ", Employee id " + empl.getEmployeeId() + "la compagnie " + empl.getCompany());
			}
		}
		
		entityManager.getTransaction().commit();
		
		// close the entity manager
		entityManager.close();
		entityManagerFactory.close();
		
	}

}