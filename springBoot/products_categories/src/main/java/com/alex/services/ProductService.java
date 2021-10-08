package com.alex.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.alex.models.Product;
import com.alex.repositories.ProductRepository;

public class ProductService {

	@Autowired
	private ProductRepository pRepo;
	
// =========== create//update ============
	public Product save(Product product) {
		return pRepo.save(product);
	}
	
	

// ============== Read ===================
	public ArrayList<Product> allProducts(){
		return pRepo.getAll();
	}

	
	
// ============== Delete =================
    public void deleteProduct(Long id) {
    	pRepo.deleteById(id);
    }
	
}
