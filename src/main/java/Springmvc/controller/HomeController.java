package Springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Springmvc.Entity.Cource;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {

		// Sending data from controller to view
		/*
		 * through 2 class we can do this 1] model using this class we can send data
		 * from controller to view for this purpose used addAttribute(String key ,object
		 * value) method it take 2 argument first is String means attribute name using
		 * this name access data view easily other is value means which value we need to
		 * pass give here it is in the form of object like Person Integer,collection etc
		 * 
		 * sysntax := model.addAttribute(String key ,object value)
		 * 
		 * 
		 * 2] modelAndView:- using this class we can send data from controller to view
		 * for this purpose used addObject(String key ,object value) method it take 2
		 * argument first is String means attribute name using this name access data
		 * view easily other is value means which value we need to pass give here it is
		 * in the form of object like Person Integer,collection etc
		 * 
		 * sysntax := modelAndView.addObject(String key ,object value)
		 */
		// sending value
		model.addAttribute("Name", "Spring MVC");

		// sending class object
		Cource cource = new Cource();

		cource.setCourceid(12);
		cource.setCourcename("Spring");
		cource.setFee(45000.98f);

		model.addAttribute("Courcename", cource);

		// sending Collection
		List<String> cources = new ArrayList<String>();

		cources.add("Spring Core");
		cources.add("Spring Jdbc");
		cources.add("Spring ORM");
		cources.add("Spring MVC");
		model.addAttribute("allcources", cources);
		return "index"; // Maps to /WEB-INF/views/index.jsp
	}

	@RequestMapping("/add")
	public ModelAndView add() {

		ModelAndView res = new ModelAndView();
		res.setViewName("addition");
		res.addObject("language","Java");

		Cource cource1 = new Cource();
		cource1.setCourceid(78);
		cource1.setCourcename("PHP");
		cource1.setFee(89552f);
		
		res.addObject("c1",cource1);
		
		
		return res; // Maps to /WEB-INF/views/addition.jsp
	}
	
	@RequestMapping("/help")
	public String Help(Model model) {
		
		model.addAttribute("Ex","JEE");
		
		return "help";
	}
}

// 5 stape to create Spring mvc application 

//1] configure dispatcher servlet in web.xml
//2] create Spring config.xml file 
//3] create viewResolver 
//4] create controller 
//5] create view to show