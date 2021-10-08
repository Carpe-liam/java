package com.alex.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.models.Book;
import com.alex.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;
	
    
// ========= create//update ============ 
    public Book save(Book book) {
    	return bookRepo.save(book);
    }    
    
// ============ Read ===================
    public ArrayList<Book> allBooks(){
    	return bookRepo.findAll();
    }

    // find book by id
    public Book findBook(Long id) {
        Optional<Book> book = bookRepo.findById(id);
        if(book.isPresent()) {
            return book.get();
        } else {
            return null;
        }
    }

// ======== Delete
    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }

}
