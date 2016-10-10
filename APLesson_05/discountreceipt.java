import java.util.Scanner;
public class discountreceipt
{
	static double discountamount = 0;
	
	public static void main(String[]args)
	{
		//new receipt object
		discountreceipt form = new discountreceipt();
		
		
		
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
		kb.nextLine();
		
		System.out.println("Please enter item 4:");
		
		//prompt for user input
		String item4 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		
		//search for next double that the user enters
		double price4 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		
		double Subtotal = price1 + price2 + price3 + price4;
		form.format("Subtotal: ", Subtotal);
		
		double Tax = .08 * Subtotal;
		form.format("Tax: ", Tax);
		
		discount(Subtotal);
		form.format("Discount: ", discountamount);
		
		double Total = Subtotal - discountamount + Tax;
		form.format("Total: ", Total);
		
		System.out.println(" __________________________________");
		
		System.out.println("* Thank you for your support *");
	}
	
	
	public static void discount(double Subtotal)
	{
		boolean discount = Subtotal >= 2000;
		
		if(discount)
		{
			discountamount = .15 * Subtotal;
		}

		if(!discount)
		{
			discountamount = 0;
		}

	}
	
	public static void format(String item, double price)
	{
		System.out.printf("*%20s %-10.2f*\n", item, price);
	}
	
}