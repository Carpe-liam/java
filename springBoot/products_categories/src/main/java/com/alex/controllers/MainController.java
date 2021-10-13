package com.alex.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alex.models.Category;
import com.alex.models.Product;
import com.alex.services.CategoryService;
import com.alex.services.ProductService;

@Controller
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
	
	
// ========= Views/Directors for categories ===========
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("category")Category category) {
		return "newCategory.jsp";
	}
	
	@GetMapping("/products/new")
	public String newProd(@ModelAttribute("product")Product product) {
		return "newProd.jsp";
	}
	
	@GetMapping("/products/{id}")
	public String viewProd(@PathVariable("id")Long id, Model model, @ModelAttribute("category")Category category) {
		Product product = pServ.getProductById(id);
		model.addAttribute("product", product);
		List<Category> categories = cServ.productNotCategories(product);
		model.addAttribute("categories", categories);
		return "viewProd.jsp";
	}

	@GetMapping("/categories/{id}")
	public String viewCateg(@PathVariable("id")Long id, Model model, @ModelAttribute("product")Product product) {
		Category category = cServ.getCategoryById(id);
		model.addAttribute("category", category);
		List<Product> products = pServ.categoryNotProducts(category);
		model.addAttribute("products", products);
		return "viewCat.jsp";
	}
	
	
	
// ============== Actions ===============
	
	@PostMapping("/create_product")
	public String newProd(@ModelAttribute("product") Product product, Model model) {
		pServ.save(product);
		return "redirect:/products";
	}

	@PostMapping("/create_category")
	public String newProd(@ModelAttribute("category") Category category, Model model) {
		cServ.save(category);
		return "redirect:/products";
	}
	
	@PostMapping("/add_category/{id}")
	public String addCat(@PathVariable("id")Long id, Model model, @RequestParam("category_id")Long category_id) {
		cServ.addCategoryToProduct(category_id, id);
		return "redirect:/products";
	}
	
	@PostMapping("/add_product/{id}")
	public String addProd(@PathVariable("id")Long id, Model model, @RequestParam("product_id")Long product_id) {
		pServ.addProductToCategory(id, product_id);
		return "redirect:/products";
	}
	
	
	
}
