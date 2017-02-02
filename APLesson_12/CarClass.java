import static java.lang.Math.*;
public class CarClass
{
	private String paint, interior, engine, tires;
	
	public CarClass()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public CarClass(String thecolor, String theinterior, String theengine, String thewheels)
	{
		paint = thecolor;
		interior = theinterior;
		engine = theengine;
		tires = thewheels;
	}
	
	public void setcolor(String thecolor)
	{
		paint = thecolor;
	}
	
	public void setinterior(String theinterior)
	{
		interior = theinterior;
	}
	
	public void setengine(String theengine)
	{
		engine = theengine;
	}
	
	public void setwheels(String thewheels)
	{
		tires = thewheels;
	}
	
	
	public String getcolor()
	{
		return paint;
	}
	
	public String getinterior()
	{
		return interior;
	}
	
	public String getengine()
	{
		return engine;
	}
	
	public String getwheel()
	{
		return tires;
	}
}