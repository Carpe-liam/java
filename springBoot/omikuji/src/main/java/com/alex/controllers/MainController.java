package com.alex.controllers;

import java.lang.reflect.Method;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/sentInfo")
	public String info(
			HttpSession session,
			@RequestParam(value="years") Integer years,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="liveThing") String livingThing,
			@RequestParam(value="niceSay") String niceSay
			) {
	// session variables
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("liveThing", livingThing);
		session.setAttribute("niceSay", niceSay);
		
		
		return "redirect:/display";
	}
	
	@RequestMapping("/display")
	public String display() {
		return "display.jsp";
	}
}
