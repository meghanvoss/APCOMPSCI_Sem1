public class toy
{
	private String name;
	private int count;
	
	public toy()
	{
		name = "";
		count = 1;
	}
	
	public toy(String name, int count)
	{
		name = n;
		count = 1;
	}
	
	public void getName(String name)
	{
		name = n;
	}
	
	public void getCount(int count)
	{
		count = c;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	
	public void setCount(int c)
	{
		count = c;
	}
	
	public abstract String getType()
	{
		
	}
	
	public String toString()
	{
		return name + count;
	}
}