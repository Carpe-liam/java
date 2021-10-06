package com.alex.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alex.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{

// find all Dojos
	ArrayList<Dojo> findAll();
	
// get by ID
	Dojo getById(Long id);
	
// delete dojo
	void deleteById(Long id);
	
}
