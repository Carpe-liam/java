package com.alex.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alex.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

	
// find all Dojos
	ArrayList<Ninja> findAll();
	
// get by ID
	Ninja getById(Long id);
	
// delete Ninja
	void deleteById(Long id);
	
// get ninjas by dojo


}
