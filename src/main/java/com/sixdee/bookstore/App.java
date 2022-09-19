package com.sixdee.bookstore;

import org.hibernate.cfg.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App 
{
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	static EntityManager em = emf.createEntityManager();
	public static void main( String[] args )
    {
		int ch = 0;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		try 
		{
			while (true) 
			{
				System.out.println("Choose 1 to Add a new book into the Store.");
				System.out.println("Choose 2 to View the Current books stock in the Store.");
				System.out.println("Choose 3 to View all the Books in the Store.");
				System.out.println("Choose 4 to View Book details according to thier Author Name.");
				System.out.println("Choose 5 to View Book details according to Genre.");
				System.out.println("Choose 6 to Sell the Books");
				System.out.println("Choose 7 to Exit!!");
				System.out.println("Enter your choice");
				
				try {
					ch = sc1.nextInt();
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("");
					main(args);
				}
				
				switch(ch)
				{
					case 1:
						System.out.println("Enter the Book Name : ");
						String bName = sc2.nextLine();
						System.out.println("Enter the Author Name : ");
						String aName = sc2.nextLine();
						System.out.println("Enter the Book Genre : ");
						String bGenre = sc2.nextLine();
						System.out.println("Enter the Book Price : ");
						double bPrice = sc1.nextDouble();
						Book b = new Book(bName,aName,bGenre,bPrice);
						BookServiece.addBook(b);
						System.out.println("Book Added Into Database Successfully...");
						break;
					
					case 2:
						
						System.out.println("Total number of Available Books are : "+BookServiece.getCount());
						break;
					
					case 3:
						BookServiece.viewBooks();
						break;
					
					case 4:
						System.out.println("Enter the Author Name to search : ");
						String aName1=sc2.nextLine();
						List<Book> b1 = BookServiece.getBookAccordingToAuthor(aName1);
						System.out.println(b1);
						break;
					
					case 5:
						System.out.println("Enter the Book Genre to search : ");
						String bGenre1=sc2.nextLine();
						List<Book> b2 = BookServiece.getBookAccordingToGenre(bGenre1);
						System.out.println(b2);
						break;
					
					case 6:
						BookServiece.viewBooks();
						System.out.println("Enter the Book Id to sell : ");
						int i = sc1.nextInt();
						BookServiece.sell(i);
						break;
					
					case 7:
						System.exit(0);
						break;
					
					default : throw new IllegalArgumentException("Invalid types for choices..");
					
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("");
			main(args);
		}

    }
}
