package oops_tasks;
class student
{
	void displayDetails()
	{
		String name="Barath";
		int marks=95;
		System.out.println(name+" "+marks);
	}
}
public class student_details {
	public static void main(String[] args) {
		student obj=new student();
		obj.displayDetails();
	}

}
