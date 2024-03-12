package assignments;

public class Asgmnt51_check_String_containsSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Kavitha patali";
		char[] c1=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isSpaceChar(c1[i]);
		
       if(answer==true)
       {
    	   System.out.println("The given string contains space");
	}
	}
}
}