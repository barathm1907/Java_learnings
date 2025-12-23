package practice;
class ece
{	int total = 100;
	void attendance(int present)
	{
		int percentage= (present*100)/total;
		System.out.println(percentage);
		
	}
	void attendance(int present,int onduty)
	{
		int percentage= ((present+onduty)*100)/total;
		System.out.println(percentage);
	}
}
public class dept {
public static void main(String[] args) {
	ece obj=new ece();
	
	obj.attendance(50,50);
	
}
}
