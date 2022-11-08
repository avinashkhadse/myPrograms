package com.example.demo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class Emp {

static	String driver="com.mysql.jdbc.Driver";
static String conString="jdbc:mysql://localhost:3306/batch13";
static String user="root";
static String pass="1234";

	public static void main(String[] args) {
	
		
	try {
		Class.forName(driver);
	Connection con=DriverManager.getConnection(conString,user,pass);
	Statement st=con.createStatement();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Id");
	int id=sc.nextInt();
	//System.out.println("Enter Employee Name");
	//String name=sc.next();
	System.out.println("Enter Employee city");
	String city=sc.next();
	//System.out.println("Enter Employee salary ");
//	float salary=sc.nextFloat();
	System.out.println("Enter Employee Dept");
	String Dept=sc.next();
	//String query= String.format("insert into tblEmployee values(%d,'%s','%s',%f,'%s' )",id,name,city,salary,Dept);
	//String query=String.format("delete from  tblemployee where eId=%d", id);
	String query =String.format("update tblemployee set eCity='%s',eDept='%s' where eId=%d",city,Dept,id );
	st.executeUpdate(query);
	System.out.println("Record updated");
	}

	catch (ClassNotFoundException e) {
	System.out.println("class not found Exception");
	}

	catch (SQLException e) {
		System.out.println("Sql Exception");
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		
	}
		
	}

}