import java.util.Scanner; //import Statement

public class rectangle
{
	static double = length;
	static double = width;
	static double = perimeter;
	
	
	public static void main(String[]args)
	{
		//new rectangle object
		rectangle perimeter = new rectangle();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length in inches:");
		
		//search for next double that the user enters
		double length = kb.nextDouble();
		
		System.out.println("Please enter the width in inches:");
		
		//search for the next double that the user enters
		double width = kb.nextDouble();
		
		double formula = perimeter.calc(l, w);
		
		double perimeter = (2*length) + (2*width);
		
		System.out.printf("Your rectangle is %10.2f\n sq ft around", formula);
	}
	
	public double calc(double length, double width, double perimeter)
	{
		return ((2*length) + (2*width));
	}
}