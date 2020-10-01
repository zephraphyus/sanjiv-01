package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			//theStudents=session.createQuery("from Student").getResultList();
	
	//display the students
	/*for(Student tempStudent:theStudents)
	{
		System.out.println(tempStudent);
	}
	*/
	//theStudents=session.createQuery("from Student s where s.lastName='Rai'").getResultList();
	/*
	for(Student tempStudent:theStudents)
	{
		System.out.println(tempStudent);
	}
	*/
	//query students : fname: Sanjiv lastname: Rai
	
/*
	theStudents=session.createQuery("from Student s where s.lastName='rai' OR s.firstName='Sanjiv'").getResultList();
	
	for(Student tempStudent:theStudents)
	{
		System.out.println(tempStudent);
	}
*/
			//query student email LIKE '%luv2code.com'
			theStudents = session.createQuery("from Student s where "
					+ "s.email LIKE '%luv2code.com'").getResultList();
			
			for(Student tempStudent:theStudents)
			{
				System.out.println(tempStudent);
			}		
	
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
