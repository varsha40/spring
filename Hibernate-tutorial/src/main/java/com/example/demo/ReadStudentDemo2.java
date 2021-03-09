package com.example.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.entity.Student;

public class ReadStudentDemo2 {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try {
			//use the session object to save the java object
			//create a Student object
			System.out.println("Creating new student object....");
			Student s4=new Student("megha","choudhury","megha@gmail.com");
			//start a transaction
			session.beginTransaction();
			//save the student object
			System.out.println("Saving the student"); 
			System.out.println(s4);
			session.save(s4);
			//commit transaction
			session.getTransaction().commit();
			
			
			
			System.out.println("saved student.generated id:"+s4.getId());
			//now get a new session and start transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			//retrieve student based on the id:primary key
			System.out.println("\n getting student with id"+s4.getId());
			Student mystudent=session.get(Student.class,s4.getId());
			System.out.println("Get complete:"+mystudent);
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		}
		finally {
			factory.close();
		}

	}

}
