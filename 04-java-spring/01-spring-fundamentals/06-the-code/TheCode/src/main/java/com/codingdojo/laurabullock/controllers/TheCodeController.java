package com.codingdojo.laurabullock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	
	//Create a page where a user can submit a code
	@RequestMapping("/")  //index page, page to enter the code
	public String index(@ModelAttribute("errors") String errors, Model method) {
		method.addAttribute("errors", errors);
		return "index.jsp";
	}
		
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="guess") String guess, RedirectAttributes redirectAttributes) {
		System.out.println(guess);
		if(guess.equals("bushido")) {
			System.out.println("Access Granted!");
			return "code.jsp";
		}
		
		else {
			redirectAttributes.addFlashAttribute("errors", "Access Denied.  You must train harder!");
			System.out.println("Incorrect guess.  Access Denied!");
			return "redirect:/";
		}
	}
}


