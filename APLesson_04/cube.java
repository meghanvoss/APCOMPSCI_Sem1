import java.util.Scanner; //import Statement

public class cube
{
	static double side;
	static double sa;
	
	
	public static void main(String[]args)
	{
		//new cube object
		cube SurfArea = new cube();
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side:");
		
		//search for next double that the user enters
		side = kb.nextDouble();
		
		calcSA();
		print();
	}
	
	public static void calcSA()
	{
		sa = Math.pow(6*side,2);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with side of length %4.2f is %3.5f.\n", side, sa );
	}
}