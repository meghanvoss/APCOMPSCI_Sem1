import java.util.Scanner; //import Statement

public class circle
{
	static double r;
	static double area;
	
	
	public static void main(String[]args)
	{
		//new circle object
		circle Area = new circle();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle:");
		
		//search for next double that the user enters
		r = kb.nextDouble();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (3.1415*r*r);
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %5.2f is %10.5f sq ft around.\n", r, area );
	}
}