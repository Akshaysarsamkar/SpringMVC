package Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

	@RequestMapping("/")
    public String home() {
        return "index"; // Maps to /WEB-INF/views/index.jsp
    }
	
	@RequestMapping("/add")
    public String add() {
        return "addition"; // Maps to /WEB-INF/views/addition.jsp
    }
}
