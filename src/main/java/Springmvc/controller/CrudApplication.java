package Springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import Dao.ProductDao;
import model.Product;

@Controller
public class CrudApplication {

	@Autowired
	private ProductDao dao;

	// SHOWDATA
	@RequestMapping("/")
	public String show(Model model) {
		List<Product> getalldata = dao.getalldata();
		model.addAttribute("data", getalldata);
		return "index2";
	}

	@RequestMapping("/note")
	public String addNote() {
		return "AddNotes";
	}

	// Add product
	@RequestMapping(path = "/showNotes")
	public String ShowallNotes(@ModelAttribute("notes") Product product) {
		if (product.getProduct_des().isBlank() || product.getName().isBlank()) {
			return "redirect:note";
		} else {
			dao.addnote(product);
			return "redirect:/";
		}
	}

	// delete product
	@RequestMapping("/delete/{id}")
	public RedirectView deletedata(@PathVariable("id") int pid, HttpServletRequest httpServletRequest) {
		this.dao.deletedata(pid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(httpServletRequest.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/update/{id}")
	public String updateproduct(@PathVariable("id") int pid, Model model) {
		Product singledata = dao.getSingledata(pid);
		System.out.println(singledata);
		model.addAttribute("up", singledata);
		return "Update_data";
	}

}
