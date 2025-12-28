package collections;

import java.util.*;

public class collect {
public static void main(String[] args) {
	ArrayList<Integer> a =new ArrayList<Integer>();
	//Integer allows only int to return
	a.add(11);
	a.add(22);
	a.add(33);
	a.add(44);
	a.add(10);
//	a.add("hi");
	System.out.println(a);
//	ArrayList<Object> a1 =new ArrayList<Object>();
//	//Object denotes to accept all type of datatype
//	a1.add(5);
//	a1.add("hi");
//	a1.add(54.25);
//	a1.add(true);
	
	Object p=(a.clone());
	System.out.println(p);
	System.out.println(a.contains(11));
	System.out.println(a.hashCode());
	System.out.println(a.indexOf(11));
	System.out.println(a.isEmpty());
	System.out.println(a.lastIndexOf(22));
	System.out.println(a.remove(0));
	System.out.println(a.size());
	System.out.println(a.get(1));
	System.out.println(a.set(0, 11));
	System.out.println(a);
	a.sort(null);
	System.out.println(a);
	
}
}
