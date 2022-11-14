package com.fuel.example;

public class Encapsulation 
{
	public static void main(String[]args)
	{
		System.out.println("Main method");
		Employee e1=new Employee();
	
		e1.seteId(20);
		System.out.println(e1.geteId());
	}
}
