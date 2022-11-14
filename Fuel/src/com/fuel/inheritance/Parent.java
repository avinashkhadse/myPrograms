package com.fuel.inheritance;

public class Parent 
{
	private int eId;
	private String eName;
	private String eCity;
	private String eDept;
	static float Pi=3.14f;
	
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("non-static block");
	}
	
	
	
	
	
	public int geteId() 
	{
		return eId;
	}
	public void seteId(int eId) 
	{
		this.eId = eId;
	}
	public String geteName() 
	{
		return eName;
	}
	public void seteName(String eName) 
	{
		this.eName =eName;
	}
	public String geteCity() 
	{
		return eCity;
	}
	public void seteCity(String eCity) 
	{
		this.eCity = eCity;
	}
	public String geteDept() 
	{
		return eDept;
	}
	public void seteDept(String eDept) 
	{
		this.eDept = eDept;
	}
	
	public static void Display()
	{
		System.out.println("Display method");
	}
	
}

	


