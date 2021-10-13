package com.alex.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.models.Category;
import com.alex.models.Product;
import com.alex.repositories.CategoryRepository;
import com.alex.repositories.ProductRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository cRepo;
	
	@Autowired
	private ProductRepository pRepo;

	
// =========== create//update ============
	public Category save(Category category) {
		return cRepo.save(category);
	}
	

// ============== Read ===================
	public ArrayList<Category> allCategories(){
		return cRepo.findAll();
	}
	
	public Category getCategoryById(Long id) {
        return this.cRepo.findById(id).orElse(null);
    }

	public Product getProductById(Long id) {
        return this.pRepo.findById(id).orElse(null);
    }
	
	public List<Category> productNotCategories(Product product){
		return cRepo.findByProductsNotContains(product);
	}
	
// ============== Delete =================
    public void deleteCategory(Long id) {
    	cRepo.deleteById(id);
    }
    
	
// ============== Learn Plat ===============	
    public void addCategoryToProduct(Long categoryId, Long productId) {
    	
    // retrieve an instance of a category using another method in the service.
    Category thisCategory = getCategoryById(categoryId);
    
    // retrieve an instance of a product using another method in the service.
    Product thisProduct = getProductById(productId);
    
    // add the product to this category's list of products
    thisCategory.getProducts().add(thisProduct);
    
    // Save thisCategory, since you made changes to its product list.
    cRepo.save(thisCategory);	
    
    }
	
	
}
