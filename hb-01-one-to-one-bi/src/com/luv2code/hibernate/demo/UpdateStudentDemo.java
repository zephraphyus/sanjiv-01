package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	//create Session Factory
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
	//create session
		
	try
	{
		Session session=factory.getCurrentSession();	

		session.beginTransaction();
		int id=1;
		
		//use the session object to save Java object
		System.out.println("Getting student with id");
	
		Student stu=session.get(Student.class,id);
		
		stu.setEmail("raisanjiv69@gmail.com");
		System.out.println("id value: "+stu.getId());
		System.out.println("name value: "+stu.getFirstName()+" "+stu.getLastName());
		System.out.println("email value: "+stu.getEmail());
			
	//start the session

	//save the student obj
	System.out.println("saving the student object");
	///new code for updating multiple values
	
	session=factory.getCurrentSession();
	
     System.out.println(session.createQuery("update Student set email='foo@gmail.com'"
    		 ).executeUpdate());
	
	//commit the change
	session.getTransaction().commit();

	
	System.out.println("Done !");
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
