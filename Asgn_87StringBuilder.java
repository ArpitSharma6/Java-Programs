package Batch51JavaPrograms;

public class Asgn_87StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder ("Arpit Sharma ");
		s1.append("is coding ");
		System.out.println(s1);

		StringBuilder s2 = new StringBuilder ("Arpit Sharma ");
		s2.insert(6, "is a smart ");
		System.out.println(s2);
		
		StringBuilder s3= new StringBuilder("Arpit Sharma is the best ");
		s3.replace(20,25 ,"Bestest" );
		System.out.println(s3);
		

		StringBuilder s4= new StringBuilder("Arpit Sharma is the best ");
		s4.delete(13, 16);
		System.out.println(s4);
		
		StringBuilder s5= new StringBuilder("Arpit Sharma loves to code ");
		s5.reverse();
		System.out.println(s5);
		
		StringBuilder s6= new StringBuilder("Arpit Sharma is the best ");
		s6.capacity();
		System.out.println(s6);
		
		StringBuilder s7 = new StringBuilder("Arpit sharma is winning ");
		s7.substring(6);
		System.out.println(s7.substring(6));
		

	}

}
