package Batch51JavaPrograms;

import java.util.Arrays;

public class Asgn_82AnagramString {

	public static void main(String[] args) {
	
		String s1= "Act";
		String s2= "cate";
		
		if(s1.length() == s2.length())
		{
		
			System.out.println("They are anagram");
			char c1[] = s1.toCharArray();
			char c2[]= s2.toCharArray();
			
			Arrays.sort(c1);
			System.out.println("after sorting is "+ Arrays.toString(c1) );
			Arrays.sort(c2);
			System.out.println("after sorting is " + Arrays.toString(c2));
			boolean b1 = Arrays.equals(c1, c2);
					
		}
		else
		{
			System.out.println("They are not anagram");
			
			

		}
	}

}
