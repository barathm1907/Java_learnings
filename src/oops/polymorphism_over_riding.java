package oops;
class barath
	{
		void java()
		{
			System.out.println("Barath ");
		}
	}
class sanjay extends barath
	{
		void java()
		{
			super.java();
			System.out.println("Sanjay ");
		}
	}
class balag extends sanjay
	{
		void java()
		{
			super.java();
			System.out.println("Balaganesh ");
		}
	}
public class polymorphism_over_riding {
public static void main(String[] args) {
	balag lab = new balag();
	lab.java();
	
}
}
