package assignments;

import java.util.Scanner;

public class Asgmnt26_typesofscanner {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value for string nextLine()");
		String a9=s1.nextLine();
		
		System.out.println("Enter the value for Byte");
		byte a1=s1.nextByte();
		
		System.out.println("Enter the value for int");
		int a2=s1.nextInt();
		
		System.out.println("Enter the value for short");
		short a3=s1.nextShort();
		
		System.out.println("Enter the value for long");
		long a4=s1.nextLong();
		
		System.out.println("Enter the value for double");
		double a5=s1.nextDouble();
		
		System.out.println("Enter the value for float");
		float a6=s1.nextFloat();
		
		System.out.println("Enter the value for boolean");
		boolean a7=s1.nextBoolean();
		
		System.out.println("Enter the value for next()");
		String a8=s1.next();
}
}
