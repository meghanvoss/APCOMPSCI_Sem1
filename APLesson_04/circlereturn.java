import java.util.Scanner; //import Statement

public class circlereturn
{
	
	public static void main(String[]args)
	{
		//new circle object
		circle Area = new circle();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle:");
		
		//search for next double that the user enters
		double r = kb.nextDouble();
		
		print("The area of a circle with a radius of " + r + " is ", calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return (3.1415*r*r);
	}
	
	public static void print(String text, double area)
	{
		System.out.printf(text + area);
	}
}