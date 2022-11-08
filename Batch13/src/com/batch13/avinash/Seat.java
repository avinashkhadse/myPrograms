package com.batch13.avinash;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Seat 
{
	public static void main(String[]args)
	{
		try {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());

	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<=50)
			System.out.println("LEFT");
		else {
			System.out.println("RIGHT");
		}
	}
		}catch(Exception e) {}
	
	}
}
