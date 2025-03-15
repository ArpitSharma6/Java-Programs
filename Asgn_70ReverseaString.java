package Batch51JavaPrograms;

public class Asgn_70ReverseaString {

	public static void main(String[] args) 
	{
		String s1= "Arpit Sharma is coding ";
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1= s1.charAt(i);
			reverse=reverse+c1;
		}
		System.out.print(reverse);
		
	}

}
