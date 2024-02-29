package assignments;

public class Asgmnt22_findarea {
	
	final static double pi=3.14;
	static int a=10;
	static int b=100;
	static int h=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area_of_cirlce();
		Area_of_triangle();
		Area_of_square();
		Area_of_rectangle();
		Area_of_trapezium();
		}
		
	static void Area_of_cirlce()
	{	
	    int r=98;
		double  Area_of_cirlce=pi*r*r;
		System.out.println("Area_of_cirlce="+ Area_of_cirlce);
	}
	
	static void Area_of_triangle()
	{
        int area_of_triangle=(h*b)/2;
        System.out.println("Area_of_triangle="+area_of_triangle);
	}
       
	static void Area_of_square()
	{
        int area_of_square=a*a;
        System.out.println("Area_of_square="+area_of_square);
	}
	
	static void Area_of_rectangle()
	{
        int w=10;
        int l=15;
        int area_of_rectangle=w*l;
        System.out.println("Area_of_rectangle="+area_of_rectangle);
	} 
    
	static void Area_of_trapezium()
    {
        int area_of_trapezium= (a+b)/2 * h;
        System.out.println("Area_of_trapezium="+area_of_trapezium);
    }

}
