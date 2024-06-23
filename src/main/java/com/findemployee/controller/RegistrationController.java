package com.findemployee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.findemployee.dto.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String registrationPage(@ModelAttribute("userRegistration") UserRegistrationDTO userRegistrationDTO) {

		return "user-registration";
	}

	@RequestMapping("/registrationSuccess")
	public String registrationSucess(@ModelAttribute("userRegistration") UserRegistrationDTO userRegistrationDTO) {

		return "registration-success";
	}

}
