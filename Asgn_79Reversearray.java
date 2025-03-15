	package Batch51JavaPrograms;

import java.util.Arrays;

public class Asgn_79Reversearray {
	
		public static void main(String[] args) 
		{
			int arpit []= new int [4];
			arpit[0] = 65;
			arpit[1] = 55;
			arpit[2] = 25;
			arpit[3]= 45;
			
			int sharma[]= new int [arpit.length];
			
			for (int i=0,j=3; i<=arpit.length-1;i++,j--)
			{
				sharma[j]=arpit[i];
			
			}
		
			System.out.println("Reverse of array is "+ Arrays.toString(arpit));
			System.out.println("Reversed array is "+ Arrays.toString(sharma));
			
						
		}
	
	}
