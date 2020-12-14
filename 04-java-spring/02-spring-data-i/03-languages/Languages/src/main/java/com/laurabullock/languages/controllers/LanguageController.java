package com.laurabullock.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;

import com.laurabullock.languages.models.Language;
import com.laurabullock.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService langService;

	//Get All Languages

	@GetMapping("/languages") //localhost:8080
	public String index(@ModelAttribute("language") Language language, Model model) {
		List<Language> allLanguages = this.langService.getAllLanguages();
		model.addAttribute("allLanguages", allLanguages);
		return "index.jsp";	
	}
	
	
	//Create A Language
	@GetMapping("/languages/add")  // can not have the same path for the GET POST PUT DELETE method)
	public String addLanguage(@ModelAttribute("language") Language language, Model model) {
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	//@Valid annotation checks to see if the submitted object passes validation
	public String addL(@Valid @ModelAttribute("language") Language language, BindingResult result) {

		if(result.hasErrors()) {
			return "index.jsp";  //going to WEB-INF file
		}
		this.langService.createLanguage(language);
		return "redirect:/languages";
	}
	
	//Get One Language (Read)
	@GetMapping("/languages/{id}")
	public String findById(@ModelAttribute("language") Language language, Model model, @PathVariable("id") Long id) {
		Language singleLanguage = this.langService.getSingleLanguage(id);
		model.addAttribute("language", singleLanguage);
		return "displayLanguage.jsp";
	}
	
	//Update A Language
	@GetMapping("/languages/edit/{id}")
	public String updateLanguage(@PathVariable("id") Long id, Model model, @ModelAttribute("lanuage") Language language) {
		model.addAttribute("language", langService.getSingleLanguage(id));
		return "edit.jsp";
	}
	@PostMapping("languages/edit/{id}")
	public String editLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model model) {
		Long languageId = language.getId();
		if(result.hasErrors()) {			
			return "edit.jsp";
		}
		this.langService.updateLanguage(language);
		System.out.println("Language Successfully Updated!");
		return "redirect:/languages/" + languageId;
	}
	
	//Delete A Language
	@GetMapping("/languages/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.langService.deleteLanguage(id);
		return "redirect:/languages";
	}
}
