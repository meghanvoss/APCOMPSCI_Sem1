import java.util.Scanner;
public class MagpieRunner_P3
{
	public static void main(String[] args)
	{
		Magpie_P3 maggie = new Magpie_P3();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
