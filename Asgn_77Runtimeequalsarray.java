package Batch51JavaPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class Asgn_77Runtimeequalsarray 
{

	public static void main(String[] args) 
	
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter the value of first array index ");
		int sum[] = new int [s1.nextInt()];
		System.out.println("Enter the value of second array index ");
		int sum2 [] = new int [s1.nextInt()];
		
		for( int i=0; i<sum.length ;i++)
		{
			
			System.out.println("Enter the value of array at  " + i);
			sum[i]= s1.nextInt();
		}
		
		for( int i=0; i<sum2.length ;i++)
		{
			
			System.out.println("Enter the value of array at " + i);
			sum2[i]= s1.nextInt();
		}
		
		boolean b1 = Arrays.equals(sum, sum2);
		System.out.println(b1);
		
		

	}

}
