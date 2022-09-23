package com.sixdee.book.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.sixdee.book.model.Book;
import com.sixdee.book.repository.BookRepo;
import com.sixdee.book.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	private BookRepo repo;
	
	
	public BookServiceImpl(BookRepo repo) {
		super();
		this.repo = repo;
	}


	@Override
	public int addBook(Book b) 
	{
		repo.save(b);
		return 0;
		
	}

	@Override
	public List<Book> getAllBooks() 
	{
		return repo.findAll();
	}


	@Override
	public Book getBooksById(int i) {
		Optional<Book> b = repo.findById(i);
		
		return b.get();
	}


	@Override
	public List<Book> getBooksByAuthor(String name) {
		List<Book> b = repo.findByAuthorName(name);
		return b;
	}


	@Override
	public List<Book> getBooksByGenre(String bGenre) {
		List<Book> b = repo.findByBookGenre(bGenre);
		return b;
	}


	@Override
	public int deleteBook(int bId) {
		repo.deleteById(bId);
		return 0;
	}

	
}
