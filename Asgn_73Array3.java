package Batch51JavaPrograms;

import java.util.Arrays;

public class Asgn_73Array3 {

	public static void main(String[] args) 
	{
		int [] rollnumber  = new int [4];
		rollnumber [0]=45;
		rollnumber [1]=25;
		rollnumber [2]=35;
		rollnumber [3]=55;
		
		int [] rollnumber2  = new int [4];
		rollnumber2 [0]=46;
		rollnumber2 [1]=25;
		rollnumber2 [2]=34;
		rollnumber2 [3]=51;
		
		
		boolean b1 = Arrays.equals(rollnumber, rollnumber2);
		System.out.println(b1);
	}
	

}
