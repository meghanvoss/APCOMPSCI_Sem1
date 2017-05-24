import java.util.Scanner;
public class magpierunner
{
	public static void main(String[] args)
	{
		magpie maggie = new magpie();
		
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
