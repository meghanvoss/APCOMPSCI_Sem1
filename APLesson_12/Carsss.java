import java.util.Scanner;
public class Carsss
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the paint color of the car? ");
		String thecolor = kb.nextLine();
		System.out.println("What is the interior of the car? ");
		String theinterior = kb.nextLine();
		System.out.println("What is the engine of the car? ");
		String theengine = kb.nextLine();
		System.out.println("What kind of wheels does the car have? ");
		String thewheels = kb.nextLine();
		
		CarClass object1 = new CarClass(thecolor, theinterior, theengine, thewheels);
		
		System.out.println("Your vehicle is ready \n Paint: " + object1.getcolor() + "\n Interior: " + object1.getinterior() + "\n Engine: " + object1.getengine() + "\n Tires: " + object1.getwheel());
		
	}
}
