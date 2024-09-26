package Springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Order;
import service.orderService;

@Controller
public class orderController {

	@Autowired
	public orderService orderService;
	
	
	@RequestMapping("/order")
	public String takeorder() {
		return "Order";
	}

	@RequestMapping(path="/check",method = RequestMethod.POST)
	public String checkdata(@ModelAttribute Order order) {
		System.out.println("...........................");
		orderService.createorder(order);
		return "check";
	}
	
}
