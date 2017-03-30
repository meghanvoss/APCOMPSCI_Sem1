public class toystorerunner {
	public static void main(String[] args) {		
		toystore TS = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(TS);
		System.out.println("Most frequent toy: " + TS.getMostFrequentToy());
		System.out.println("Most frequent toy type: " + TS.getMostFrequentType());
	}
}