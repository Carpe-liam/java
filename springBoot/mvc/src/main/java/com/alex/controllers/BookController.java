package com.alex.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.alex.models.Book;
import com.alex.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public String index(Model model) {
		
		ArrayList<Book> books = bookService.allBooks();
		model.addAttribute("books",books);
		
		
		return "index.jsp";
	}
	
	
	@GetMapping("/books/{bookId}")
	public String show(Model model, @PathVariable("bookId") Long bookId) {
		
		Book book = bookService.findBook(bookId);
		model.addAttribute(book);
		
		return "showBook.jsp";
	}
}
