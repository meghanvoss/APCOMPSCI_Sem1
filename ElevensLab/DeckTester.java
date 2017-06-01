/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"meghan", "josh", "ale"};
		String[] suits = {"the good", "the bad", "the ugly"};
		int[] pointValues = {10000, 73, 8};
		Deck bigdeck = new Deck(ranks,suits,pointValues);
		System.out.println(bigdeck);
	}
}
