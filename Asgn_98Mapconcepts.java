package Batch51JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Asgn_98Mapconcepts {

	public static void main(String[] args)
	{	
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the no. of accounts ");
		int I1 = s1.nextInt();
		s1.nextLine();
		for (int i= 0 ; i<I1;i++ )
		{
			System.out.println("Enter the account number ");
			int I2 = s1.nextInt();
			s1.nextLine();
			System.out.println("Enter the account holder name  ");
			String S1= s1.next();
			
			m1.put(I1, S1);	
			
			
		}
		System.out.println("\nStored Account Details:");
        for (Map.Entry<Integer, String> entry : m1.entrySet()) {
            System.out.println("Account Number = " + entry.getKey() + ", Name = " + entry.getValue());
        }
        
        s1.close();

}
}