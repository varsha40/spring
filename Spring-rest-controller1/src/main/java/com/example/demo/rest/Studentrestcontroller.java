package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class Studentrestcontroller {
	//RETURN LIST OF STUDENTS
	//define endpoint for"/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> theStudents=new ArrayList<>();
		theStudents.add(new Student("varsha","choudhury"));
		theStudents.add(new Student("megha","choudhury"));
		theStudents.add(new Student("trisha","choudhury"));
		
		return null;
	}
	
}
