package com.fuel.inheritance;

public class Child extends Parent
{
	static
	{
			System.out.println("child staatic block");
	}
	static
	{
		System.out.println("another");
	}
	
	{
		System.out.println("child non static");
		
	}
	void Demo()
	{
		System.out.println("Demo method");
		
	}
}
