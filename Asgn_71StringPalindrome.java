package Batch51JavaPrograms;

public class Asgn_71StringPalindrome {

	public static void main(String[] args) 
	{
		String s1= "radar";
		String reverse= "";
		for(int i= s1.length()-1;i>=0;i--) 
		{
			char c1= s1.charAt(i);
			reverse =reverse + c1;			
		}
			System.out.print(reverse);
			
		if(s1.equals(reverse))
		{
			System.out.println("The word is palindrome");
			
		}
		else
		{
			System.out.println("The word is not a palindrome");
		}
	
	}

}
