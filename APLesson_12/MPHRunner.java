import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the distance");
		int distance = keyboard.nextInt();
		System.out.println("Please enter the hours");
		int hours = keyboard.nextInt();
		System.out.println("Please enter the minutes");
		int minutes = keyboard.nextInt();
		
		MPH object = new MPH(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMPH() + " mph");
		
	}
}