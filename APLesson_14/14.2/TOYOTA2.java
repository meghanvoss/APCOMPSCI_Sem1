import java.util.ArrayList;
import java.util.Arrays;
public class TOYOTA2 extends CAR
{
	private double x, y;
	private double[] locate;

	public TOYOTA2(String z)
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