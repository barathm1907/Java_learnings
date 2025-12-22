package oops;
class ece
{
	void clg(String dept_paper) {
		System.out.println("Only degree");
	}
	void clg(String dept_paper,String skills) {
		System.out.println("get a Degree and Interview");
	}
	void clg(String dept_paper,String skills,String resume) {
		System.out.println("Can get job with degree");
	}
}
public class method_overloading {
	public static void main(String[] args) {
		ece barath=new ece();
		ece sanju=new ece();
		System.out.println("Barath ");
		barath.clg("Ece","Java","Updated resume");
		System.out.println("Sanju ");
		sanju.clg("Ece","C");
		
	}

}
