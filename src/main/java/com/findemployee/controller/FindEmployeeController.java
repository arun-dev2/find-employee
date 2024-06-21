package com.findemployee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.findemployee.dto.UserInfoDTO;

@Controller
public class FindEmployeeController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}

	@RequestMapping("/process")
	public String processResult(UserInfoDTO userInfoDTO, Model model) {
		model.addAttribute(userInfoDTO);
		return "Result";
	}
}
