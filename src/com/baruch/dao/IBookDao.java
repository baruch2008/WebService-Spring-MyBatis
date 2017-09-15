package com.baruch.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baruch.model.Book;

public interface IBookDao {
	List<Book> getBooks();

	Book getBookByISBN(@Param(value="isbn") String isbn);

	Book getBookByName(@Param(value="name") String name);

	void addBook(Book book);

	void modifyBook(Book book);

	void deleteBookByISBN(String isbn);
}
