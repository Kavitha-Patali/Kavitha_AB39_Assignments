package assignments;

import java.util.Scanner;

public class Asgmnt27_Arithmetic_scanner_global {

	static int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a");
		a=s1.nextInt();
		System.out.println("Enter the value for b");
		b=s1.nextInt();
		add();
		sub();
		mul();
		div();
		mod();
      }
	
	static void add()
	{
		System.out.println("addition");
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println("substraction");
		System.out.println(a-b);
	}
	static void mul()
	{
		System.out.println("multiplication");
		System.out.println(a*b);
	}
	static void div()
	{
		System.out.println("division");
		System.out.println(a/b);
	}
	static void mod()
	{
		System.out.println("modulus");
		System.out.println(a%b);
	}
}

