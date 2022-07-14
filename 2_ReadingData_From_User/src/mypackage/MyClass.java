package mypackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		String name;
		float salary;
		int age;
		
		System.out.println("Enter your namr:");
		name = obj.nextLine();
		
		System.out.println("Enter your salary:");
		salary = obj.nextFloat();
		
		System.out.println("Enter your age:");
		age = obj.nextInt();
		
		
		System.out.println("Name = "+name);
		System.out.println("salary = "+salary);
		System.out.println("age = "+age);
	}
}
