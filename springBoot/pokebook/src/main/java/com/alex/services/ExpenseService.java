package com.alex.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.alex.models.Expense;
import com.alex.repositories.ExpenseRepository;

@Service
public class ExpenseService {

//expense repository dependency
	private final ExpenseRepository expenseRepo;

// constructor
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}

// return all books
	public ArrayList<Expense> allExpenses(){
		return expenseRepo.findAll();
	}
	
// create expense
	public Expense createExpense(Expense exp) {
		return expenseRepo.save(exp);
	}
	
// get by ID
    public Expense findExpense(Long id) {
        Optional<Expense> expense = expenseRepo.findById(id);
        if(expense.isPresent()) {
            return expense.get();
        } else {
            return null;
        }
    }
    
// update expense
    public Expense updateExpense(Long id, String name, String vendor, double amount, String description) {
    	Expense editedExps = expenseRepo.getById(id);
    	editedExps.setName(name);
    	editedExps.setVendor(vendor);
    	editedExps.setAmount(amount);
    	editedExps.setDescription(description);
    	return expenseRepo.save(editedExps);
    }
    
// delete expense
    public void deleteExp(Long id) {
    	expenseRepo.deleteById(id);
    }
    
    
    
}
