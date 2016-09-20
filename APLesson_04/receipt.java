import java.util.Scanner; //import Statement

public class receipt
{
	
	public static void main(String[]args)
	{
		//new receipt object
		receipt form = new receipt();
		
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
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		double Subtotal = price1 + price2 + price3;
		form.format("Subtotal: ", Subtotal);
		
		double Tax = .08 * Subtotal;
		form.format("Tax: ", Tax);
		
		double Total = Subtotal + Tax;
		form.format("Total: ", Total);
		
		System.out.println("* Thank you for your support *");
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%10s %10.2f", item, price);
	}
}