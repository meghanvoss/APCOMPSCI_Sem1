import java.util.Scanner; //import Statement

public class subwoofer_boxes
{
	public static void main(String[]args)
	{
		//new subwoofer_boxes object
		 subwoofer_boxes size = new subwoofer_boxes();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the height in inches:");
		
		//search for next double that the user enters
		double h = kb.nextDouble();
		
		System.out.println("Please enter the length in inches:");
		
		//search for the next double that the user enters
		double l = kb.nextDouble();
		
		System.out.println("Please enter the width in inches:");
		
		//search for the next double that the user enters
		double w = kb.nextDouble();
		
		double formula = size.feet(h, l, w);
		
		System.out.printf("The size in cubic feet is %10.2f\n", formula);
	}
	
	public double feet(double height, double length, double width)
	{
		return (height*length*width/(1728));
	}
}
		