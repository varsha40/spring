package com.example.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.entity.Student;

public class Querystudentdemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try {
			//use the session object to save the java object
			//create a Student object
			System.out.println("Creating new student object....");
			Student s=new Student("varsha","choudhury","varsha@gmail.com");
			//start a transaction
			session.beginTransaction();
			//save the student object
			System.out.println("Saving the student"); 
			session.save(s);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		}
		finally {
			factory.close();
		}

	}

}
