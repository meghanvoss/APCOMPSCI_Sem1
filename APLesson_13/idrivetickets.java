public abstract class idrivetickets
{
	public static void main(String[]args)
	{
		tix heyheyphototime = new thewalkup();
		tix sumthingfortheadvancedstudent = new advancedstudent(5);
		tix andonemore = new imadvanced(5);
		System.out.print("Here is your receipt:\n");
		System.out.println("Ticket 1: "+ heyheyphototime);
		System.out.println("Ticket 2: " + sumthingfortheadvancedstudent);
		System.out.println("Ticket 3: "+ andonemore);
	}
}