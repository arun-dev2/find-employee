package com.findemployee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindEmployeeController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}

	@RequestMapping("/process")
	public String processResult(@RequestParam("cname") String candidateName, @RequestParam("rname") String roleName,
			Model model) {
		model.addAttribute("cname", candidateName);
		model.addAttribute("rname", roleName);
		return "Result";
	}
}
