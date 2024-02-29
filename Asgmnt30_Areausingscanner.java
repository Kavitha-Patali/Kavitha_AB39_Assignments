package assignments;
import java.util.Scanner;

public class Asgmnt30_Areausingscanner {

	static double pi=3.14;
    Scanner s1=new Scanner(System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asgmnt30_Areausingscanner A1=new Asgmnt30_Areausingscanner();
		A1.Area_circum_circle();
		A1.Area_circum_triangle();
		A1.Area_circum_square();
		A1.Area_circum_rectangle();
		A1.Area_circum_trapezium();
		}
	
	void Area_circum_circle() {
		int r=s1.nextInt();
		double area_circle=pi*r*r;
		double circumf_circle=2*pi*r;
		System.out.println("Area of a Circle="+area_circle);
		System.out.println("Circumference of a Circle="+circumf_circle);
	}
	
	void Area_circum_triangle() {
		int h=s1.nextInt();
		int b=s1.nextInt();
		int a=s1.nextInt();
		int c=s1.nextInt();
        int area_of_triangle=(h*b)/2;
        int circumf_of_triangle=a+b+c;
        System.out.println("Area_of_triangle="+area_of_triangle);
        System.out.println("Circumf_of_triangle="+circumf_of_triangle);
	}
	
	void Area_circum_square() {
        int a=s1.nextInt();
        int circumf_of_square=a*a;
        int area_of_square=4*a;
       System.out.println("Area_of_square="+area_of_square);
	   System.out.println("Circumf_of_square="+circumf_of_square);
	}
	
	void Area_circum_rectangle() {
        int w=s1.nextInt();
        int l=s1.nextInt();
        int area_of_rectangle=w*l;
        int circumf_of_rectangle=(2*l)+(2*w);
        System.out.println("Area of a rectangle="+area_of_rectangle);
        System.out.println("Circumference of a rectangle="+circumf_of_rectangle);
	}
	
	void Area_circum_trapezium() {
		int a=s1.nextInt();
        int b=s1.nextInt();
        int c=s1.nextInt();
        int d=s1.nextInt();
        int h=s1.nextInt();
        int area_of_trapezium= (a+b)/2 * h;
        int circumf_of_trapezium=a+b+c+d;
        System.out.println("Area_of_trapezium="+area_of_trapezium);
        System.out.println("Circumf_of_trapezium="+circumf_of_trapezium);
	}
	

}
