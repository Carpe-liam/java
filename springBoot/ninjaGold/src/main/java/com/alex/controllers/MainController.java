package com.alex.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
	LocalDateTime time = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy - hh:mm a");
	String datetime = time.format(formatter);
	
// start of directory
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("ninjaGold") == null) {
			activityList.add(new Activity("Welcome to the Game"));
			session.setAttribute("ninjaGold", 0);
		}
		if((int) session.getAttribute("ninjaGold") < -120) {
			session.setAttribute("ninjaGold", null);
			session.setAttribute("loser", "For outstanding debts, you're taken to jail. You Lose!");
		}
		model.addAttribute("activityList", activityList);
		return "index.jsp";
	}
	
	@PostMapping("/farm")
	public String farm(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(20 - 10) + 10;
		current += random;
		activityList.add(new Activity("You entered a farm and found " + random + " gold. (" + datetime + ")"));
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	@PostMapping("/cave")
	public String cave(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(10 - 5) + 5;
		current += random;
		activityList.add(new Activity("You entered a cave and found " + random + " gold. (" + datetime + ")"));
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	@PostMapping("/house")
	public String house(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(5 - 2) + 2;
		current += random;
		activityList.add(new Activity("You entered a house and found " + random + " gold. (" + datetime + ")"));
		session.setAttribute("ninjaGold", current);
		return "redirect:/";
	}
	
	@PostMapping("/casino")
	public String casino(HttpSession session) {
		int current = (int) session.getAttribute("ninjaGold");
		int random = rand.nextInt(50 + 0);
			if(rand.nextInt((2-1)+1) == 1) {
				random = ((random-random)-random);
				activityList.add(new Activity("You entered a casino and lost " + random + " gold. (" + datetime + ")"));
			} else {
				current += random;			
				activityList.add(new Activity("You entered a casino and won " + random + " gold. (" + datetime + ")"));
			}
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
