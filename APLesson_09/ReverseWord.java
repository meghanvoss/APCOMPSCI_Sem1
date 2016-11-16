import java.util.Scanner; //import Statement

public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Please enter five words:");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		for (String word : words)
		{
			System.out.println("In order...");
			System.out.print(word + "\n\n");
			System.out.println("Reversed...");
		}
	}
}