package assignments;

import java.util.Arrays;

public class Asgmnt46_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String name1="act";
	String name2="cat";
	if( name1.length()!=name2.length())
	{
		System.out.println("Given strings are not anagram");
	}
	else
	{
		char n1[]=name1.toCharArray();
		char n2[]=name2.toCharArray();
		Arrays.sort(n1);
		Arrays.sort(n2);
		boolean Answer= Arrays.equals(n1, n2);
		if (Answer==true)
		{
			System.out.println("The given strings are anagram");
		}
		if(Answer==false)
		{
			System.out.println("The given strings are not anagram");
		}
	}
	
	
	}

}
