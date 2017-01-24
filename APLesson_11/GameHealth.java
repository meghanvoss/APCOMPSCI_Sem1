import java.util.Scanner;

public class GameHealth
{
	public static String[] health;
	public static int HEALTHLOAD = 6;
	public static int healthcount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthcount = 6;
		health = new String[HEALTHLOAD];
		
		while ( turn != "Q " && healthcount > 0)
		{
			System.out.println("Your turn! Hit enter when ready: ");
			turn = kb.nextLine();
			damage = (int)(Math.random()*2 + 1);
			amount = (int)(Math.random()*6 + 1);
			System.out.println(takedamage(damage, amount));
			printclip();
		}
		System.out.println("You died!!!");
	}
	public static String takedamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthcount = healthcount - amt;
			System.out.println("Taking " + amt + " damage!");
		}
		else if ((healthcount + amt) < HEALTHLOAD )
		{
			healthcount = healthcount + amt;
		}
		else
		{
			healthcount = HEALTHLOAD;
		}
		return "Power up " + (amt) + "!";
	}
	public static void printclip()
	{
		String output = "Health: \t";
		for (int i = 0; i < HEALTHLOAD; i++)
		{
			if (i < healthcount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}