package assessment;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
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