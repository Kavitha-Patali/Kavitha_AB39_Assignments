package assignments;

public class Asgmnt55_1to1000divby3and5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		for(int i=1;i<=1000;i++)
		{
			
		if(i%3==0 && i%5!=0)
		{
		System.out.println(i+" SUN");	
		}
		if(i%5==0 && i%3!=0)
		{
			System.out.println(i+" MOON");	
		}
		if(i%3==0 && i%5==0 )
		{
			System.out.println(i+" SUN & MOON");	
		}
		}
		
		

	}

}
