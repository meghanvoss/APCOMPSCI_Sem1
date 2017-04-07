import java.util.ArrayList;

public class SATELLITE2
{
	private static double one, two;
	
   public static void main(String[]args)
   {
       ArrayList<LOCATION2> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new HONDA2(honLoc));
       locate.add(new TOYOTA2("8, 9"));
       locate.add(new GMC2(3, 8));

       double[] home = {0, 0};

       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (LOCATION2 l : locate)
       {   
		one = (double)((Math.random()) * 100);
		two = (double)((Math.random()) * 100);
		
		String sf1 = String.format("%.2f" , one );
		String sf2 = String.format("%.2f", two);
		
		
           printout += "\n After " + l.getID() + " moved ("+ sf1+  ", " + sf2 + ") \n New Location: ("+ getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (LOCATION2 l : locate)
		  
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc())+ ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] loc)
   {
       return Math.sqrt((Math.pow(loc[0]+one, 2)+ Math.pow(loc[1]+two, 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%.2f, %.2f", loc[0]+one, loc[1]+two);
   }
}