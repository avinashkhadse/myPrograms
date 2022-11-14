package com.fuel.exception;

public class Employee 
{
	
	 int id;
	public Employee()
	{
		System.out.println("constructor");
	}
	
	 void Demo()
	{
		System.out.println("Demo method");
		
	}
	
	public static void main(String[]args)
	{
		Employee e1=new Employee();
		e1.id=50;
		e1.Demo();
	}
	
	
}
