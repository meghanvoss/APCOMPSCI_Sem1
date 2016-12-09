import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = kb.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		System.out.println(doEquation());
	}
		public static String doEquation()
		{int i = 0;
			while(i < equation.size())
			{
				if(i < equation.size() && equation.get(i).equals("+"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else if(i < equation.size() && equation.get(i).equals("-"))
					{
						equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
						equation.remove(i-1);
						equation.remove(i);
					}
				else if(i < equation.size() && equation.get(i).equals("*"))
					{
						equation.set(i, "" + (Integer.parseInt(equation.get(i*1)) * Integer.parseInt(equation.get(i/1))));
						equation.remove(i-1);
						equation.remove(i);
					}
					
				else if(i < equation.size() && equation.get(i).equals("/"))
					{
						equation.set(i, "" + (Integer.parseInt(equation.get(i*1)) / Integer.parseInt(equation.get(i/1))));
						equation.remove(i-1);
						equation.remove(i);
					}
					
	
				i++;
						
					
				
			}
		}
		return equation; 
	}
}