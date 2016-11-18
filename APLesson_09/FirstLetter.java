import java.util.Scanner; //import Statement

public class FirstLetter
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
				System.out.print("");
			}
			first(words);
	}
	
	public static void first(String[] words)
	{
		for(int i = 0; i<=4; i++)
		{
			System.out.print(words[i].substring(0,1) + " ");
		}
	}
}