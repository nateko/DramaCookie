package com.nexyliya.dramacookie.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@Value("${spring.application.name}")
    String appName;
	
	@RequestMapping("/")
	public String getBase(Model model) {
		model.addAttribute("appName", appName);
        return "home";
	}

	@RequestMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("appName", appName);
        return "home";
	}
	
	@RequestMapping("/contact")
	public String getContact(Model model) {
		model.addAttribute("appName", appName);
        return "contact";
	}
	
	@RequestMapping("/about")
	public String getAbout(Model model) {
		model.addAttribute("appName", appName);
        return "about";
	}
	
	@RequestMapping("/faq")
	public String getFaq(Model model) {
		model.addAttribute("appName", appName);
        return "faq";
	}
}
