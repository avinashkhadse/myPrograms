package com.batch13.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Employee 
{
	
	
	//static String query="insert into tblEmployee values(103,'Ajay','Auragabad',56465.50,'CSE')";
	//static String query="delete from tblEmployee where eId=103";
	//static String query="update tblEmployee set eCity='pune',eSalary='44121.78' where eId=102";
	static String query="select eId,eName, eCity, eSalary,eDept from tblEmployee";
	
	
	
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/batch13","root","Admin@123");
		
		Statement st=con.createStatement();
		
		//st.executeUpdate(query);
		
		ResultSet rSet=st.executeQuery(query);
		rSet.next();
	while(rSet.next())	
		//System.out.println("record incerted");
		//System.out.println("record incerted");
		//System.out.println("record updated");
		//System.out.println("Connection Done");
		System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+" "+rSet.getString(3)+" "+rSet.getFloat(4)+" "+rSet.getString(5));
		
	}

}
