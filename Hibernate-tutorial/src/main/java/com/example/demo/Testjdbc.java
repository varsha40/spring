 package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {
	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String usr="hbstudent";
		String pass="hbstudent";
		try {
			System.out.println("Connecting to database"+jdbcUrl);
			Connection mycon=DriverManager.getConnection(jdbcUrl,usr,pass);
			System.out.println("Connection successfull");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
