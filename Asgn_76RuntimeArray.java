package Batch51JavaPrograms;
import java.util.Scanner;
public class Asgn_76RuntimeArray {

	public static void main(String[] args) 
	{
		//Scanner s1= new Scanner(System.in);
		//double age [] = new double[s1.nextDouble()];// double is not accepting this 

		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int age [] = new int [s1.nextInt()];
			
		for (int i=0 ; i<age.length;i++)
		{
			
			System.out.print("Enter the value at index "+i);
			age[i]=s1.nextInt();
		}
		
		
				
}
}
