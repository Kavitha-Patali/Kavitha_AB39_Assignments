package assignments;

public class Asgmnt49_no_of_splchar_alpha_num_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "sky is 441 !@#";
		char c[]= name.toCharArray();
		int count_of_alpha=0;
		int count_of_digit=0;
		int count_of_space=0;
		for (int i=0;i<=name.length()-1;i++)
		{
			boolean alpha=Character.isAlphabetic(c[i]);
			boolean digit=Character.isDigit(c[i]);
			boolean space=Character.isSpaceChar(c[i]);
			if(alpha==true)
			{
				count_of_alpha++;
				
			}
			if(digit==true) {
				count_of_digit++;
				
			}

			if(space==true) {
				count_of_space++;
			}
		}
		int count_of_Splchar=name.length()-(count_of_alpha+count_of_digit+count_of_space);
		System.out.println("No.of Alpha= "+count_of_alpha);
		System.out.println("No.of Digits= "+count_of_digit);
		System.out.println("No.of Space= "+count_of_space);
		System.out.println("No.of Spl char= "+count_of_Splchar);
	}

}
