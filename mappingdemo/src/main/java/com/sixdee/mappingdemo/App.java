package com.sixdee.mappingdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String[] args) {
    	Laptop laptop = new Laptop();
		laptop.setlId(2);
		laptop.setLName("macbook");
		
		Student student = new Student();
		student.setsName("vamshi");
		student.setRollNo(2);
		student.setMarks(90);
		student.getLaptops().add(laptop);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session s = sf.openSession();
    	 
    	org.hibernate.Transaction ts = s.beginTransaction();
    
    	s.save(student);
    	s.save(laptop);
    
    	ts.commit();
	}
}
