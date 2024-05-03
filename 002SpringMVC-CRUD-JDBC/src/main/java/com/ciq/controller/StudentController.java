package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ciq.model.Student;
import com.ciq.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String Home() {
		return "home";
		
	}
	@RequestMapping("/addstudentfrom")
	public String addEmpForm() {
		return "addStudent";
	}
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveEmp(Student student) {
		System.out.println(student);
		studentService.add(student);
		return "redirect:/findAllStud";

}
	@RequestMapping("/findAllStud")
	public String findAllStudent(Model model) {
		List<Student> students = studentService.FindAll();
	   	model.addAttribute("students", students);
		return "findall";
	}
	
	@RequestMapping("/deleteStudentById")
	public String DeleteById(@RequestParam ("sid") Integer sid) {
		studentService.DeleteById(sid);
		return "redirect:/findAllStud";
	}
		
	@RequestMapping(value = "/updateStud", method = RequestMethod.POST)
	public String updateStudent(Student student) {
		System.out.println(student);
		studentService.UpdateById(student);
		return "redirect:/findAllStud";
	}
		@RequestMapping("/updateStudentById")
		public String updateStudentById(@RequestParam("sid") Integer sid, Model model) {
			Student student  = studentService.findById(sid);
			model.addAttribute("student",student);
			return "update";
		}
		
	}
