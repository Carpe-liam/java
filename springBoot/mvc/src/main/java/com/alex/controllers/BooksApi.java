package com.alex.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.models.Book;
import com.alex.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;
	
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
// return list of all books
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }

// create a book
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
// retrieve a book
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
// update a book
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
//        return book;
//    }
//
//// delete a book
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
//    public void destroy(@PathVariable("id") Long id) {
//        bookService.deleteBook(id);
//    }
}
