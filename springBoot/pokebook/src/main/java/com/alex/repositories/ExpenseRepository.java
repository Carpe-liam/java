package com.alex.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alex.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	
// get all expenses
	ArrayList<Expense> findAll();

// get by ID
	Expense getById(Long id);
	
// delete expense
	void deleteById(Long id);
}
