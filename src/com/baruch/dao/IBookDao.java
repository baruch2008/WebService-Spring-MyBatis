package com.baruch.dao;

import java.util.List;

import com.baruch.model.Book;

public interface IBookDao {
	List<Book> getBooks();

	Book getBookByISBN(String isbn);

	Book getBookByName(String name);

	void addBook(Book book);

	void modifyBook(Book book);

	void deleteBookByISBN(String isbn);
}
