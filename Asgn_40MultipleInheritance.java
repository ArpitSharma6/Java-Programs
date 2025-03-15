package Batch51JavaPrograms;
import java.util.Scanner;

class parentclassA
{
	static void areaofcirlce(Scanner s1) 
	{
		System.out.println("Enter the value of r");
		double r = s1.nextDouble();
		double area = 3.14 *r*r;
		System.out.println("The area of circle is : " + area);
		
	}
}

class ParentclassB extends parentclassA	
{
	static void circumferencecirlce(Scanner s1) 
	{
		System.out.println("Enter the value of r");
		double r = s1.nextDouble();
		double circumference = 2*3.14*r;
		System.out.println("The area of circle is : " + circumference);
		
	}
}


public class Asgn_40MultipleInheritance extends ParentclassB
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		areaofcirlce(s1);
		circumferencecirlce(s1);
		
	}

}
