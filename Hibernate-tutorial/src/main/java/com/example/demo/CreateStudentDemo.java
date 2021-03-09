package com.example.demo;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try {
			//start a transaction
			session.beginTransaction();
			//query students
			List<Student> thestudents=session.createQuery("from Student").list();
			//display students
			displaystudent(thestudents);
			thestudents=session.createQuery("from Student s where s.lastName='Choudhury'").list();
			System.out.println("students"); 
			displaystudent(thestudents);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		}
		finally {
			factory.close();
		}

	}

	private static void displaystudent(List<Student> thestudents) {
		for (Student tempStudent:thestudents) {
			System.out.println(tempStudent); 
		}
	}

}
