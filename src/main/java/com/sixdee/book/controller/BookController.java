package com.sixdee.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.book.model.Book;
import com.sixdee.book.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController
{
	private BookService service;

	public BookController(BookService service) {
		super();
		this.service = service;
	}
	
	@PostMapping()
	public ResponseEntity<Book> addBook(@RequestBody Book b)
	{
		return new ResponseEntity<Book>(service.addBook(b),HttpStatus.CREATED); 	
				
	}
}
