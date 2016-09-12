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
		int age = keyboard.nextInt();
		
		//print the results...
		System.out.println("Oof, " + age + " is getting old. The clock is really ticking.");
		
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
		System.out.println("How many siblings do you have?");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("So you have " + num + "? I would feel bad for anyone else that is forced to live with you.");
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up?");
		
		String job = keyboard.next();
		
		//print the results...
		System.out.println("I doubt anybody would want to hire someone as dumb as you for a " + job + ". So " + name + ", you're " + age +  ", you like to " + fun + " and you listen to " + music + "... uhhh can you say lame? Nah, I'm just kidding, " + name + ", good luck with becoming a " + job + "!");
		
		
	}
}