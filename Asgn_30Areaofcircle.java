package Batch51JavaPrograms;
import java.util.Scanner;

public class Asgn_30Areaofcircle 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the radius ");
		Scanner s1 = new Scanner(System.in);
		 double radius = s1.nextDouble();
		 
		  double area = 3.14*radius*radius;
		  System.out.println(area);
		  s1.close();
	}
	
}
