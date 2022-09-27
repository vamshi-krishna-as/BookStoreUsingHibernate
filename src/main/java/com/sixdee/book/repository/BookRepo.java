package com.sixdee.book.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.book.model.Book;

@Repository
public interface BookRepo extends PagingAndSortingRepository<Book, Integer> {


}
