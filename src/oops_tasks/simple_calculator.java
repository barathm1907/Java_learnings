package oops_tasks;

import java.util.Scanner;

class calculator
{
	void add()
	{
		System.out.println();
		System.out.println("Enter 1st number =");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number =");
		Scanner sc1= new Scanner(System.in);
		int n2=sc1.nextInt();
		int ans=n1+n2;
		System.out.println("The sum is "+ans);
		
	}
	void subract()
	{
		System.out.println();
		System.out.println("Enter 1st number =");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number =");
		Scanner sc1= new Scanner(System.in);
		int n2=sc1.nextInt();
		int ans=n1-n2;
		System.out.println("The difference is "+ans);
	}
	void multiply()
	{
		System.out.println();
		System.out.println("Enter 1st number =");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number =");
		Scanner sc1= new Scanner(System.in);
		int n2=sc1.nextInt();
		int ans=n1*n2;
		System.out.println("The product is "+ans);
	}
	void divide()
	{
		System.out.println();
		System.out.println("Enter 1st number =");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number =");
		Scanner sc1= new Scanner(System.in);
		int n2=sc1.nextInt();
		int ans=n1/n2;
		System.out.println("The division is "+ans);
	}
}

public class simple_calculator {
public static void main(String[] args) {
	calculator obj=new calculator();
	obj.add();
	obj.subract();
	obj.multiply();
	obj.divide();
}
}
