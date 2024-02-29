package assignments;

public class Asgmnt19_constroverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Asgmnt19_constroverload(1,2,3);
		new Asgmnt19_constroverload(1,"test");
		new Asgmnt19_constroverload("test",2);
		new Asgmnt19_constroverload('K',true);
		new Asgmnt19_constroverload('D',25.63,false);
		new Asgmnt19_constroverload(true,2.53f,'A');
		new Asgmnt19_constroverload(1,"kavitha",'D',2.53,1.25f);
		new Asgmnt19_constroverload('A','B','C');
		new Asgmnt19_constroverload(2.63,2);
		new Asgmnt19_constroverload(2,'E');
	}

	Asgmnt19_constroverload(int a,int b, int c){
		System.out.println("Constructor 1");
	}
	Asgmnt19_constroverload(int a,String S)
	{
		System.out.println("Constructor 2");
	}
	
	Asgmnt19_constroverload(String S, int a)
	{
		System.out.println("Constructor 3");
	}
	
	Asgmnt19_constroverload(char c,boolean b)
	{
		System.out.println("Constructor 4");
		
	}
	Asgmnt19_constroverload(char c, double d,boolean b)
	{
		System.out.println("Constructor 5");
	}
	
	Asgmnt19_constroverload(boolean b, float d, char c)
	{
		System.out.println("Constructor 6");
	}
	
	Asgmnt19_constroverload(int a, String s, char c, double d, float e)
	{
		System.out.println("Constructor 7");
	}
	Asgmnt19_constroverload(char a , char aa, char c)
	{
		System.out.println("Constructor 8");
	}
	Asgmnt19_constroverload(double d, int i)
	{
		System.out.println("Constructor 9");
	}
	Asgmnt19_constroverload(int a, char d)
	{
		System.out.println("Constructor 10");
	}
}
