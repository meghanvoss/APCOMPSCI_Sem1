import static java.lang.Math.*;
public class Human
{
	private String hair, eyes, skin;
	
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Human(String thehair, String theeyes, String theskin)
	{
		hair = thehair;
		eyes = theeyes;
		skin = theskin;
	}
	
	public void sethair(String thehair)
	{
		hair = thehair;
	}
	
	public void seteyes(String theeyes)
	{
		eyes = theeyes;
	}
	
	public void setengine(String theskin)
	{
		skin = theskin;
	}
	
	
	public String gethair()
	{
		return hair;
	}
	
	public String geteyes()
	{
		return eyes;
	}
	
	public String getskin()
	{
		return skin;
	}
}