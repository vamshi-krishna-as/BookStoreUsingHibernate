package com.sixdee.book.service.impl;

import com.sixdee.book.model.Book;
import com.sixdee.book.repo.BookRepo;
import com.sixdee.book.service.BookService;

public class BookServiceImpl implements BookService
{
	private BookRepo repo;
	
	
	public BookServiceImpl(BookRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Book addBook(Book b) {
	
		return repo.save(b);
	}

}
