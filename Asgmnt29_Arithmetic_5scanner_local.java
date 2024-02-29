package assignments;

import java.util.Scanner;

public class Asgmnt29_Arithmetic_5scanner_local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		substraction();
		division();
		multiplication();
		modulus();
		}
	static void addition() 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=s1.nextInt();
		System.out.println("Enter the value for b");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("a+b is "+sum);
		
	}
	static void substraction()
	{	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=s1.nextInt();
		System.out.println("Enter the value for b");
		int b=s1.nextInt();
		int sum=a-b;
		System.out.println("a-b is "+sum);
	}
	static void division() 
	{	
	    Scanner s1=new Scanner(System.in);
	    System.out.println("Enter the value for a");
	    int a=s1.nextInt();
	    System.out.println("Enter the value for b");
	    int b=s1.nextInt();
	    int sum=a/b;
	    System.out.println("a/b is "+sum);
	}
	static void multiplication() 
	{	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a");
	    int a=s1.nextInt();
	    System.out.println("Enter the value for b");
	    int b=s1.nextInt();
	    int sum=a*b;
	    System.out.println("a*b is "+sum);
	}
	static void modulus() 
	{	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a");
	    int a=s1.nextInt();
	    System.out.println("Enter the value for b");
	    int b=s1.nextInt();
	    int sum=a%b;
	    System.out.println("a%b is "+sum);
	}

}







