package com.alex.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.alex.models.Category;
import com.alex.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	// get all products
		ArrayList<Product> findAll();
		
	// get by id
	    Product findProductById(Long id);	
	    
	// delete product
	    void deleteById(Long id);
	    
	// Retrieves a list of all categories for a particular product
	    List<Product> findAllByCategories(Category category);
	    
	// Retrieves a list of any categories a particular product
	// does not belong to.
	    List<Product> findByCategoriesNotContains(Category category);
    
}
