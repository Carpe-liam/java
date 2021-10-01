package com.alex.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diakichi")
public class DiakichiController {
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure you are open to new ideas!"; 
	}
	
	@RequestMapping("/travel/{location}")
	public String travel(@PathVariable("location")String location) {
		return "Congrats! You will soon be traveling to " + location + "!"; 
	}
	
	@RequestMapping("/lotto/{value}")
	public String lotto(@PathVariable("value")Integer value) {
		if(value == 6) {
			return "You will take a grand journey in the near future, but be wary of of tempting offers.";
		} else if(value == 37) {
			return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
		} else {
			return "Ooooo boi, now is the best time to do something spicy in your life.";
		}
	}
	
	
	
	
	
	
	
	
}
