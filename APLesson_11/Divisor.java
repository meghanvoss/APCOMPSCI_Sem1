import java.util.Random;
import java.util.Scanner;

public class Divisor
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		int[][] nums = new int[4][4];
		
		for( int i = 0; i < nums.length; i++)
		{
			for( int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = rand.nextInt(100) + 1;
				System.out.printf("%-3d ", nums[i][j]);
			}
			System.out.println();
		}
		System.out.println("Please enter a number: ");
		int div = kb.nextInt();
		
		int count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				if (nums[i][j] % div == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers that are divisible by " + div + " in this array");
	}
}