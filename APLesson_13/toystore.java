import java.util.ArrayList;
import java.util.Arrays;

public class toystore 
{
	private static ArrayList<toy> toyList;
	
	public toystore() 
	{
		toyList = new ArrayList<>();
	}
	
	public toystore(String n) 
	{
		loadToys(n);
	}
	
	public static void loadToys(String ts) 
	{
		toyList = new ArrayList<toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i += 2) 
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			toy uniqueToy = getThatToy(name);
			if (uniqueToy == null) 
			{
				if (type.equals("Car")) 
				{
					toyList.add(new thecar(name));
				} else if (type.equals("AF")) 
				{
					toyList.add(new thecar(name));
				}
			} else 
			{
				uniqueToy.setCount(uniqueToy.getCount() + 1);
			}
		}
	}
	
	public static toy getThatToy(String nm) 
	{
		for (toy t : toyList) 
		{
			if (t.getName().equals(nm)) 
			{
				return t;
			}
		}
		return null;
	}
	
	public static String getMostFrequentToy() 
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for (toy t : toyList) 
		{
			if (max < t.getCount()) 
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public static String getMostFrequentType() 
	{
		int cars = 0;
		int figures = 0;
		
		for (toy t : toyList) 
		{
			if (t.getType().equals("Car")) 
			{
				cars++;
			} else if (t.getType().equals("Action Figure")) 
			{
				figures++;
			}
		}
		if (cars > figures) 
		{
			return "Cars";
		} else if (figures > cars) 
		{
			return "Action Figures";
		} else 
		{
			return "You have an equal amounts of action figures and cars! wow!!! way2go!";
		}
	}
		
	public String toString() 
	{
		return toyList.toString();
	}
}
