package Batch51JavaPrograms;

import java.util.Scanner;

public class Asgn_106Switchcase {

	public static void main(String[] args) {
		Scanner s1= new Scanner (System.in);
		System.out.println("Please Select Borwser ");
		System.out.println("Please 1 for Chrome  Borwser ");
		System.out.println("Please 2 Microsoft edge Borwser ");
		switch (1)
		{
			case 1:System.out.println("Launch Chrome Browser ");
			//ChromeDriver d1 = new ChromeDriver();
			break;
// without break statement multiple will execute
			case 2:System.out.println("Launch Microsoft Edge  ");
		
			break;

			default :System.out.println("Selection is worng ");
							
		}
		s1.close();
	}
	

}
