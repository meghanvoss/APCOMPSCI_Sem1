import java.util.Scanner; //import Statement

public class cubereturn
{
	
	public static void main(String[]args)
	{
		//new cube object
		cube SurfArea = new cube();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side:");
		
		//search for next double that the user enters
		double side = kb.nextDouble();
		
		print("The surface area of a cube with side of length " + side + " is ", calcSA(side));
	}
	
	public static double calcSA(double side)
	{
		return 6*Math.pow(side,2);
	}
	
	public static void print(String text, double sa)
	{
		System.out.println(text + sa );
	}
}