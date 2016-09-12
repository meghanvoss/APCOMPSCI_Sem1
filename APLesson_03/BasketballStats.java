import java.util.Scanner; //import Statement

public class BasketballStats
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is BasketballStats. I'd like to ask you a few questions.");
		
		//prompt for user input
		System.out.println("How many games have you played in this season? ");
		
		//search for the next integer that the user enters
		int games = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("How many points have you scored this season? ");
		
		//search for the next integer that the user enters
		int points = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("How many rebounds have you had this season? ");
		
		//search for the next integer that the user enters
		int rebounds = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("How many 3-pointers have you shot this season? ");
		
		//search for the next integer that the user enters
		int attempts = keyboard.nextInt();
		
		//prompt for user input
		System.out.println("How many 3-pointers have you made this season? ");
		
		//search for the next integer that the user enters
		int buckets = keyboard.nextInt();
		
		float PPG = (points/games);
		
		float RPG = (rebounds/games);
		
		float threept = ((100*buckets)/attempts);
		
		//print the results...
		System.out.println("Your PPG is " + PPG + ", your RPG is " + RPG + ", and your three point percentage is " + threept + "%.");;
		
		
		
	}
}