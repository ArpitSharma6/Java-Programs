package Batch51JavaPrograms;

import java.util.Arrays;

public class Asgn_83String {

	public static void main(String[] args) {
		int j=0;
		int k=0;
		int l=0;
		String s1= "@rpit Sharma is coding 1 ";
		char c1 [] = s1.toCharArray();
		
	//	System.out.println(Arrays.toString(c1));
		
		for (int i =0 ; i<=c1.length-1; i++)
		{
			// to count the entire string just put C1[0]
			
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
		if(b1==true)
		{
			j++;
		}
		if(b2==true)
		{
			k++;
		}
		if(b3==true)
		{
			l++;
		}	
		}
		int countofsepcialcharacter = s1.length()-(j + k + l);
		
		System.out.println("Alphabets are" + j);
		System.out.println("Digits are" + k);
		System.out.println("Spaces are " + l);
		System.out.println("Special character are " +countofsepcialcharacter);
	}

}
