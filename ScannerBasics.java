package com.lulu.io;
import java.util.Scanner;

public class ScannerBasics {
int n1,n2,input;
float p,t,r; 
Scanner sc=new Scanner(System.in);

	/*int manip()
	{
		
		System.out.println("Enter 2 input:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		int result;
		result=n1+n2;
		//System.out.println("Result");
		return result;
	}
	int maniplargest()
	{
		if(n1 > n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	}
	int manipsmallest()
	{
		if(n1<n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	} */
	float si()
	{
		System.out.println("Enter p,t,r input");
		p=sc.nextFloat();
		t=sc.nextFloat();
		r=sc.nextFloat();
		float s=((p*t*r)/100);
		System.out.println("Total amount to be paid is"+(p+s));
		return s;
		
	}
	
	/*void oddoreven()
	{
		System.out.println("Enter input");
		input=sc.nextInt();
		{
			if(input%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		
	}
	*/
}
