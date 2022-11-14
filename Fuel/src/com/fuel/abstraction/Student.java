package com.fuel.abstraction;

public abstract class Student 
{
	public Student()
	{
		System.out.println("Student constructor");
	}

	public Student(int a)
	{
		System.out.println("Student Parameterized constructor");
	}

	
	
	public abstract void Etc();
	
	
	public void CSE()
	{
		System.out.println("CSE DEPT");
	}
	
	public void Mech()
	{
		System.out.println("MECH DEPT");
	}
	

}
