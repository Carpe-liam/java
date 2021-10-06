package com.alex.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.models.Dojo;
import com.alex.models.Ninja;
import com.alex.services.DojoService;
import com.alex.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	NinjaService ninjaServ;
	@Autowired
	DojoService dojoService;
	
	@RequestMapping("/new_ninja")
	public String newNinja(Model model, @ModelAttribute("ninja")Ninja ninja) {
		ArrayList<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		ArrayList<Ninja> ninjas = ninjaServ.allNinjas();
		model.addAttribute("ninjas", ninjas);
		return "newNinja.jsp";
	}
	
	@PostMapping("/create_ninja")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("errors");
			return "newNinja.jsp";
		}else {
			ninjaServ.createNinja(ninja);
			System.out.println("no errors");
			return "redirect:/dojos";
		}
	}
	
	
	
	
}
