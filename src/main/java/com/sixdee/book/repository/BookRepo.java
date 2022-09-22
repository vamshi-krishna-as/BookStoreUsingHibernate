package com.sixdee.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sixdee.book.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>
{

}
