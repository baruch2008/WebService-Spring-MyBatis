package com.baruch.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baruch.model.Book;

@RestController
@RequestMapping(value="/book")
public interface IBookService {
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET, produces="application/json")
	String getBooksByName(@PathVariable("name") String name);
	
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	String getBooks();
	
	String getBookByISBN(String isbn);
	
	void addBook(Book book);
	
	void adddBooks(List<Book> books);
	
	void modifyBook(Book book);
	
	void deleteBook(String isbn);
}
