import java.util.Scanner; //import Statement

public class BMIpt2
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, I am the BMI calculator.");
		
		//prompt for user input
		System.out.println("What is your height, in inches?");
		
		//search for next integer that the user enters
		double h = keyboard.nextDouble();
		
		//prompt for user input
		System.out.println("How much do you weigh, in pounds?");
		
		//search for next integer that the user enters
		double w = keyboard.nextDouble();
		
		double BMI = ((w*703)/(h*h));
		
		//print the results...
		System.out.println("Your BMI is " + BMI);
		
		String condition = calcCondish(BMI);
		
		System.out.println("You are " + condition);
	}
	
	public static String calcCondish(double BMI)
	{
		if (BMI < 18.5)
			return "Underweight";
			
		else if (BMI <= 24.9)
			return "Normal";
			
		else if (BMI <= 29.9)
			return "Overweight";
			
		else if (BMI <= 34.9)
			return "Obese";
			
		else if (BMI <= 39.9)
			return "Very Obese";
			
		if (BMI > 39.9)
			return "Morbidly Obese";
			
		return "";
	}
}