package assignments;

public class Asgmnt7_5staticmethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Addition();
		Substraction();
		Multiplication();
		Division();
		Modulus();
    }

	static void Addition()
	{
	int a=5000;
	int b=6000;
	int sum=(a+b);
	System.out.println(sum);
	}
	static void Substraction()
	{
		int a=689522;
		int b=56923;
		int sum=(a-b);
		System.out.println(sum);	
	}
	static void Multiplication()
	{
		int a=2563;
		int b=9856;
		int sum=(a*b);
		System.out.println(sum);
	}
	static void Division()
	{
		int a=96528;
		int b=2563;
		int sum=(a/b);
		System.out.println(sum);
	}
	static void Modulus()
	{
		int a=78800;
		int b=500;
		int sum=(a%b);
		System.out.println(sum);
	}
}

