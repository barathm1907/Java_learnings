package assessment;

import java.util.Scanner;

class one{
	 void reverse()
	{	System.out.println("Enter a word =");
		Scanner sc= new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=n.length()-1;i>=0;i--)
		{
			System.out.print("Reversed ans = "+n.charAt(i));
		}
	}
}
class two{
	void palindrome()
	{
		System.out.println();
		System.out.println("Enter number =");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		int sum=0;
		while(n>0)
		{
			int num=n%10;
			sum=(sum*10)+num;
			n/=10;
		}
		if(sum==org)
		{
		 System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
}
class three{
	void fibinnacci_series()
	{
		System.out.println();
		int a=0;
		int b=1;
		int s=0;
		System.out.println("Enter number =");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Fibonacci Series is "+a+" "+b);
		for(int i=0;i<n;i++)
		{
			s=a+b;
			a=b;
			b=s;
			System.out.print(" "+s);
		}

	}
}
class four{
	void factorial()
	{
		
		System.out.println("Enter number =");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=n;
		while(n!=0)
		{
			sum=sum*n-1;
		}
		System.out.println(sum);
	}
}
class five{
	void isprime()
	{
		System.out.println("Enter number =");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0||n<=1)
		{
			System.out.println("Not a Prime");
		}
		if(n==2)
			System.out.println("Prime number");
		for(int i=3;i*i<=n;i+=2)
		{
			if(n%i==0)
				System.out.println("Not a Prime");			
		}
			System.out.println("Prime number");
	}
}
public class final_prog {
	public static void main(String[] args) {
		one obj1=new one();
		two obj2=new two();
		three obj3 = new three();
		four obj4=new four();
		five obj5=new five();
//		obj1.reverse();
//		obj2.palindrome();
//		obj3.fibinnacci_series();
//		obj4.factorial();
		obj5.isprime();
	}
}
