import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What color is your hair? ");
		String thehair = kb.nextLine();
		System.out.println("What color are your eyes? ");
		String theeyes = kb.nextLine();
		System.out.println("What color is your skin? ");
		String theskin = kb.nextLine();
		
		Human object1 = new Human(thehair, theeyes, theskin);
		
		System.out.println("My info: \n Hair color: " + object1.gethair() + "\n Eye color: " + object1.geteyes() + "\n Skin color: " + object1.getskin());
		
	}
}
