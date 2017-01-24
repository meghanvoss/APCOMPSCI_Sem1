import java.util.Scanner;

public class GameGun
{
	public static int bulletcount;
	public static int CLIPSIZE = 16;
	public static int shotcount;
	public static String[] clip;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletcount = 96;
		shotcount = 0;
		clip = new String[CLIPSIZE];
		resetclip();
		
		while (bulletcount > 0 || shotcount > 0)
		{
			System.out.println("Action: ");
			String ACTION = kb.next();
			if (ACTION.equals("R"))
			{
				reload();
			}
			else if (ACTION.equals("S"))
			{
				shoot();
			}
			else
			{
				System.out.println("error u cant do that cmon");
			}
			printclip();
		}
		System.out.println("Out of bullets!!!");
	}
	public static void resetclip()
	{
		for( int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static void shoot()
	{
		if (shotcount > 0)
		{
			clip[shotcount - 1] = "[]";
			shotcount--;
			System.out.println("Boom!!!");
		}
		else
		{
			System.out.println("Reload!!!");
		}
	}
	public static void reload()
	{
		if (bulletcount >= CLIPSIZE)
		{
			bulletcount = bulletcount - CLIPSIZE ;
			shotcount = CLIPSIZE;
		}
		else
		{
			shotcount = bulletcount;
			bulletcount = 0;
		}
		resetclip();
		for ( int i = 0; i < shotcount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printclip()
	{
		String output = "Bullets: \t" + bulletcount + "\nClip: \t";
		for ( int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
		
	}
}