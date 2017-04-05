public class advancedstudent extends imadvanced
{
	public advancedstudent(int p)
	{
		super(p);
	}
	public double getPrice()
	{
		return price / 2;
	}
	
	public String toString()
	{
		return "serial #: " + getSerial() +
		"\n price: " + getPrice() + "\nstudent ID is required son cmon!";
	}
}