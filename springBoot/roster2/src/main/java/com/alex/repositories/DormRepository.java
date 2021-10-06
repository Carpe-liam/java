package com.alex.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alex.models.Dorm;
import com.alex.models.Student;

@Repository
public interface DormRepository extends CrudRepository<Dorm, Long>{
	
// get all students
	ArrayList<Dorm> findAll();
// get by ID
	Dorm getById(Long id);
// delete
	void deleteById(Long id);
// add student
	//Student addStudentById(Long id);
}
