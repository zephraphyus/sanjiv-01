package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteIntructorDetailDemo {

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
  ////get instructor by pk 

		session.beginTransaction();
		
		int theId=4;
		InstructorDetail temp=session.get(InstructorDetail.class,theId);
	
	if(temp!=null)
{
		System.out.println("the instructordetail neede to be deleted"+temp);
//it will also dleete associated instructor detail
//		temp.setIsntructor(null);
	System.out.println("instructor values of id 2"+temp.getIsntructor());
		//Instructordetail delete
		//session.delete(temp);

///WE NEED TO BREAK THE LINK INORDER TO REMOVE ONLY INSTRUCTOR DETAIL DELETE LINK
//WE SET THE iNSTRUCTOR OBJECT OF INSTRUCTOR DETAIL AS NULL
	temp.getIsntructor().setInstructorDetail(null);
	
	session.delete(temp);



}
		//associate the objects		
		
	
	
	
	
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
