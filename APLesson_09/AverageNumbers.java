

public class AverageNumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		
			for (int num : numbers)
			{
				System.out.print(num + " ");
			}
		System.out.println("\nThe average of the above numbers is..." + average(numbers));
	}
	
	public static int average(int[] numbers)
	{
		int average = 0;
		
		for(int num : numbers)
		{
			average += num;
		}
		return average/10;
	}
}