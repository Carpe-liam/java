package com.alex.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.alex.models.Category;
import com.alex.repositories.CategoryRepository;

public class CategoryService {
	
	@Autowired
	private CategoryRepository cRepo;
	
	
// =========== create//update ============
	public Category save(Category category) {
		return cRepo.save(category);
	}
	
	

// ============== Read ===================
	public ArrayList<Category> allCategories(){
		return cRepo.getAll();
	}

	
	
// ============== Delete =================
    public void deleteCategory(Long id) {
    	cRepo.deleteById(id);
    }
	
	
	
	
}
