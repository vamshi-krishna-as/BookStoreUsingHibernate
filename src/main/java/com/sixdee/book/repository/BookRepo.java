package com.sixdee.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sixdee.book.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>
{

	List<Book> findByAuthorName(String name);

	List<Book> findByBookGenre(String bGenre);



}
