package com.alex.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alex.authentication.UserDto;

@Controller
public class SignUpController {
    @ModelAttribute("user")
    public UserDto userDto() {
        return new UserDto();
    }

    @GetMapping
    public String showForm() {
        return "signup";
    }

    @PostMapping
    public String submitForm(@Valid @ModelAttribute("user") UserDto user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup";
        }
        return "success";
    }
}
