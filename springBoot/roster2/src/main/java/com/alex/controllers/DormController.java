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
import org.springframework.web.bind.annotation.RequestParam;

import com.alex.models.Dorm;
import com.alex.models.Student;
import com.alex.services.DormService;
import com.alex.services.StudentService;

@Controller
public class DormController {

	@Autowired
	DormService dormService;
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/dorms";
	}
	
	@RequestMapping("/dorms")
	public String home(Model model, @ModelAttribute("dorm")Dorm dorm) {
		ArrayList<Dorm> dorms = dormService.allDorms();
		model.addAttribute("dorms", dorms);
		return "index.jsp";
	}

	@PostMapping("/dorms/new")
	public String createDorm(@Valid @ModelAttribute("dorm")Dorm dorm, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		} else {
			dormService.createDorm(dorm);
			return "redirect:/dorms";
		}
	}
	
	@RequestMapping("/dorm/view/{id}")
	public String viewDorm(Model model, @PathVariable("id")Long id) {
		Dorm dorm = dormService.findDorm(id);
		model.addAttribute("dorm", dorm);
		ArrayList<Student> students = studentService.allStudents();
		model.addAttribute("students", students);
		System.out.println(dorm.getStudents());
		return "view.jsp";
	}
	
	@PostMapping("/dorm/add_student")
	public String addToDorm(@RequestParam(value="id")Long id,@RequestParam(value="dorm_id")Long dorm_id) {
		Dorm dorm = dormService.findDorm(dorm_id);
		studentService.updateStudentDorm(dorm, id);
		return "redirect:/dorm/view/"+dorm.getId();
	}
	
}
