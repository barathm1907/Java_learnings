package oops;
interface barath1
	{
		void mark();
		void password();
	}
public class interface_method implements barath1 {
public static void main(String[] args) {
	interface_method obj=new interface_method();
	obj.password();
	obj.mark();
	
}

@Override
public void mark() {
	System.out.println(69);
	
}

@Override
public void password() {
	System.out.println("Barath1234");
	
}

}
