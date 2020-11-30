package com.codingdojo.laurabullock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Create an app that will render a page with either a default value of "human" or with the name provided in the URL query string.

@Controller
public class HelloHumanController {
	
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="Human") String name){ 
		System.out.println(name);
		model.addAttribute("user", name);
		return "index.jsp";
	}	
}
