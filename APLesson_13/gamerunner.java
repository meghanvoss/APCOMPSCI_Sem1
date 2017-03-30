public class gamerunner
{
	public static void main(String[]args)
	{
		playstation hallo = new playstation("playstation");
		xbox cheerio = new xbox("Xbox");
		pcclass cawledge = new pcclass("PvZ");
		
		System.out.println(hallo.toString());
		System.out.println(cheerio.toString());
		System.out.println(cawledge.toString());
	}
}