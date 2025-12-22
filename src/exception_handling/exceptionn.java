package exception_handling;

import java.util.Scanner;

public class exceptionn {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
try {
	int a=sc.nextInt();
	System.out.println(a);
	int b=sc.nextInt();
	System.out.println(b);
	int c=sc.nextInt();
	System.out.println(c);
	}
catch(Exception e)
{
	System.out.println(e);
}
finally 
{
	System.err.println("Demo");
}
}
}
