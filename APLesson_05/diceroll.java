import java.util.Random;
public class diceroll
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int player = rand.nextInt(6)+1;
		int computer = rand.nextInt(6)+1;
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
	
		boolean winner = player > computer;
		
		if(winner)
		{
			System.out.println("The winner is you!");
		}
		
		if(!winner)
		{
			System.out.println("The winner is computer.");
		}
	}
}