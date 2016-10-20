import java.util.Scanner; //import Statement

public class Password_Program
{
	static Scanner kb;
	static String username;
	static String password;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		username = "MrRobinette";
		password = "ismyteacher";
		
		passCheck();
		
		
	}
	
	public static void passCheck()
	{
		
		System.out.println("What is your username?");
		String useruser = kb.next();
		System.out.println("What is your password?");
		String userpass = kb.next();
		if (useruser.equals(username)) {
			if (userpass.equals(password)) {
				System.out.println("You are granted access!");
			} else {
				System.out.println("Your password is incorrect!");
				passCheck();
			}
		} else {
			if (userpass.equals(password)) {
				System.out.println("Your username is incorrect!");
				passCheck();
			} else {
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}
}