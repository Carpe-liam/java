package com.alex.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String index(HttpSession	session) {
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter1(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int currCount = (int) session.getAttribute("count");
			currCount++;
			session.setAttribute("count", currCount);
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/countTwo")
	public String counter2(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			int currCount = (int) session.getAttribute("count");
			currCount= currCount+2;
			session.setAttribute("count", currCount);
		}
		return "upTwo.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session, Model model) {
		session.setAttribute("count", 0);
		return "index.jsp";
	}
	
}
