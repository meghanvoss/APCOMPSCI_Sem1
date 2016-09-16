import java.util.Scanner; //import Statement

public class receipt
{
	
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		
		//prompt for user input
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		
		//search for next double that the user enters
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 2:");
		
		//prompt for user input
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		
		//search for next double that the user enters
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 3:");
		
		//prompt for user input
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		
		//search for next double that the user enters
		double price3 = kb.nextDouble();
		
		form.format(item1, price1, item2, price2, item3, price3);
	}
	
	public void format(String item1, double price1, String item2, double price2, String item3, double price3)
	{
		System.out.printf("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
	}
}