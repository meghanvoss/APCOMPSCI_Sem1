public class Toyota extends Car {
	public Toyota(String c) {
		location = new double[2];
		String[] coords = c.split(", ");
		location[0] = Double.parseDouble(coords[0]);
		location[1] = Double.parseDouble(coords[1]);
	}
}