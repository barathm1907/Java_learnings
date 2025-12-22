package oops;

import java.util.Scanner;

class signin
	{	
			String username="sona";
			String password="1234";
			void s_data()
			{
				System.out.println("User name is = "+username);
				System.out.println("Password is = "+password);
			}
	}
class login extends signin
	{
		void l_data()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username");
			String uname=sc.nextLine();
			
			if(uname.equals(username))
			{
				System.out.println("Correct username");
				System.out.println("Enter password");
				String passwrd=sc.nextLine();
					if(passwrd.equals(password))
					{
						System.out.println("Correct password");
					}
					else
						{
							System.out.println("Incorrect password");
							System.out.println("Want to reset password");
							String res=sc.nextLine();
							if(res.equals("Yes"))
								{reset.r_data();}
							else
								{System.out.println("Exit");}
			}
		}
			else
				System.out.println("Incorrect username");
	}
	}
class reset
	{
		static void r_data()
		{	
			System.out.println("Enter new password");
			Scanner sc=new Scanner(System.in);
			String newpassword=sc.nextLine();
			System.out.println("New password is "+newpassword);
		}
	}
public class hierarchy {
	public static void main(String[] args) {
		login obj=new login();
		reset obj1=new reset();
		
		obj.l_data();
		
	}

}
	
