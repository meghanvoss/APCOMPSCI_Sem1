import java.util.ArrayList;
import java.util.Arrays;
public class GMC2 extends CAR
{
	private double x, y;
	
	public GMC2(double xa, double ya)
	{
		x = xa;
		y = ya;
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