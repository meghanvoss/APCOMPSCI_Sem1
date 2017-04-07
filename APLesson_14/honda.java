import java.util.ArrayList;
import java.util.Arrays;
public class honda implements location
{
	private double[] location;
	private double x, y;
	
	public honda(double[] ihatecs)
	{
		location = ihatecs;
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
		return location;
	}
}