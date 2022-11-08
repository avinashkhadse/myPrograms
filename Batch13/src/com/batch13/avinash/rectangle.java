package com.batch13.avinash;

import java.util.Scanner;

public class rectangle
{
	int length,width,cost;
	void setValues(Scanner sc)
	{
		String s=sc.next();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			length=Integer.parseInt(str[i]);
			width=Integer.parseInt(str[i]);
			cost=Integer.parseInt(str[i]);
		  }
	}
	void logic()
	{
		System.out.print(length+" "+width+" "+cost);
	}
	public static void main(String[]args)
	{
	  Scanner scanner=new Scanner(System.in);
	  int n=scanner.nextInt();
	  rectangle r[]=new rectangle[n];
	  for(int i=0;i<n;i++)
	  {
		  r[i]=new rectangle();
      }
	  for(int i=0;i<n;i++)
	  {
		  r[i].setValues(scanner);
	  }
	  for(int i=0;i<n;i++)
	  {
		  r[i].logic();
		  System.out.println();
      }
	}
}
