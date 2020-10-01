package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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
		int id=301;
		
		//use the session object to save Java object
		System.out.println("Getting student with id");
	
		Student stu=session.get(Student.class,id);
		
	
		//stu.setEmail("raisanjiv69@gmail.com");
		System.out.println("id value: "+stu.getId());
		System.out.println("name value: "+stu.getFirstName()+" "+stu.getLastName());
		System.out.println("email value: "+stu.getEmail());
			
	//delete the object
		System.out.println("deleting the student object");

		session.delete(stu);
		
		
		
	//save the student obj
	///new code for updating multiple values
	
	session=factory.getCurrentSession();
	
     System.out.println(session.createQuery("delete Student where  email='pb@luv2code.com'"
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
