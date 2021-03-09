package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String showpage() {
		return "main-menu";
	}

}
