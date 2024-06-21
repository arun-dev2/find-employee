package com.findemployee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.findemployee.dto.UserInfoDTO;

@Controller
public class FindEmployeeController {

	@RequestMapping("/")
	public String welcome(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "Welcome";
	}

	@RequestMapping("/process")
	public String processResult(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "Result";
	}
}
