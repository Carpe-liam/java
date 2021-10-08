package com.alex.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.alex.models.Category;
import com.alex.models.Product;
import com.alex.services.CategoryService;
import com.alex.services.ProductService;

public class MainController {

	@Autowired
	private ProductService pServ;
	
	@Autowired
	private CategoryService cServ;
	
	
// ========= Views/Directors for products ===========
	@GetMapping("/")
	public String con() {
		return "redirect:/products";
	}
	
	@GetMapping("/products")
	public String home(Model model) {
		ArrayList<Product> products = pServ.allProducts();
		model.addAttribute("products", products);
		ArrayList<Category> categories = cServ.allCategories();
		model.addAttribute("categories", categories);
		return "index.jsp";
	}
	
	@GetMapping("/products/new")
	public String newProd(@ModelAttribute("product")Product product) {
		return "newProd.jsp";
	}
	
// ========= Views/Directors for categories ===========
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("category")Category category) {
		return "newCategory.jsp";
	}
	
	
	
	
// ============== Actions ===============
	
	
	
	
	
	
	
	
}
