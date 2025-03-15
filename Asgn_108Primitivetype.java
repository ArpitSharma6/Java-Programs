package Batch51JavaPrograms;

public class Asgn_108Primitivetype {

	public static void main(String[] args) {
	
		double d1 = 100;
		System.out.println(d1);// this is implicit syntax
		// widening can be done in 2 ways Impicitly ,explicitly
		// narrowing can only be done in explicitly .
		
		double d2 = (double)100;
		System.out.println(d2);// Explicitly 
		
		// this program is widening//
		
		int a =19;
		double d3= a;
		System.out.println(d3);
		
		
		//Problem 2: Lets Convert Double into int
		int c = (int) 3.14; 
		System.out.println(c);
		//Narrowing which can be done explicitly
		
	}

}
