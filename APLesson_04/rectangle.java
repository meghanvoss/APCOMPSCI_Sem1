import java.util.Scanner; //import Statement

public class rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	
	public static void main(String[]args)
	{
		//new rectangle object
		rectangle perimeter = new rectangle();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length in inches:");
		
		//search for next double that the user enters
		l = kb.nextDouble();
		
		System.out.println("Please enter the width in inches:");
		
		//search for the next double that the user enters
		w = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = ((2*l) + (2*w));
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %1.5f sq ft around.\n", perimeter );
	}
}