package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldDemo {

	@RequestMapping("/you")
	public ModelAndView Sayhello(@RequestParam("name")String name) {
		return new ModelAndView("hello","name",name);
		
	}
	
	@RequestMapping("/hello")
	public ModelAndView Saywelcom() {
		String name="BhargavRam";
		return new ModelAndView("welcom","name",name);
		
	}

}