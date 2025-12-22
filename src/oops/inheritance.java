package oops;

public class inheritance {
public static void main(String[] args) {
states s=new states();
System.out.println(s.kerala());
System.out.println(s.tamilnadu());
System.out.println(s.india());
}
}
class country{
	String india()
	
	
	
	{
		return "WELCOME TO INDIA";
	}
}
class states extends country
{
	String tamilnadu()
	{
		return "VANAKAM";
	}
	String kerala()
	{
		return "NAMASKAARAM 🙏🏻";
	}
}