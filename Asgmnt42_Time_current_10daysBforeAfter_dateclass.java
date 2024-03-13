package assignments;

import java.util.Date;

public class Asgmnt42_Time_current_10daysBforeAfter_dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1=new Date();
		Date d2=new Date(d1.getTime()-(1000*60*60*24*10));
		Date d3=new Date(d1.getTime()+(1000*60*60*24*10));
		
		System.out.println("10 days Before the Current time ="+d2);
		System.out.println("10 days After the Current time ="+d3);
	}

}
