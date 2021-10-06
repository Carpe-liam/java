package com.alex.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alex.models.Dorm;
import com.alex.repositories.DormRepository;

@Service
public class DormService {

	private final DormRepository dormRepo;
	
// constructor
	public DormService(DormRepository dormRepo) {
		this.dormRepo = dormRepo;
	}

// return all dorms
	public ArrayList<Dorm> allDorms(){
		return dormRepo.findAll();
	}

// create student
	public Dorm createDorm(Dorm	dorm) {
		return dormRepo.save(dorm);
	}
		
// get by ID
    public Dorm findDorm(Long id) {
        Optional<Dorm> dorm = dormRepo.findById(id);
        if(dorm.isPresent()) {
            return dorm.get();
        } else {
            return null;
        }
    }
	
// delete
    public void deleteDorm(Long id) {
    	dormRepo.deleteById(id);
    }
	
// add student
//    public void addStudent(Long id) {
//    	dormRepo.addStudentById(id);
//    }
    
    
}
