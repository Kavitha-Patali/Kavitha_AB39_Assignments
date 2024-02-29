package assignments;

public class Asgmnt18_methodoverload {

	public static void main(String[] args) {
		batch39(1,2,3);
		batch39('A',1);
		batch39(1,'B');
		batch39(25.63,'C');
		Asgmnt18_methodoverload A1=new Asgmnt18_methodoverload();
		A1.batch39("test",2,3);
		A1.batch39(5,'E',"test2");
		A1.batch39(true,5.36);
		A1.batch39(false,5.36f,1,'M');
  }
    static void batch39(int a,int b, int c) 
    {
		System.out.println("Static method1");
	}
	static void batch39(char c, int a ) 
	{
		System.out.println("Static method2");
	}
	static void batch39(int a, char c)
	{
		System.out.println("Static method3");
	}
	static void batch39(double d, char c)
	{
		System.out.println("Static method4");
	}
	void batch39(String s, int b, int i)
	{
		System.out.println("Nonstatic method1");
	}
	void batch39(int a, char c, String s) 
	{
		System.out.println("Nonstatic method2");
	}
	void batch39(boolean b, double d)
	{
		System.out.println("Nonstatic method3");
	}
	void batch39(boolean b,float f, int i, char c)
	{
		System.out.println("Nonstatic method4");
	}
}
