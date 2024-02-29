package assignments;

public class Asgmnt17_static_nonstatic_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myname();
		myaddress();
		Asgmnt17_static_nonstatic_const A1=new Asgmnt17_static_nonstatic_const();
		A1.mybatch();
		A1.myfuturejob();
		}
	
	static void myname()
	{
		System.out.println("Kavitha");
	}
	static void myaddress()
	{
		System.out.println("Bangalore");
	}
	
	void mybatch()
	{
		System.out.println("automation_testing_39batch");
	}
	void myfuturejob()
	{
		System.out.println("automation engineer");
	}
	
	Asgmnt17_static_nonstatic_const() //constructor
	{
		System.out.println("learing automation");
	}

}
