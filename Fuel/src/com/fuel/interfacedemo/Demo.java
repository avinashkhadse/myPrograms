package com.fuel.interfacedemo;

public interface Demo 
{
	int a=10;
	final int b=50;
	//private int x=20;
	static int x=25;
	abstract public void Hello();
	
	//public void Hello();
	public void Demo();
	default void Demo1()
	{
		System.out.println("Demo 1 method");
	}
	
	static int Display()
	{
		return 10;
	}
		
}
