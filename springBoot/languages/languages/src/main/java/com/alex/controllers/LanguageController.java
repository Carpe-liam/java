package com.alex.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alex.models.Language;
import com.alex.services.LanguageService;

@Controller
public class LanguageController {
	
	@Autowired
	LanguageService langService;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/languages";
	}

//  home page- gets all languages
	@RequestMapping("/languages")
	public String home(Model model, @ModelAttribute("language")Language language) {
		ArrayList<Language> languages = langService.allLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
// create language
	@PostMapping("/new_language")
	public String add_lang(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		} else {
			langService.createLanguage(language);
			return "redirect:/languages";
		}
	}

// view language
	@RequestMapping("/languages/{id}")
	public String view(Model model, @PathVariable("id") Long id) {
		Language language = langService.findLanguage(id);
		model.addAttribute(language);
		
		return "view.jsp";
	}

// display edit page
	@RequestMapping("languages/edit/{id}")
	public String edit(Model model, @PathVariable("id")Long id) {
		Language language = langService.findLanguage(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}

// update language
	@PutMapping("edit_language/{id}")
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result,
			@PathVariable(value="id")Long id,
			@RequestParam(value="name")String name, 
			@RequestParam(value="creator")String creator,
			@RequestParam(value="version")double version			
			) {
		if(result.hasErrors()) {
			return "edit.jsp";
		} else {
			langService.updateLanguage(id, name, creator, version);
			return "redirect:/languages";
		}
		
	}
	
	
// delete language
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteLangugage(@PathVariable("id")Long id) {
		langService.deleteLang(id);
		return "redirect:/languages";
	}
	
	
}
