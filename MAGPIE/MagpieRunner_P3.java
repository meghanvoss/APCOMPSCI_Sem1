import java.util.Scanner;
public class MagpieRunner_P3
{
	public static void main(String[] args)
	{
		Magpie_P3 maggie = new Magpie_P3();
		
		System.out.println (maggie.getResponse(""));
System.out.println(maggie.getResponse("I know not no."));
System.out.println (maggie.getResponse("My dog died."));
System.out.println(maggie.getResponse("My Father is lazy."));
System.out.println(maggie.getResponse("I want to sleep."));
System.out.println(maggie.getResponse("I hate you."));
System.out.println(maggie.getResponse("You love me."));
	}
}
