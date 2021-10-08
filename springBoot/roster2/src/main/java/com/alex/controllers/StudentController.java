package com.alex.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alex.models.Student;
import com.alex.services.DormService;
import com.alex.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	DormService dormService;
	@Autowired
	StudentService studentService;
	

}
