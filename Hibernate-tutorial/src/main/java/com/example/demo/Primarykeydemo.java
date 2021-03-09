package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.entity.Student;

public class Primarykeydemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try {
			//use the session object to save the java object
			//create 3 Student object
			System.out.println("Creating new student object....");
			Student s1=new Student("varsha","choudhury","varsha@gmail.com");
			Student s2=new Student("ankita","pattnayak","ankita@gmail.com");
			Student s3=new Student("medha","raj","medha@gmail.com");
			//start a transaction
			session.beginTransaction();
			//save the student object
			System.out.println("Saving the students..."); 
			session.save(s1);
			session.save(s2);
			session.save(s3);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		}
		finally {
			factory.close();
		}


	}

}
