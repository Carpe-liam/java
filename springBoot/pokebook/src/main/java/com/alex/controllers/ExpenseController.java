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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alex.models.Expense;
import com.alex.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public String route() {
		return "redirect:/expenses";
	}	
	
	@RequestMapping("/expenses")
	public String index(Model model, @ModelAttribute("expense")Expense expense) {
		ArrayList<Expense> expenses = expenseService.allExpenses();
		System.out.println("----------------------------");
		System.out.println(expenses);
		System.out.println("----------------------------");
		model.addAttribute("expenses",expenses);
		return "index.jsp";
	}
	
	@PostMapping("/new_expense")
	public String add_expense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result ) {
		if(result.hasErrors()) {
			System.out.println("errors");
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			System.out.println("no errors");
			return "redirect:/expenses";
		}
	}
	
	
	@RequestMapping("expenses/{id}")
	public String show(Model model, @PathVariable("id")Long id) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "show.jsp";
	}
	
	
	
	@RequestMapping("/expense/{id}/edit")
	public String edit_expense(Model model, @PathVariable("id") Long id) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	@PutMapping("/update/{id}")
	public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result,
			@RequestParam(value="id")Long id,
			@RequestParam(value="name") String name,
			@RequestParam(value="vendor") String vendor,
			@RequestParam(value="amount") double amount,
			@RequestParam(value="description") String description			
			) {
		if(result.hasErrors()) {
			System.out.println("errors");
			return "index.jsp";
		}else {
			expenseService.updateExpense(id, name, vendor, amount, description);
			System.out.println("no errors");
			return "redirect:/expenses";
		}
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public String deleteExp(@PathVariable("id")Long id) {
		expenseService.deleteExp(id);
    	return "redirect:/expenses";
    }
    
	
	
}
