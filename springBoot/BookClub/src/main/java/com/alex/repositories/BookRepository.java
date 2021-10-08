package com.alex.repositories;


import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.alex.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

// get all books
	ArrayList<Book> findAll();
 
// get by id	
    Book getById(Long id);	
    
// delete book
    void deleteById(Long id);
    
}
