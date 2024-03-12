package assignments;

public class Asgmnt48_checkhowmany_numeric_alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="mango";
    char c[]= name.toCharArray();
    int count_of_alpha=0;
    int count_of_numeric=0;
    for(int i=0;i<=name.length()-1;i++)
    {
    boolean answer=Character.isAlphabetic(c[i]);
    if(answer==true)
    {
    	count_of_alpha++;
    }
    else
    {
    	count_of_numeric++;
    }
    }
    System.out.println("count of alphabet in given string is " +count_of_alpha);
    System.out.println("count of numeric in given string is " +count_of_numeric);
   

	}

}
