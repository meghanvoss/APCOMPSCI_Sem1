import java.util.ArrayList;
import java.util.Arrays;
public class HONDA2 extends CAR
{
	private double[] LOCAATION2;
	private double x, y;
	
	public HONDA2(double[] ihatecs)
	{
		LOCATION2 = ihatecs;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public void move(double one, double two)
	{
		x += one;
		y += two;
	}
	
	public double[] getLoc()
	{
		return LOCATION2;
	}
}