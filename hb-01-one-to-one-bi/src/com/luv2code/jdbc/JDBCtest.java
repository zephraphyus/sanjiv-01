/**
 * 
 */
package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author RAJAT
 *
 */
public class JDBCtest {
public static void main(String args[])
{
	String jdbcURL="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
	String user="hbstudent";
	String password="hbstudent";
	try
	{
	System.out.println("connecting to jdbc"+jdbcURL);
	Connection con=DriverManager.getConnection(jdbcURL,user,password);
	System.out.println("Connection Success  "+con.getCatalog());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
