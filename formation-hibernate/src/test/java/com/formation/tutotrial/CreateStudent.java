package com.formation.tutotrial;

import org.hibernate.Session;

import com.formation.tutorial.domain.Person;
import com.formation.tutorial.util.HibernateUtil;

import com.formation.tutorial.domain.Student;

public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				CreateStudent std = new CreateStudent();
				std.createAndStoreStudent("Zoniaina", "F");
				HibernateUtil.getSessionFactory().close();
			}

			private void createAndStoreStudent(String nom, String sexe) {
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				session.beginTransaction();

				Student student = new Student();
				student.setName(nom);
				student.setSexe(sexe);

				session.save(student);

				System.out.println(student);

				session.getTransaction().commit();
			}

	}

