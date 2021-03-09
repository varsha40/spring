package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class Helloworldcontroller {
	// need a controller method to show the html form
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	//need a controller method to process the form
	@RequestMapping("/processform")
	public String processform() {
		return "helloworld";
	}
	//a method to read form data and 
	//add data to the model
	@RequestMapping("/processformversion2")
	public String letsShoutdude(HttpServletRequest req,Model model) {
		//read  the request parameter from the html form
		String name=req.getParameter("studentname");
		//convert the data to all caps
		name=name.toUpperCase();
		//create the message
		String result="Yo! "+name;
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
} 
	@RequestMapping("/processformversion3")
	public String letsShout(@RequestParam("studentname") String name,Model model) {
		//convert the data to all caps
		name=name.toUpperCase();
		//create the message
		String result="Hello! "+name;
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
} 
}
