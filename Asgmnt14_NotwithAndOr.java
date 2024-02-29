package assignments;

public class Asgmnt14_NotwithAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=15;
		int c=25;
		if (!(a>b && b<c))
		{
			System.out.println("Not with AND output is True");
		}
		else
		{
			System.out.println("Not with AND output is False");
		}
		
		if (!(a>b || b<c))
		{
			System.out.println("Not with OR output is TRUE");
		}
		else
		{
			System.out.println("Not with OR output is False");
		}


	}

}
