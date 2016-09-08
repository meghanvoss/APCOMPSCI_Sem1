import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI. I'd like to ask you a few questions.");
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		//print the results...
		System.out.println("Ewwwww " + name + " is a super lame name.");
		
		//prompt for user input
		System.out.println("How old are you, " + name + "?");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Oof, " + num + " is getting old. The clock is really ticking.");
		
		//prompt for user input
		System.out.println("What do you do for fun, " + name + "?");
		
		String fun = keyboard.next();
		
		//print the results...
		System.out.println("Lol " + fun + " seems really boring. Get a life, " + name);
		
		//prompt for user input
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		//print the results...
		System.out.println("Yikes, " + music + "is so bad. If you want to listen to some REAL music you should follow me on soundcloud.");
		
		//prompt for user input
		System.out.println("How many sibling do you have?");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("")
		
	}
}