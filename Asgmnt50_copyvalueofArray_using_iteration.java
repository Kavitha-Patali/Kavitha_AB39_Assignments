package assignments;

import java.util.Arrays;

public class Asgmnt50_copyvalueofArray_using_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		int array2[]=new int[array.length];
		for(int i=0;i<5;i++) {
        array2[i]=array[i];
        }
System.out.println("array is"+Arrays.toString(array));
System.out.println("array2 is"+Arrays.toString(array2));
}
}
