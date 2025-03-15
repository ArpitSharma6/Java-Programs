package Batch51JavaPrograms;
import java.util.Scanner; 

public class Asgn_10Vote {

	 static int a ;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner (System.in);
		System.out.println ("Enter the value of a");
		int a = s.nextInt();
		
		if (a >= 18 )
		{
			System.out.println("can vote");
		}
		else
		{
			System.out.println("not eligible");
		}

	}

}