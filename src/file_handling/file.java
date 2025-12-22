package file_handling;

import java.io.*;
import java.util.*;

public class file {
public static void main(String[] args) throws IOException {
	System.out.println("Enter File name");
	Scanner sc = new Scanner(System.in);
	String file_name=sc.nextLine();
	File f=new File("C:\\Users\\HP\\Desktop\\File handling\\sanjay.txt");
	f.createNewFile();
System.out.println("File created successfully");
	FileWriter fw=new FileWriter(f);
	int c=97;
	fw.write(c);
	fw.write( "Vanakam  ");
	fw.append("Hello w");
//	FileReader fr=new FileReader(f);
//	Scanner d=new Scanner(fr);
//	while(d.hasNext()) {
//		System.out.println(d.nextLine());
//	}

//	System.out.println(fr.read());
	
	
	fw.flush();
	fw.close();
//	fr.close();
	System.out.println(f.delete());

}
}
