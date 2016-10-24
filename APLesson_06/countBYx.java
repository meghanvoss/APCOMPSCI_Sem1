import java.util.Scanner; //import Statement

public class countBYx
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int countuptothis = kb.nextInt();
		
		System.out.println("Please enter another number to count up to the first number by:");
		int countbythis = kb.nextInt();
		
		
		for(int i= countbythis ; i <= countuptothis; i+=countbythis)
		{
			System.out.print(i + "\t");
		}
		
	}
}