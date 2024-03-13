package assignments;

public class Asgmnt36_thiskeyword_assignvalue {
	
	int number;//global var
	String name;

	void num(int number,String name )
	{
		this.number=number; 
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Asgmnt36_thiskeyword_assignvalue a1= new Asgmnt36_thiskeyword_assignvalue();
		a1.num(10,"Kavitha");  
		System.out.println(a1.number);
		System.out.println(a1.name);
	}

}
