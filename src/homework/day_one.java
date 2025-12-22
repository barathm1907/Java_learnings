package homework;

import java.util.*;

public class day_one {
	public static void main(String[] args) {
		
		//Basics
		System.out.println("Hello World");
		System.out.println("Barath");
		System.out.println("20");
		System.out.println("Salem");
		
		
		//Operations
		//Question 3
		int a=10;
		int b=12;
		int temp=0;
		System.out.println("After Swap "+(a+" "+b));
		temp=a;
		a=b;
		b=temp;
		System.out.println("Before Swap "+(a+" "+b));
		
		
		//Question 4
		System.out.println("Enter Radius value ");
		Scanner r=new Scanner(System.in);
		int r1=r.nextInt();
        double area = 3.14 * r1 * r1; 
        System.out.println("Radius = "+r1);
        System.out.println("Area = "+area);
        
        
        //Question 5
        System.out.println("Enter Celcius ");
        Scanner cel=new Scanner(System.in);
        float cel1=cel.nextFloat();
        float Farenheit= (cel1 * 9 / 5) + 32;
        System.out.println("Farenheit is = "+Farenheit);
        
        
        //Question 6
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n % 10;
        System.out.println("Last digit = " + last);
        
        
        //if-else
        //Question 7
        System.out.print("Enter a number: ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        if(num1 % 2 ==0)
        	System.out.println("The Number is Even");
        else
        	System.out.println("The Number is Odd");
        
        
        //Question 8
        System.out.print("Enter number 1 : ");
        Scanner sc1 = new Scanner(System.in);
        int NUM1 = sc1.nextInt();
        System.out.print("Enter number 2: ");
        Scanner sc2 = new Scanner(System.in);
        int NUM2 = sc2.nextInt();
        System.out.print("Enter number 3: ");
        Scanner sc4 = new Scanner(System.in);
        int NUM3 = sc4.nextInt();
        if (NUM1 > NUM2 && NUM1 > NUM3)
            System.out.println("Number 1 is greatest: " + NUM1);
        else if (NUM2 > NUM3)
            System.out.println("Number 2 is greatest: " + NUM2);
        else
            System.out.println("Number 3 is greatest: " + NUM3);
        
        
        
        //Question 9
        System.out.print("Enter a character: ");
        char ch = sc4.next().charAt(0);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
        
        //Question 10
        System.out.print("Enter year : ");
        Scanner sc5 = new Scanner(System.in);
        int year = sc5.nextInt();
        if ((year % 4 == 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
        
        
        //Question 11
        System.out.print("Enter number: ");
        Scanner sc6 = new Scanner(System.in);
        int Num = sc6.nextInt();
        if (Num % 7 == 0 || Num % 10 == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
        
        
        
        //question 12
        Scanner sc7 = new Scanner(System.in);

        System.out.print("Enter number: ");
        int nUm = sc7.nextInt();

        int sq = nUm * nUm;
        int temp1 = nUm;
        int pow = 1;

        while (temp1 > 0) {
            pow = pow * 10;
            temp1 = temp1 / 10;
        }

        if (sq % pow == nUm)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");   
	}
 
}
