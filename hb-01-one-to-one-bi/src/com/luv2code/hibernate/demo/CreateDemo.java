package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	//create Session Factory
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
addAnnotatedClass(Instructor.class).
addAnnotatedClass(InstructorDetail.class).
buildSessionFactory();
		
	//create session
	Session session=factory.getCurrentSession();	
		
	try
	{
  ////create the object
	Instructor tempInstructor=new Instructor("Sanjiv","Rai","sanjivrai543@gmail.com");	
	InstructorDetail instructorDetail=new 	InstructorDetail("piedipew","hate2code");
	tempInstructor.setInstructorDetail(instructorDetail);
//associate the objects		
		
	session.beginTransaction();
	
	System.out.println("saving the instructr and instructordetail object");
	
	//it will also save instructor detail object becoz of cascadeType.all
	session.save(tempInstructor);
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
