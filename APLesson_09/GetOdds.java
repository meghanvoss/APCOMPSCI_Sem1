public class GetOdds
{
	static int[] numbers = new int[10];
	public static void main(String[]args)
	{
		
		
		fillArray();
	}
	
	public static void fillArray()
	{
		for (int i = 0; i < numbers.length; i++)
		{
				numbers[i] = (int)(Math.random()*100)+1;
		}
		printArray();
	}
	
	public static void printArray()
	{
		for (int num : numbers)
		{
				System.out.print(num + " ");
		}
		System.out.println("Here are the odds " + getOdds());
	}
	
	public static String getOdds()
	{
		String odds = " ";
		
		for (int num : numbers)
		{
			if (((num%2)==1))
			{
				odds += num + " ";
			}
		}
		return odds;
	}
}