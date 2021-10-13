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
public class ProductService {

	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CategoryRepository cRepo;
	
// =========== create//update ============
	public Product save(Product product) {
		return pRepo.save(product);
	}
	
	

// ============== Read ===================
	public ArrayList<Product> allProducts(){
		return pRepo.findAll();
	}

	public Category getCategoryById(Long id) {
        return this.cRepo.findById(id).orElse(null);
    }

	public Product getProductById(Long id) {
        return this.pRepo.findById(id).orElse(null);
    }
	
	public List<Product> categoryNotProducts(Category category){
		return pRepo.findByCategoriesNotContains(category);
	}
	
// ============== Delete =================
    public void deleteProduct(Long id) {
    	pRepo.deleteById(id);
    }
	
    
// ============== Learn Plat ===============	
    public void addProductToCategory(Long categoryId, Long productId) {
    	
// retrieve an instance of a category using another method in the service.
    Category thisCategory = getCategoryById(categoryId);
// retrieve an instance of a product using another method in the service.
    Product thisProduct = getProductById(productId);
// add the category to this products's list of categories
    thisProduct.getCategories().add(thisCategory);	
// Save thisProduct, since you made changes to its category list.	
    pRepo.save(thisProduct);
        
    }
	
}
