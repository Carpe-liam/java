package com.alex.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.alex.models.Ninja;
import com.alex.repositories.NinjaRepository;

@Service
public class NinjaService {

// ninja repository dependency
	private final NinjaRepository ninjaRepo;
	
// contructor
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
// return all ninjas
	public ArrayList<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}

// create ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
}
