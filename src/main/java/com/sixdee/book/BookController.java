package com.sixdee.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController
{
	@Autowired
	BookRepo repo;
	
	@PostMapping("/addBooks")
	public int addBook(@RequestBody Book b) 
	{
		repo.save(b);
		return 0;
	}

}
