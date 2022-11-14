package com.fuel.constructor;

public class Child extends Parent
{
	public Child()
	{
		System.out.println("default constructor");
	}
	public Child(int b)
	{
		 super(10);
		System.out.println("Child constructor");
	}
	
	
	
}
