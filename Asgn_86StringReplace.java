package Batch51JavaPrograms;

public class Asgn_86StringReplace {

	public static void main(String[] args) {
		String s1= "Arpit Sharma is coding ";
		String s2= s1.replace('i', 'a');
		System.out.println(s2);

		String s3= "Arpit Sharma is hardworking";
		String s4= s3.replace("is", "as");
		System.out.println(s4);
		
		String s5 = "Arpit Sharma is winning ";
		
		String s6 = s5.replaceAll("[A-Z]", "");
		System.out.println(s6);
		
		String s7 = "Arpit Sharma is 1 hero ";
		String s8= s7.replaceAll("[0-9]","one");
		System.out.println(s8);
		
	}

}
