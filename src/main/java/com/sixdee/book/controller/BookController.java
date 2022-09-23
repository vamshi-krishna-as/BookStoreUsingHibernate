package com.sixdee.book.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.book.model.Book;
import com.sixdee.book.service.BookService;



@RestController
public class BookController
{
	private BookService service;

	public BookController(BookService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/addBooks")
	public int addBook(@RequestBody Book b)
	{
		return service.addBook(b); 	
				
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks()
	{
		return service.getAllBooks();
				
	}
	
	@GetMapping("/getBooksById/{bookId}")
	public Book getBooksById(@PathVariable("bookId") int bookId)
	{
		return service.getBooksById(bookId);
	}
	

	@GetMapping("/getBooksByAuthor/{authorName}")
	public List<Book> getBooksByAuthor(@PathVariable("authorName") String authorName)
	{
		return service.getBooksByAuthor(authorName);
	}
	
	@GetMapping("/getBooksByGenre/{bookGenre}")
	public List<Book> getBooksByGenre(@PathVariable("bookGenre") String bookGenre)
	{
		return service.getBooksByGenre(bookGenre);
	}
	
	@DeleteMapping("/deleteBooks/{bookId}")
	public int deleteBooks(@PathVariable("bookId") int bookId)
	{
		return service.deleteBook(bookId);
	}
}
