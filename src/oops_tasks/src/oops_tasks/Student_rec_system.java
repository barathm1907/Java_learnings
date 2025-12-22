package oops_tasks;

import java.util.Scanner;

class Student {

    int m1,m2,m3;
    
    int calculateTotal() {
    	System.out.println("Enter 1st mark =");
		Scanner sc= new Scanner(System.in);
		int m1=sc.nextInt();
		System.out.println("Enter 2nd mark =");
		Scanner sc1= new Scanner(System.in);
		int m2=sc1.nextInt();
		System.out.println("Enter 3rd mark =");
		Scanner sc3= new Scanner(System.in);
		int m3=sc.nextInt();
        return m1+m2+m3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void displayResult() {
    	System.out.println("Enter roll number =");
		Scanner sc= new Scanner(System.in);
		int roll=sc.nextInt();
		System.out.println("Enter Name =");
		Scanner sc1= new Scanner(System.in);
		String name=sc1.nextLine();
        System.out.println("Roll No: " + roll);
        System.out.println("Name   : " + name);
        System.out.println("Total  : " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println();
    }
}

public class Student_rec_system extends Student{
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.displayResult();
        s2.displayResult();
    }
}



