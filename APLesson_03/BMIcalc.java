import java.util.Scanner; //import Statement

public class BMIcalc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, I am the BMI calculator.");
		
		//prompt for user input
		System.out.println("What is your height, in inches?");
		
		//search for next integer that the user enters
		int h = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("How much do you weigh, in pounds?");
		
		//search for next integer that the user enters
		int w = keyboard.nextInt();
		
		float BMI = ((w*703)/(h*h));
		
		//print the results...
		System.out.println(BMI);
		
		
	}
}