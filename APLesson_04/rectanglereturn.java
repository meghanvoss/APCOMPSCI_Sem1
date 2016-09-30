import java.util.Scanner; //import Statement

public class rectanglereturn
{
	
	public static void main(String[]args)
	{
		//new rectangle object
		rectangle perimeter = new rectangle();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length in inches:");
		
		//search for next double that the user enters
		double l = kb.nextDouble();
		
		System.out.println("Please enter the width in inches:");
		
		//search for the next double that the user enters
		double w = kb.nextDouble();
	
		print(calcPerim(l, w));
	}
	
	public static double calcPerim(double l, double w)
	{
		return ((2*l) + (2*w));
	}
	
	public static void print(double perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " ft around." );
	}
}