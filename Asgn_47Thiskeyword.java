package Batch51JavaPrograms;

public class Asgn_47Thiskeyword 
{
	String name ;
	double salary;
	int age;
	void student_details (String name , double salary , int age ) 
	{
		this.name = name;
		this.salary = salary;
		this.age = age;
		System.out.println("The name of student is: " + name );
		System.out.println("The salary  of student is " + salary);
		System.out.println("The name of student is " + age  );
	}
	
	public static void main(String[] args) 
	{
		Asgn_47Thiskeyword s1 = new Asgn_47Thiskeyword ();
		s1.student_details("Arpit Sharma", 45000,29);
		System.out.println(s1.name);
		System.out.println(s1.salary);
		System.out.println(s1.age);
	

}
}