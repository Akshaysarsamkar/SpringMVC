package Springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Student;
import service.UserServices;

@Controller
public class DemoController {
	
	@Autowired
	private UserServices services;

	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("title", "Infornation");
		model.addAttribute("extra", "this is demo examle");
	}

	@RequestMapping("/about")
	public String showForm() {
		System.out.println("hello");
		return "about";
	}

	@RequestMapping("/senddata")
	public String senddata(@ModelAttribute("student") Student student) {
		int student2 = services.createStudent(student);
		System.out.println("Data added succefully " + student2);
		return "senddata";
	}

}

/*
 * 
 * 
 * @RequestMapping("/senddata") public String
 * senddata(@RequestParam("studentFirstname") String firstname,
 * 
 * @RequestParam("studentlastname") String lastname, @RequestParam("classname")
 * int id, Model model) {
 * 
 * Student student = new Student();
 * 
 * student.setFirstname(firstname); student.setLastname(lastname);
 * student.setClassname(id);
 * 
 * model.addAttribute("info",student);
 * 
 * // model.addAttribute("fn", firstname); // model.addAttribute("ln",
 * lastname); // model.addAttribute("cn", id);
 * 
 * return "senddata"; }
 * 
 */