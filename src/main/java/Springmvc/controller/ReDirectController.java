package Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectController {

	@RequestMapping("/first")
	public String First() {
		System.out.println("inside first page");
		return "redirect:second";

	}

	@RequestMapping("/second")
	public String second() {
		System.out.println("inside secnd page");
		return "second";

	}

	@RequestMapping("/first1")
	public RedirectView First1() {
		System.out.println("inside first1 page");
		RedirectView view = new RedirectView();
		view.setUrl("https://www.google.com");
		return view;
	}
}
