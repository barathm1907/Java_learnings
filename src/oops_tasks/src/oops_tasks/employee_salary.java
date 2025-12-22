package oops_tasks;

import java.util.Scanner;

class employee 
{
	void empId ()
	{
		System.out.println("Enter your emp Id =");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The emp Id is = "+n);
		
	}
	void empName()
	{
		System.out.println("Enter your name =");
		Scanner sc= new Scanner(System.in);
		String n=sc.nextLine();
		System.out.println("Name ="+n);
	}
	void basicSalary()
	{
		System.out.println("Enter your Salary =");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
//		System.out.println("Do you have any other income ? (Y/N) ");
//		char c=sc.next()charAt(0);
		System.out.println("Total Salary is "+n);
		
		
	}
}
public class employee_salary {
public static void main(String[] args) {
	employee obj=new employee();
//	obj.empId();
//	obj.empName();
	obj.basicSalary();
}
}
