package assignments;

public class Asgmnt11_nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;

		if (a!=b)
		{
			if(a>c)
			{
				System.out.println("a is greater than c");
			}
			else
			{
				System.out.println("a is lesser than c");
			}
		}
		else
		{
			System.out.println("none of the above");
		}
	}

}
