import java.util.Scanner; //import Statement

public class compound_interest
{
	public static void main(String[]args)
	{
		//new compound_interest object
		compound_interest payment = new compound_interest();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your interest rate:");
		
		//search for next double that the user enters
		double r = kb.nextDouble();
		
		System.out.println("Please enter the principal, or the original amount you intend to borrow:");
		
		//search for next double that the user enters
		double P = kb.nextDouble();
		
		System.out.println("Please enter the number of times the loan is compounded per year:");
		
		//search for the next double that the user enters
		double n = kb.nextDouble();
		
		System.out.println("Please enter the life of the loan in years:");
		
		//search for the next double that the user enters
		double t = kb.nextDouble();
		
		double formula = payment.interest(r, P, n, t);
		
		System.out.printf("Your total monthly payment is %10.2f\n", formula);
	}
	
	public double interest(double rate, double principal, double timescompounded, double life)
	{
		return ((principal*Math.pow(1+rate/timescompounded, timescompounded*life))/(12*life));
	}
}
