import java.lang.Math.*;
public class MPH
{

	public static int distance,hours, minutes;
	public static double mph;
	
	//default constructor
	public MPH()
	{
		//default values for instance variables
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0.0
		;
	}
	
	//constructor with params
	public MPH(int d, int h , int min)
	{
		distance = d;
		hours = h;
		minutes = min;
		mph = 0.0;
	}
	
	//Modifier
	public void setValues(int d, int h, int min)
	{
		distance = d;
		hours = h;
		minutes = min;
		mph = 0.0;
	}
	//Accessors                                                                         
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		
		return mph;
		
	}
	
}
	