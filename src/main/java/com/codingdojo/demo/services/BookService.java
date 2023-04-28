package com.codingdojo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Book;
import com.codingdojo.demo.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
//    private final BookRepository bookRepository;
//    
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
    
//    Same as above
	@Autowired
    private BookRepository bookRepository;
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Book updateBook(Long id, String title, String description, String language, int numberOfPages) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if (optionalBook.isPresent()) {
    		// Or do it like this: 
    		
//    		Book book = optionalBook.get();
//    		book.setTitle(title);
//    		book.setDescription(description);
//    		book.setLanguage(language);
//    		book.setNumberOfPages(numberOfPages);
    		
    		Book book = new Book(title, description, language, numberOfPages);
    		book.setId(id);
    		System.out.println("Book does exist!!!");
    		return bookRepository.save(book);
    	} else {
    		System.out.println("Book does not exist");
    		return null;
    	}
    	
    }
    
    public void deleteBook(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}
    }

}
