import java.util.ArrayList;
import java.util.Arrays;
public class gmc implements location
{
	private double x, y;
	
	public gmc(double xa, double ya)
	{
		x = xa;
		
		y= ya;
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