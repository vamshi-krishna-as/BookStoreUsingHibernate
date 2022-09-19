package com.sixdee.bookstore;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BookServiece 
{
	public static void addBook(Book b) 
	{
		App.em.getTransaction().begin();
		App.em.persist(b);
		App.em.getTransaction().commit();
	}
	
	public static Object getCount() 
	{
		Query q = App.em.createQuery("select count(bookId) from Book");
		Object res=q.getSingleResult();
		return res;
	}
	
	public static void viewBooks() 
	{
		Query q = App.em.createQuery("from Book");
		List<Book> b = q.getResultList();
		System.out.println(b);
	}
	
	public static List<Book> getBookAccordingToAuthor(String authorName)
	{
		Query q = App.em.createQuery("from Book where authorName = :a");
		q.setParameter("a", authorName);		
		List<Book> b = q.getResultList();
		return b;
	}
	
	public static List<Book> getBookAccordingToGenre(String bookGenre) 
	{
		Query q = App.em.createQuery("from Book where bookGenre = :g");
		q.setParameter("g", bookGenre);		
		List<Book> b = q.getResultList();
		return b;
	}

	public static void sell(int i) 
	{
		App.em.getTransaction().begin();   
	    Book b = App.em.find(Book.class,i);
	    App.em.remove(b);
	    App.em.getTransaction().commit();
	}
}
