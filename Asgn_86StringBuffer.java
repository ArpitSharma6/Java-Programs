package Batch51JavaPrograms;

public class Asgn_86StringBuffer {

	public static void main(String[] args) {
		String s1= new String("Arpit Sharma");
		String s2= s1.concat("is winning ");
		System.out.println(s1);
		
		//String is unmutable //
		// Strimg builder is mutable //
		
		StringBuilder s3= new StringBuilder("Arpit Sharma");
		StringBuilder s4 = s3.append("Is winning");
		System.out.println(s3);

		StringBuffer s5 = new StringBuffer("Arpit Sharma ");
		StringBuffer s6= s5.append("is coding ");
		System.out.println(s5);
		
		
		
		
	}

}
