import java.util.Scanner; //import Statement

public class averagereturn
{
	
	public static void main(String[]args)
	{
		//new average object
		average calc = new average();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first value:");
		
		//search for next double that the user enters
		double num1 = kb.nextDouble();
		
		System.out.println("Please enter the second value:");
		
		//search for the next double that the user enters
		double num2 = kb.nextDouble();
		
		System.out.println("Please enter the third value:");
		
		//search for the next double that the user enters
		double num3 = kb.nextDouble();
		
		print("The average of " + num1 + ", " + num2 + ", and " + num3 + " is ", calcAverage(num1, num2, num3));
	}
	
	public static double calcAverage(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print(String text, double average)
	{
		System.out.printf(text + average );
	}
}