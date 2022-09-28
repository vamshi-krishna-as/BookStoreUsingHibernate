package com.sixdee.book.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.book.model.Book;

@Repository
public interface BookRepo extends PagingAndSortingRepository<Book, Integer>
{

	List<Book> findByAuthorName(String authorName);

	List<Book> findByBookGenre(String bookGenre);

}
