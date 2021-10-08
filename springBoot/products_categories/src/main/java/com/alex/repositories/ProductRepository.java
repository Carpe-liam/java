package com.alex.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.alex.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

// get all products
	ArrayList<Product> getAll();
// get by id
    Product getById(Long id);	
// delete product
    void deleteById(Long id);
	
}
