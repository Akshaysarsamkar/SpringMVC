package Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.Student1;

@Controller
public class ComplexFormHandler {

	@RequestMapping("/form")
	public String Form() {
		return "Complex";
	}

	@RequestMapping(path = "/data1", method = RequestMethod.POST)
	public String fetchData(@ModelAttribute("student1") Student1 student1, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "Complex";
		}
		System.out.println(student1);
		System.out.println(student1.getAddress());
		return "show1";
	}

}
