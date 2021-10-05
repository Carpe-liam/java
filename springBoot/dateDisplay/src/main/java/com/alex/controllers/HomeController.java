package com.alex.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("c, dd MMMM, yyyy - hh:mm a");
		String datetime = time.format(formatter);
		model.addAttribute("date", datetime);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		String datetime = time.format(formatter);
		model.addAttribute("time", datetime);
		return "time.jsp";
	}
}
