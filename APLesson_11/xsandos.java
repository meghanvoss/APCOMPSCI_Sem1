import java.util.Random;

public class xsandos
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		String[][] xando = new String[4][4];
		
		for( int i = 0; i < xando.length; i++)
		{
			for( int j = 0; j < xando[i].length; j++)
			{
				int pick = rand.nextInt(2) + 1;
				if(pick == 1)
				{
					xando[i][j] = "X";
				}
				else
				{
					xando[i][j] = "O";
				}
				System.out.print(xando[i][j] + "\t");
			}
			System.out.println();
		}
	}
}