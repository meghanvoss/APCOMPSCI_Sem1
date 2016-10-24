import java.util.Scanner; //import Statement

public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		
		int integer = kb.nextInt();
		
		System.out.println("Pick a size for the table:");
		
		int size = kb.nextInt();
		
		
		for(int i=1; i <= size; i++)
		{
			int iterator = integer * i;
			System.out.println(i + "\t" + iterator);
		}
		
	}
}