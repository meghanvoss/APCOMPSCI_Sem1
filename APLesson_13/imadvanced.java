public class imadvanced extends tix
{
	private int daysLeft;
	public double price;
	
	public imadvanced(int days)
	{
		super();
		daysLeft = days;
		
		if(daysLeft > 10)
		{
			price = 30.00;
		}
		else
		{
			price = 40.00;
		}
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	
	
}