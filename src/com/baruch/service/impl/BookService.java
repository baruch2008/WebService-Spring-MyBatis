package com.baruch.service.impl;

import java.util.List;

import com.baruch.dao.IBookDao;
import com.baruch.model.Book;
import com.baruch.service.IBookService;

/**
 * 在接口中予以声明服务，在实现类中不再需要声明
 * 
 * @author Administrator
 *
 */
// @Path(value="/book")
public class BookService implements IBookService {

	private IBookDao bookDao;

	public void setBookDao(IBookDao bookDao) {
		this.bookDao = bookDao;
	}

	/*
	 * @GET
	 * 
	 * @Path("/{name}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 */
	@Override
	public String getBooksByName(String name) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("{\"name\":\"");
		strBuilder.append(name);
		strBuilder.append("\",\"isbn\":\"");
		strBuilder.append(123456);
		strBuilder.append("\"}");
		return strBuilder.toString();
	}

	@Override
	public String getBooks() {
		List<Book> books = bookDao.getBooks();
		if (books.isEmpty()) {
			return "[]";
		}

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append('[');
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			strBuilder.append("{\"name\":\"");
			strBuilder.append(book.getName());
			strBuilder.append("\",\"isbn\":\"");
			strBuilder.append(book.getIsbn());
			strBuilder.append("\",\"price\":");
			strBuilder.append(book.getPrice());
			if(i+1 >= books.size()) {
				strBuilder.append("}");
			} else {
				strBuilder.append("},");
			}
		}
		strBuilder.append(']');

		return strBuilder.toString();
	}

	@Override
	public String getBookByISBN(String isbn) {
		return null;
	}

	@Override
	public void addBook(Book book) {

	}

	@Override
	public void adddBooks(List<Book> books) {

	}

	@Override
	public void modifyBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub

	}

}
