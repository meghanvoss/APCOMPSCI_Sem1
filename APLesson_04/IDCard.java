import java.util.Scanner; //import Statement

public class IDCard
{
	
	public static void main(String[]args)
	{
		//new IDCard object
		IDCard form = new IDCard();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		
		//prompt for user input
		String firstname = kb.nextLine();
		
		System.out.println("Please enter your last name:");
		
		//prompt for user input
		String lastname = kb.nextLine();
		
		System.out.println("Please enter your title:");
		
		//prompt for user input
		String title = kb.nextLine();
		
		System.out.println("Please enter the school site:");
		
		//prompt for user input
		String school = kb.nextLine();
		
		System.out.println("Please enter the school year:");
		
		//search for next int that the user enters
		int year = kb.nextInt();
		
		System.out.println("Please enter your subject:");
		
		kb.nextLine();
		
		//prompt for user input
		String subject = kb.nextLine();
		
		System.out.println("*******************");
		form.card(firstname, lastname, title, school, year, subject);
		System.out.println("\n");
		System.out.println("*******************");
		
	}
	
	public void card(String firstname, String lastname, String title, String site, int year, String subject)
	{
		System.out.printf("%s %13s* \n*%s %9s* \n*%s %13s*", firstname, lastname, title, site, year, subject);
	}
}	