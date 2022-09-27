package com.sixdee.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.book.model.Book;
import com.sixdee.book.repository.BookRepo;

@RestController
public class BookController 
{
	@Autowired
	BookRepo repo;
	
	@GetMapping(value = "/bookPageable")
	Page bookPageable(Pageable pageable)
	{
		return repo.findAll(pageable);
	}
}
