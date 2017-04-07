import java.util.Arrays;
import java.util.ArrayList;

public abstract class CAR implements LOCATION2
{

	double[] LOCATION2;
	
	public CAR()
	{
		LOCATION2 = new double[2];
	}
	
	public abstract void move(double one, double two);
	
	public abstract double[] getLoc();
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}

}