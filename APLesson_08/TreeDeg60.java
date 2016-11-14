import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.nextLine();
		int stop = word.length();
		int start = 1;
		tree(word, start, stop);
	}
	
	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%-1s\n", word.substring(0, start));
			return tree(word, start + 1, stop);
		}
		else
		{
			return " ";
		}
	}
}