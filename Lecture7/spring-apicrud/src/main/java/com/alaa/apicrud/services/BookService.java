package com.alaa.apicrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alaa.apicrud.models.Book;
import com.alaa.apicrud.repositories.BookRepository;

@Service
public class BookService {

		// C R U D
	
	 // adding the book repository as a dependency
	// D.I
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    
    // READ ALL
    // returns all the books
    public List<Book> allBooks() {
    	
        return bookRepository.findAll();
    }
    
    // CREATE
    // creates a book
    public Book createBook(Book b) {
    	
        return bookRepository.save(b);
    }
    
    // Find By ID
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();  
        } else {
            return null;
        }
    }
	
}
