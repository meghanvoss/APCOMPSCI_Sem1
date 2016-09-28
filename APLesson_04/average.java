import java.util.Scanner; //import Statement

public class average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	
	public static void main(String[]args)
	{
		//new average object
		average calc = new average();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first value:");
		
		//search for next double that the user enters
		num1 = kb.nextDouble();
		
		System.out.println("Please enter the second value:");
		
		//search for the next double that the user enters
		num2 = kb.nextDouble();
		
		System.out.println("Please enter the third value:");
		
		//search for the next double that the user enters
		num3 = kb.nextDouble();
		
		calcAverage();
		print();
	}
	
	public static void calcAverage()
	{
		avg = (num1 + num2 + num3)/3;
	}
	
	public static void print()
	{
		System.out.printf("The average of %2.2f, %2.2f, and %2.2f is %2.5f.", num1, num2, num3, avg );
	}
}