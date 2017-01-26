import java.util.Scanner;
public class distanceRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter x1");
		int xOne = keyboard.nextInt();
		System.out.println("Please enter y1");
		int yOne = keyboard.nextInt();
		System.out.println("Please enter x2");
		int xTwo = keyboard.nextInt();
		System.out.println("Please enter y2");
		int yTwo = keyboard.nextInt();
		
		distance object = new distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println("Distance = " + object.getDist());
		
	}
}