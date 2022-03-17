package com.vehicle.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.User;
@RestController
public class Controller {

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/login")
	public String adminPage(@ModelAttribute("user") User user) {
		System.out.println("**********************" + user + "**********************************");

		return "admin_home";
	}

	@PostMapping("/register")
	public String registerPage(@ModelAttribute("user") User user) {
		System.out.println("**********************" + user + "**********************************");
		return "redirect:/";
	}

}
