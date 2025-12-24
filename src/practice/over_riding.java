package practice;
class eee{
	void sub(String name,double fee,double dis_per)
	{
		System.out.println("Name of the course : "+name);
		fee=(fee-dis_per);
		System.out.println("Fees after discount : "+fee);
	}
}
class mec extends eee{
	@Override
	void sub(String name,double fee,double dis_per)
	{
		super.sub(name, fee, dis_per);
		System.out.println("Name of the course : "+name);
		System.out.println("Your fee is : "+fee);
		fee=(fee-dis_per);
		System.out.println("Fees after discount : "+fee);
	}
	
}
class cse extends eee{
	@Override
	void sub(String name,double fee,double dis_per)
	{
		System.out.println("Name of the course : "+name);
		System.out.println("Your fee is : "+fee);
		fee=(fee-dis_per);
		System.out.println("Fees after discount : "+fee);
	}
	
}
public class over_riding {
	public static void main(String[] args) {
		eee obj=new cse();
		obj.sub("Linear Algebra",2200.50f , 200.75);
//		eee obj1=new ece();
//		eee obj2=new mec();
//		
	}

}
