import java.util.Scanner; //import Statement

public class GPAcalc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your letter grade in math:");
		
		//prompt for user input
		String math = kb.nextLine();
		
		System.out.println("Please enter your letter grade in english:");
		
		//prompt for user input
		String english = kb.nextLine();
		
		System.out.println("Please enter your letter grade in science:");
		
		//prompt for user input
		String science = kb.nextLine();
		
		System.out.println("Please enter your letter grade in history:");
		
		//prompt for user input
		String history = kb.nextLine();
		
		System.out.println("Please enter your letter grade in elective1:");
		
		//prompt for user input
		String elective1 = kb.nextLine();
		
		System.out.println("Please enter your letter grade in elective2:");
		
		//prompt for user input
		String elective2 = kb.nextLine();
		
		System.out.println("Please enter your letter grade in elective3:");
		
		//prompt for user input
		String elective3 = kb.nextLine();
		
		double gPoints = calcPoints(math) + calcPoints(english) + calcPoints(science) + calcPoints(history) + calcPoints(elective1) + calcPoints(elective2) + calcPoints(elective3);
		
		double GPA = gPoints/7;
		
		System.out.println("Your GPA is " + GPA);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		
		return 0.0;
	}
}