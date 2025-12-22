package file_handling;

import java.io.*;
import java.util.*;



public class practise {
public static void main(String[] args) throws IOException {
	String product = null,qty = null;
	int total=0,price=0;
	File f=new File("C:\\Users\\HP\\Desktop\\File handling\\bill.txt");
	f.createNewFile();
	System.out.println("File Created");
	FileWriter fw = new FileWriter(f);
	FileReader fr = new FileReader(f);
System.out.println("Enter Date =");
	Scanner sc=new Scanner(System.in);
	String date=sc.nextLine();
	System.out.println("Enter Time =");
	String time=sc.nextLine();
	System.out.println("Enter No of Products = ");
	int no_product=sc.nextInt();
	
	 fw.write("                  B Mart                \n");
	 fw.write("\n ");
		fw.write(" Date: "+date+"\n");
		fw.write(" Time: "+time+"\n");
		fw.write("----------------------------------------\n");
		fw.write("                  LIST                  \n");
		fw.write("Product           Quantity         Price \n");
	while(no_product>0)
	{
		int i=no_product;
		sc.nextLine();
		System.out.println("Enter name of product "+i+" = ");
		product=sc.nextLine();
		System.out.println("Enter the quantity of product "+i+" = ");
		 qty=sc.nextLine();
		System.out.println("Enter the price of product "+i+" = ");
		 price=sc.nextInt();
		fw.write(product+"                "+qty+"               "+price +"\n");
		total+=price;
		i--;
		no_product--; 
		
	}

	fw.write("                            Total = "+total+"\n");
	fw.write("----------------------------------------\n");
	fw.write("              THANK YOU FOR PURCHASING 🙏🏻       ");

	
	
	
	fw.flush();
	fw.close();
}
}
