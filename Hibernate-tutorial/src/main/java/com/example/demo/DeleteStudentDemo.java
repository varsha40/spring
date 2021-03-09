package com.example.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try {
			int studentId=1;
			session=factory.getCurrentSession();
			session.beginTransaction();
			//retrieve student based on the id:primary key
			System.out.println("\n getting student with id"+studentId);
			Student mystudent=session.get(Student.class,studentId);
			//delete student
			System.out.println("deleteing student");
			//deleting student with id=2
			session.createQuery("delete from Student where id=2").executeUpdate();
//			session.delete(mystudent);
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		}
		finally {
			factory.close();
		}

	}

}
