package Batch51JavaPrograms;
import java.util.Scanner;

public class Asgn_34AreaofSquare {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the value of side");
		Scanner s1 = new Scanner (System.in);
		double side = s1.nextDouble();
		double area = side*side;
		System.out.println(area);
		s1.close();
		
	}

}
