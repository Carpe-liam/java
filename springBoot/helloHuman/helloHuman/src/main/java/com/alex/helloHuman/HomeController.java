package com.alex.helloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="n", required=false)String name, @RequestParam(value="ln", required=false)String last_name, @RequestParam(value="t", required=false)Integer count) {
		if(count == null) {
			count = 1;
		}
		
		String result = "";
		for(int i=0; i<count; i++) {
			if(name == null) {
				result += "Hello Human ";
			} else if(name != null && last_name == null) {
				result += "Hello " + name + " ";
			} else {
				result += "Hello " + name + " " + last_name + " ";
			}			
		}
		return result;
	}
}
