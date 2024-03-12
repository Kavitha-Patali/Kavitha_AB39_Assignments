package assignments;

public class Asgmnt41_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="rotator";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char answer	=name.charAt(i);
			reverse=reverse+answer;
		}
		
		boolean a1=name.equals(reverse);
		System.out.println(a1);
		if(a1==true) 
		{
			System.out.println("The given string is palindrome");
		}
		else 
		{
			System.out.println("The given string is not palindrome");
		}

	}

}
