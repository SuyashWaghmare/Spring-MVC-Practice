package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("Suyash");
	}

	@RequestMapping("/")
	public String landingPage() {
		System.out.println("landing page :: called");
		return "index";
	}

	@RequestMapping("/logpage")
	public String loginPage() {
		System.out.println("Login page :: called");
		return "login";
	}

	@RequestMapping("/regPage")
	public String regPage() {
		System.out.println("Reg page :: called");
		return "register";
	}

}
