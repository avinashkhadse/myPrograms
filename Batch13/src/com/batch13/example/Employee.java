package com.batch13.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee 
{
	
	public static void main(String[]args) throws ClassNotFoundException,SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/batch13","root","Admin@123");
		
		System.out.print("Connection Done");
		
	}
}
