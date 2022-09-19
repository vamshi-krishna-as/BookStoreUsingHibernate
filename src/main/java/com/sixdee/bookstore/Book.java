package com.sixdee.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Book 
{
	@Id
	private int bookId;
	private String bookName;
	private String authorName;
	private String bookGenre;
	private double bookPrice;
	
	public Book(String bName, String aName, String bGenre, double bPrice) 
	{

		bookName=bName;
		authorName=aName;
		bookGenre=bGenre;
		bookPrice=bPrice;
	}


	public Book() {
		super();
	}

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName) 
	{
		if(bookName!=null && !bookName.trim().equals(""))
		{
			this.bookName = bookName;
		}
		else
		{
			throw new IllegalArgumentException("Enter valid Book Name.\n BookName cannot be null or empty");
		}
	}

	public String getAuthorName() 
	{
		return authorName;
	}

	public void setAuthorName(String authorName) 
	{
		if(authorName!=null && !authorName.trim().equals(""))
		{
			this.authorName = authorName;
		}
		else
		{
			throw new IllegalArgumentException("Enter valid Author Name.\\n AuthorName cannot be null or empty");
		}
	}
	
	public String getBookGenre() 
	{
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) 
	{
		if(bookGenre!=null && !bookGenre.trim().equals(""))
		{
			this.bookGenre = bookGenre;
		}
		else
		{
			throw new IllegalArgumentException("Enter valid Author Name.\\n AuthorName cannot be null or empty");
		}
	}

	public double getBookPrice() 
	{
		return bookPrice;
	}

	public void setBookPrice(double d) 
	{
		if(d>0)
		{
			this.bookPrice = d;
		}
		else
		{
			throw new IllegalArgumentException("Book Price cannot be negetive..");
		}
	}

	@Override
	public String toString() 
	{
		return "Book Details : \nBookId : " + bookId + "\nBookName : " + bookName + "\nAuthorName : " + authorName
				+ "\nBookGenre : " + bookGenre + "\nBookPrice : " + bookPrice;
	}

}
