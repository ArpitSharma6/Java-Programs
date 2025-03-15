package Batch51JavaPrograms;

public class Asgn_86StringBufferprog {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer ("Arpit Sharma ");
		s1.append("is coding ");
		System.out.println(s1);

		StringBuffer s2 = new StringBuffer ("Arpit Sharma ");
		s2.insert(6, "is a smart ");
		System.out.println(s2);
		
		StringBuffer s3= new StringBuffer("Arpit Sharma is the best ");
		s3.replace(20,25 ,"Bestest" );
		System.out.println(s3);
		

		StringBuffer s4= new StringBuffer("Arpit Sharma is the best ");
		s4.delete(13, 16);
		System.out.println(s4);
		
		StringBuffer s5= new StringBuffer("Arpit Sharma loves to code ");
		s5.reverse();
		System.out.println(s5);
		
		StringBuffer s6= new StringBuffer("Arpit Sharma is the best ");
		s6.capacity();
		System.out.println(s6);
		
		StringBuffer s7 = new StringBuffer("Arpit sharma is winning ");
		s7.substring(6);
		System.out.println(s7.substring(6));
		
		
		
		
	}

}
