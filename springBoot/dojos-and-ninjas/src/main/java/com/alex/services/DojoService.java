package com.alex.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alex.models.Dojo;
import com.alex.repositories.DojoRepository;

@Service
public class DojoService {
	
	
// dojo repository dependency
	private final DojoRepository dojoRepo;
	
// contructor
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
// return all dojos
	public ArrayList<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
// create dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
		
// get by ID
    public Dojo findDojo(Long id) {
        Optional<Dojo> dojo = dojoRepo.findById(id);
        if(dojo.isPresent()) {
            return dojo.get();
        } else {
            return null;
        }
    }
	
	
	
	
}
