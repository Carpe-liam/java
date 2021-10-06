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
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.models.Dojo;
import com.alex.services.DojoService;

@Controller
public class DojoController {
	
	@Autowired
	DojoService dojoService;
	
	@RequestMapping("/")
	public String route() {
		return "redirect:/dojos";
	}
	
	@RequestMapping("/dojos")
	public String home(Model model, @ModelAttribute("dojo") Dojo dojo) {
		ArrayList<Dojo> dojos = dojoService.allDojos();
		System.out.println(dojos);
		model.addAttribute("dojos", dojos);
		System.out.println("added");
		return "index.jsp";
	}
	
	@PostMapping("/new_dojo")
	public String add_dojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("errors");
			return "index.jsp";
		}else {
			dojoService.createDojo(dojo);
			System.out.println("no errors");
			return "redirect:/dojos";
		}
	}
	
	@RequestMapping("/dojo/view/{id}")
	public String view(Model model, @PathVariable("id")Long id) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "view-dojo.jsp";
	}
	
	
	
}
