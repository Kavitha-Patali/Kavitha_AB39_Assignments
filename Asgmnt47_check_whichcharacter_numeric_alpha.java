package assignments;

public class Asgmnt47_check_whichcharacter_numeric_alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Mango123";
		char c1[]=name.toCharArray();
		for(int i=0;i<=name.length()-1;i++)
		{
			boolean answer=Character.isAlphabetic(c1[i]);
			if(answer==true) 
			{
				System.out.println("The character "+i+ " is Alphabet");
			}
			else
			{
				System.out.println("The character "+i+ " is Numeric");
			}
			
		}
	}

}
