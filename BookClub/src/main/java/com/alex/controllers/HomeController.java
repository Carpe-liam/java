package com.alex.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.alex.models.Book;
import com.alex.models.LoginUser;
import com.alex.models.User;
import com.alex.services.BookService;
import com.alex.services.UserService;

@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    
    @Autowired
    private BookService bookServ;
    
// ================= LOGIN ====================
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }

    @GetMapping("/logout")
    public String home(HttpSession session) {
    	session.removeAttribute("user_id");
    	return "redirect:/";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        userServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        return "redirect:/books";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("user_id", user.getId());
        return "redirect:/books";
    }

// ================= books & user ===================
    
    @GetMapping("/books")
    public String booksHome(HttpSession session, Model model) {
    	Long user_id = (Long) session.getAttribute("user_id");
    	User user = userServ.findUser(user_id);
    	model.addAttribute("user", user);
    	ArrayList<Book> books = bookServ.allBooks();
    	model.addAttribute("books", books);
    	return "books.jsp";
    }
    
    @GetMapping("/books/new")
    public String makeBook(Model model, HttpSession session, @ModelAttribute("book")Book book) {
//    	for use with hidden input
    	Long user_id = (Long) session.getAttribute("user_id");
    	User user = userServ.findUser(user_id);
    	model.addAttribute("user", user);
    	return "newbook.jsp";
    }
    
    @GetMapping("/books/{id}")
    public String viewBook( @PathVariable("id")Long id, Model model, HttpSession session) {
    	Long user_id = (Long) session.getAttribute("user_id");
    	User user = userServ.findUser(user_id);
    	model.addAttribute("user", user);
    	Book book = bookServ.findBook(id);
    	model.addAttribute("book", book);
    	return "view.jsp";
    }
    
    @GetMapping("/books/{id}/edit")
    public String editBook(@PathVariable("id")Long id, Model model, HttpSession session) {
    	Long user_id = (Long) session.getAttribute("user_id");
    	User user = userServ.findUser(user_id);
    	model.addAttribute("user", user);
    	Book book = bookServ.findBook(id);
    	model.addAttribute("book", book);
    	return "edit.jsp";
    }
    
    @PostMapping("/new_book")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
        if(result.hasErrors()) {
        	model.addAttribute("book", book);
            return "newbook.jsp";
        } else {
        	User user = userServ.findUser((Long) session.getAttribute("user_id"));
        	book.setUser(user);
        	bookServ.save(book);
        	return "redirect:/books";
        }
    }
        
        
    @PostMapping("/books/{id}/update")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session,
    		@PathVariable("id") Long id) {
    	if(result.hasErrors()) {
        	Long user_id = (Long) session.getAttribute("user_id");
        	User user = userServ.findUser(user_id);
        	model.addAttribute("user", user);
    		model.addAttribute("book", book);
    		return "edit.jsp";
    	} else {
        	User user = userServ.findUser((Long) session.getAttribute("user_id"));
        	book.setUser(user);
    		bookServ.save(book);
    		return "redirect:/books/" +id;
    	}
    }


    
    
    
    
    
    
    
    
    
    
}
