package com.alex.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alex.models.Dorm;
import com.alex.models.Student;
import com.alex.repositories.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepo;
	
// constructor
	public StudentService(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}
	
// return all students
	public ArrayList<Student> allStudents(){
		return studentRepo.findAll();
	}
	
// create student
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
		
// get by ID
    public Student findStudent(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        if(student.isPresent()) {
            return student.get();
        } else {
            return null;
        }
    }
	
// update student
    public Student updateStudentDorm(Dorm dorm, Long id) {
    	Student editStudent = studentRepo.getById(id);
    	editStudent.setDorm(dorm);
    	return studentRepo.save(editStudent);
    }

    
    
    
    
// delete
    public void deleteStudent(Long id) {
    	studentRepo.deleteById(id);
    }
	
	
}
