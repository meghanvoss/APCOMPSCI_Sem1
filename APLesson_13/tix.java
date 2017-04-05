public abstract class tix
{
	private int serial;
	
	
	public tix()
	{
		serial = (int)(Math.random() * 1000000);
		
	}

	public int getSerial()
	{
		return this.serial;
	
	}
		
	public abstract double getPrice();
		
	public String toString()
	{
		return 
		"serial #: " + getSerial() +
		"\n price: " + getPrice();
	}
}