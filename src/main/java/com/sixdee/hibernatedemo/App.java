package com.sixdee.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	Book a = new Book();
    	a.setBookId(1);
    	a.setBookName("DataStructures");
    	a.setAuthorName("PadmaReddy");
    	a.setBookGenre("ProgLang");
    	a.setBookPrice(222.22);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Book.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session s = sf.openSession();
    	 
    	org.hibernate.Transaction ts = s.beginTransaction();
    
    	s.save(a); 
    	
    	ts.commit();
    }
}
