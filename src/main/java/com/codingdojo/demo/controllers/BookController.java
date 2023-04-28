package com.codingdojo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.demo.models.Book;
import com.codingdojo.demo.services.BookService;

@Controller
public class BookController {
	@Autowired
	  private BookService bookService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		System.out.println(id);
        Book book = bookService.findBook(id);
        
        model.addAttribute("book", book);
        return "show.jsp";
	}
}
