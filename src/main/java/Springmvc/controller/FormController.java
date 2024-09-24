package Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/form")
public class FormController {

	@RequestMapping(path = "/abc")
	public String FetchData() {
		return "contact";
	}

	@RequestMapping(path = "/processdata" ,method= RequestMethod.POST)
	public String Handledata(@RequestParam("firstname") String name, @RequestParam("number") int number,Model model) {

		System.out.println(name);
		System.out.println(number);
		
		model.addAttribute("name",name);
		model.addAttribute("num" , number);
		
		
		return "contact";

	}

}
