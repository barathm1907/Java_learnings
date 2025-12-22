package oops_tasks;
class book
{
	void title()
	{
		System.out.println("Title is Atomic Habits. ");
	}
	void author()
	{
		System.out.println("The Author is James Clear.");
	}
	void price()
	{
		System.out.println("The price is $10");
	}
}
public class book_info {
public static void main(String[] args) {
	book obj=new book();
	obj.title();
	obj.author();
	obj.price();
}
}
