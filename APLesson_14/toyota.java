import java.util.ArrayList;
import java.util.Arrays;
public class toyota implements location
{
	private double x, y;
	private double[] locate;

	public toyota(String z)
	{
		String[] locate = z.split(", ");
		x = Double.parseDouble(locate[0]);
		y = Double.parseDouble(locate[1]);

	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public void move(double xa, double ya)
	{		
		x += xa;
		y += ya;
	}
	
	public double[] getLoc()
	{
		double[] locate = {x,y};
		return locate;
	}
}