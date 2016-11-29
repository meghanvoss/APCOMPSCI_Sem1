

public class GetOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		fillArray();
		
		System.out.println("For the following numbers...");
	}
	
	public static fillArray()
	{
		for (int i = 0; i < numbers.length; i++)
		{
				numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	
	public static printArray()
	{
		for (int num : numbers)
		{
				System.out.print(num + " ");
		}
	}
	
	public static getOdds()
	{
		String odds = " ";
		
		for (int num : numbers)
		{
			if (!((num%2)=0))
			{
				odds += num;
			}
			else
			{
				return odds;
			}
		}
	}
}