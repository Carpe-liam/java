package com.alex.controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.models.Activity;


@Controller
public class MainController {
	
	Random rand = new Random();
	ArrayList<Activity> activityList = new ArrayList<Activity>();

	
// start of directory
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("ninjaGold") == null) {
			activityList.add(new Activity("Hello"));
			activityList.add(new Activity("Hello soisjsadfjkds;lkjsd"));
			session.setAttribute("ninjaGold", 0);
			model.addAttribute("activityList", activityList);
		}
		if((int) session.getAttribute("ninjaGold") < -120) {
			session.setAttribute("ninjaGold", null);
			session.setAttribute("loser", "For outstanding debts, you're taken to jail. You Lose!");
		}
		return "index.jsp";
	}
	
	@PostMapping("/farm")
	public String farm(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(20 - 10) + 10;
		current += random;
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	@PostMapping("/cave")
	public String cave(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(10 - 5) + 5;
		current += random;
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	@PostMapping("/house")
	public String house(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(5 - 2) + 2;
		current += random;
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	@PostMapping("/casino")
	public String casino(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(50 + 0);
			if(rand.nextInt((2-1)+1) == 1) {
				random = ((random-random)-random);
			}
		current += random;
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		if(session.getAttribute("ninjaGold") == null) {
			session.setAttribute("ninjaGold", 0);
		}
		int current = (int) session.getAttribute("ninjaGold");
		current =0;
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	
}
