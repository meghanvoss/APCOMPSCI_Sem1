import java.util.Scanner;
public class DigitAdder
{
	static int number;
	static int sum;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	
	public static void sumDigits()
	{
		sum = 0;
		int num = number;
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
	}
}