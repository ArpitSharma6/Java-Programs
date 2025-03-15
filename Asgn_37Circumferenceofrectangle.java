package Batch51JavaPrograms;

import java.util.Scanner;

public class Asgn_37Circumferenceofrectangle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the value of length");
		Scanner s1 = new Scanner(System.in);
		double length = s1.nextDouble();
		System.out.println("Enter the value of breadth");
		double breadth = s1.nextDouble();
		double circumference = 2*(length + breadth );
		System.out.println("The circumference of rectangle is : " + circumference);
		s1.close();
		
		
	}

}
