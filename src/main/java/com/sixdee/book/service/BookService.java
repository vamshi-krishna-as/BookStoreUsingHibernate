package com.sixdee.book.service;

import java.util.List;

import com.sixdee.book.model.Book;



public interface BookService {

	int addBook(Book b);
	List<Book> getAllBooks();
	Book getBooksById(int i);
	List<Book> getBooksByAuthor(String aName);
	List<Book> getBooksByGenre(String bGenre);
	int deleteBook(int bId);
}
