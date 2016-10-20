import java.util.Scanner; //import Statement

public class AdventureGame
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		
		
		System.out.println("Would you like to go on an adventure? Type \"1\" for yes or type \"2\" for no.");
		if(kb.nextInt() == 1) {
			//prompt for kb.nextInt()
			System.out.println("Do you want to go to the beach \"3\" or the desert \"4\"? ");
			if (kb.nextInt() == 3) {
				//prompt for kb.nextInt()
				System.out.println("Do you swim out into the ocean \"5\" or stay on the sand \"6\"? ");
				if (kb.nextInt() == 5) {
					System.out.println("You get eaten by a shark.");
				}else //end of program
					System.out.println("You get attacked by seagulls that want your food.");
			//prompt for kb.nextInt()
			}else
				//prompt for kb.nextInt()
				System.out.println("Do you go off roading \"7\" or choose not to\"8\"?");
				if (kb.nextInt() == 7) {
					//end of program
					System.out.println("You crash your dune buggy and end up stranded.");
				}else //end of program
					System.out.println("While walking around the desert, you meet a Native American tribe, and they teach you the ways of the wind, and show you your true inner animal spirit.");
				
		}else //<part of kb.nextInt() 1>
			//prompt for kb.nextInt()
			System.out.println("On your way to your boring home, becasue you were too lame to want to go on an adventure, you accidentally drive through a portal which transports you to another world. Would you like to stick around here and check it out \"9\" or leave immediately and return home \"10\"?");
			if (kb.nextInt() == 9) {
				//prompt for kb.nextInt()
				System.out.println("You see some alien creatures. Are you friendly with them \"11\" or do you attack them \"12\"?");
				if (kb.nextInt() == 11) {
					//end of program
					System.out.println("Since you seem nice, they take you to ride unicorns with them thorugh the cotton candy clouds.");
				}else //end of program
				System.out.println("They vaporize you immediately, as your karate is no match for their strength.");
			//prompt for kb.nextInt()
			}else
				//prompt for kb.nextInt()
				System.out.println("The aliens do not give you that option, and are offended by you trying to leave. They take you to their castle. Do you try to escape \"13\" or do you just wait and accept your fate \"14\"?");
				if (kb.nextInt() == 13) {
					//end of program
					System.out.println("You die trying.");
				}else //end of program
				System.out.println("The king of the alien people finds you interesting, and takes you in as his pet. You live out the rest of your days being spoiled like a rich girl's chihuahua in Beverley Hills.");
	}
}