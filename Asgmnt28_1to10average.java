package assignments;

public class Asgmnt28_1to10average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double sum=0;
		
		for(int i=1 ; i<=10; i++)
		{
			
			System.out.println(i);
			
			sum=sum+i;
		}

		System.out.println("Sum of numbers 1 to 10 is "+sum);
		double average=(sum/10);
		System.out.println("Average of numbers 1 to 10 is "+average);
		
	}

}

