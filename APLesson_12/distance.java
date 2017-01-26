import java.lang.Math.*;
public class distance
{

	public static int xOne, yOne, xTwo, yTwo;
	public static double distance;
	
	//default constructor
	public distance()
	{
		//default values for instance variables
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0.0;
		;
	}
	
	//constructor with params
	public distance(int xO, int yO , int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
	    distance = 0.0;
	}
	
	//Modifier
	public void setValues(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
	    distance = 0.0;
	}
	//Accessors                                                                         
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)* (yTwo-yOne));
		
		return distance;
		
	}
	
}