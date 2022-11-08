package com.batch13.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.cj.exceptions.StatementIsClosedException;

public class Student {

	static String driver="com.mysql.jdbc.Driver";
	static String conString="jdbc:mysql://localhost:3306/batch13";
	static String user="root";
	static String pass="Admin@123";
	
	
	public static void main(String[] args) 
	{
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(conString,user,pass);
		Statement st=con.createStatement();				
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name");
		String name=sc.next();
		System.out.println("Enter Employee City");
		String city=sc.next();
		System.out.println("Enter Employee Salary");
		float salary=sc.nextFloat();
		System.out.println("Enter Employee Dept");
		String Dept=sc.next();
		
		String query= String.format("insert into tblEmployee values(%d,'%s','%s',%f,'%s' )",id,name,city,salary,Dept);
		//String query=String.format("delete from  tblemployee where eId=%d", id);
		//String query =String.format("update tblemployee set eCity='%s',eDept='%s' where eId=%d",city,Dept,id );
		st.executeUpdate(query);
		System.out.println("Record updated");
		
		} 
		
		catch (ClassNotFoundException e) {
			System.out.println("class not found ");
						
		}
		catch (SQLException e) {
			System.out.println("SQLException handle ");
						
		}
		catch (Exception e) {
			System.out.println("class not found ");
						
		}
		finally {
			
		}
		
	}

}
