package com.sixdee.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_DETAILS")
public class Book 
{
	@Id
	@Column(name = "BOOK_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookID;
	
	@Column(name = "BOOK_NAME")
	private String bookName;
	
	@Column(name = "AUTHOR_NAME")
	private String authorName;
	
	@Column(name = "BOOK_GENRE")
	private String bookGernre;
	
	@Column(name = "BOOK_PRICE")
	private double bookPrice;
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookGernre() {
		return bookGernre;
	}
	public void setBookGernre(String bookGernre) {
		this.bookGernre = bookGernre;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookID, String bookName, String authorName, String bookGernre, double bookPrice) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookGernre = bookGernre;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", authorName=" + authorName + ", bookGernre="
				+ bookGernre + ", bookPrice=" + bookPrice + "]";
	}
	
	
}
