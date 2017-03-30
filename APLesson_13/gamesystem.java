public class gamesystem
{
	public String platform;
	private int serialNo;
	
	public gamesystem()
	{
		this.platform =  "";
		this.serialNo = (int)(Math.random() * 1000000);
	}
	
	public gamesystem(String p)
	{
		this.platform =  p;
		this.serialNo = (int)(Math.random() * 1000000) ;
	}
	
	
	public String getplatform()
	{
		return this.platform;
	}
	
	public int getsN()
	{
		return this.serialNo;
	}
	
	public void setplatform(String p)
	{
		this.platform = p;
	}
	
	public void setsN(int serialNo)
	{
		this.serialNo = (int)(Math.random() * 1000000);
	}
}