package com.springs.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String studentForm(Model model)
	{
		Student s1=new Student();
		model.addAttribute("student", s1);
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String process(@ModelAttribute("student")Student s2)
	{
		return "student-confirmation";
	}
	
//	@RequestMapping("/showForm")
//	public String showForm(Model model) {
//	
//		//create a new student object
//		Student theStudent=new Student();
//		
//		//add student object to model 
//		model.addAttribute("student",theStudent);
//
//		return "student-form";
//	}
//	
//	@RequestMapping("/processForm")
//	public String processForm(@ModelAttribute("student")Student thStudent) {
//
//		System.out.println("theStudent: "+thStudent.getStudentId()+" "+thStudent.getStudentName());
//		return "student-confirmation";
//	}

}

