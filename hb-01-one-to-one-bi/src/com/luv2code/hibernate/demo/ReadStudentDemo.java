package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	//create Session Factory
SessionFactory factory=new Configuration().
                              configure("hibernate.cfg.xml").
                              addAnnotatedClass(Student.class).
                              buildSessionFactory();
		
	//create session
	Session session=factory.getCurrentSession();	
		
	try
	{
		//use the session object to save Java object
		System.out.println("create new student object...");
	//Student tempStudent=new Student("Paul","Hey","paulH@luv2code.com");
		Student tempStudent=new Student("Daffy","Duck","DF@luv2code.com");
		//System.out.println("Saved student Generated id: "+tempStudent.getId());	
	//start the session
	session.beginTransaction();
	
	//save the student obj
	System.out.println("saving the student object");
	System.out.println(tempStudent);
	System.out.println();
	session.save(tempStudent);
	
	//commit the change
	session.getTransaction().commit();

	//My new Code
	
	//find out the student id: primary key
	
	System.out.println("Saved student Generated id: "+tempStudent.getId());
	
	//now get a new session and start transaction
	 session=factory.getCurrentSession();	
	session.beginTransaction();
	
	//retrieve student based on the id: primary key
	System.out.println("getting  student with id: "+tempStudent.getId());
	
	Student myStudent=session.get(Student.class,tempStudent.getId());
	System.out.println(myStudent);
	//commit the transaction
	
	session.getTransaction().commit();
	
	System.out.println("Done!");
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
	finally
	{
		factory.close();
	}
	
		
	}

}
