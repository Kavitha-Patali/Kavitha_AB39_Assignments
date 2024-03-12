package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Asgmnt44_array_int_addvalueatRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[3];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for Array");
		for(int i=0;i<3;i++)
		{
			num[i]=s1.nextInt();
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
