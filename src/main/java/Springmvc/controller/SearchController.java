package Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String Searchkeyword() {
		return "search";
	}

	@RequestMapping(path = "/searchdata", method = RequestMethod.POST)
	public RedirectView searchkeyword(@RequestParam("query") String query, Model m) {
		RedirectView view = new RedirectView();
		System.out.println(query);
		if (query.isBlank()) {
			m.addAttribute("msg", "Enter the keyword");
			view.setUrl("search");
			return view;
		} else {
			String res = "https://www.google.com/search?q=" + query;
			view.setUrl(res);
			return view;
		}

	}
}
