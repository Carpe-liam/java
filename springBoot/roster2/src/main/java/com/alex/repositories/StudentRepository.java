package com.alex.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alex.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	
// get all students
	ArrayList<Student> findAll();
// get by ID
	Student getById(Long id);
// delete
	void deleteById(Long id);


}
