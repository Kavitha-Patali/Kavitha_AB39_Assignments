package assignments;

public class Asgmnt23_localglobalvariable {

	static int a=10;  // global variable Declaration and Initialisation
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		addition();
		
		
	}
	
	static void addition()
	{
		int b=20; // local variable Declaration and Initialisation
		int c;  // local variable Declaration
		c=30;   // local variable Initialisation
		int sum=a+b+c;
		System.out.println("Sum = "+sum);
	}
	

}
