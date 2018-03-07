package com.formation.tutorial.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.formation.tutorial.hibernate.domain.Employee;

/**
 * @author Sylvain LALLIER
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emplyee");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("Starting Transaction");
		entityManager.getTransaction().begin();
		/*Employee employee = new Employee();
		employee.setName("Zoniaina M.");
		employee.setEmployeeId(4);*/
		Employee emp = entityManager.find(Employee.class, 4);
		emp.setEmail("zou@gmail.com");
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
		System.out.println("Result Employee ID = " + emp.getEmployeeId() + " et son nom:  " + emp.getName()+ "avec son email:" + emp.getEmail());

		// get an object using primary key.
		//Employee emp = entityManager.find(Employee.class, 4);
		//System.out.println(emp);
		//System.out.println("Got Employee " + emp.getName() + " " + emp.getEmployeeId());

		/*// get all the objects from Employee table
		@SuppressWarnings("unchecked")
		List<Employee> listEmployee = entityManager.createQuery("SELECT e FROM Employee e").getResultList();

		if (listEmployee == null) {
			System.out.println("No employee found . ");
		} else {
			for (Employee empl : listEmployee) {
				System.out.println("Employee name= " + empl.getName() + ", Employee id " + empl.getEmployeeId());
			}
		}*/
		// remove and entity
/*		entityManager.getTransaction().begin();
		System.out.println("Deleting Employee with ID = " + emp.getEmployeeId());
		entityManager.remove(emp);
		entityManager.getTransaction().commit();*/

		// close the entity manager
		entityManager.close();
		entityManagerFactory.close();

	}
}
