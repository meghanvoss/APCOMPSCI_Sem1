public abstract class consoleclass extends gamesystem
{
	public consoleclass(String p)
	{
		super(p);	
	}
	
	public abstract String getController();
	public abstract String getPlatform();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getsN() + "\nController: " + getController() + "\n";
	}
}