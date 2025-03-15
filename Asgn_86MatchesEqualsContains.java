package Batch51JavaPrograms;

public class Asgn_86MatchesEqualsContains {

	public static void main(String[] args)
	{  // .dot can be any character //
		String s1 ="Arpit";
		boolean b1= s1.matches(".....");	
		System.out.println(b1);
		// String ends with t
		
		boolean b2= s1.matches("(.)*t"); //(.)* represents multi character //
		System.out.println(b2);
		
		boolean b3= s1.matches("A(.)*");// represents multi character //
		System.out.println(b3);
		
		
		String s2= "Spiderman";
		boolean b4 = s2.matches("(.)*man(.)*");
		System.out.println(b4);
		
		
	}

}
