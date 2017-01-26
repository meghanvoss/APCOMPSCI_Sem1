import java.util.Scanner;
public class findthezs
{
	static String[] words = new String[5];
	public static void main(String[]args)
	{
		System.out.println("Enter 5 words please: ");
		
		fillArray();
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < words.length; i++)
		{
				words[i] = kb.nextLine();
		}
		printArray();
	}
	
	public static void printArray()
	{
		System.out.println("For the words in this array: ");
		for (String word : words)
		{
				System.out.print(word + " ");
		}
		System.out.println(" \n Only " + hasZs() + " contains Z");
	}
	
	public static String hasZs()
	{
		String zs = " ";
		
		for (String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
		}
		return zs;
	}
}