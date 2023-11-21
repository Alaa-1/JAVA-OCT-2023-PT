package com.alaa.apicrud.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alaa.apicrud.models.Book;
import com.alaa.apicrud.services.BookService;

@RestController
public class BookController {

	// Dependency Injection
    private final BookService bookService;
    
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    // READ ALL
	@RequestMapping("/api/books")
	public List<Book> index(){
		
		return bookService.allBooks();
	}
	
	// CREATE A BOOK
	@RequestMapping(value="/api/books", method = RequestMethod.POST)
	public Book create(@RequestParam("title") String title,
			@RequestParam("description") String desc,
			@RequestParam("language") String lang,
			@RequestParam("numberOfPages") Integer numOfPages) {
	
	
	Book newlyCreatedBook = new Book(title, desc, lang, numOfPages);
	return bookService.createBook(newlyCreatedBook);
	}
	
	// FIND BY ID
	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book foundBook = bookService.findBook(id);
		
		return foundBook;
	}
	
}
