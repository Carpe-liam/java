package com.alex.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alex.models.Category;
import com.alex.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	// get all products
		ArrayList<Category> getAll();
	// get by id
		Category findCategoryById(Long categoyId);	
	// delete product
	    void deleteById(Long id);
    // Retrieves a list of all categories for a particular product
	    List<Category> findAllByProducts(Product product);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
	    List<Category> findByProductsNotContains(Product product);
}
