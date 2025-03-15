package Batch51JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Asgn_77Runtimeequalsarray2 {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int rollnumber []= new int [s1.nextInt()];
		System.out.println("Enter the size of second array");
		int rollnumber2 []= new int [s1.nextInt()];
		

		
		for( int i=0; i<rollnumber.length ;i++)
		{
			System.out.println("Enter the value of 1st array at  " + i);
			rollnumber[i]= s1.nextInt();
			System.out.println("Enter the value of 2nd array at  " + i);
			rollnumber2[i]= s1.nextInt();
			
		}
		
		
		if (Arrays.equals(rollnumber, rollnumber2)) 
		{ 
			System.out.println("The Arrays are equal  ");
			
		}
		else 
		{
			System.out.println("The arrays are not equal");
		}

}
}
