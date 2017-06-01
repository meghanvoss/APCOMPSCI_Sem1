/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card myfirstcard = new Card("Ace", "Spades", 21);
		Card mysecondcard = new Card("Seven", "Diamonds", 7);
		Card mythirdcard = new Card("King", "Hearts", 18);
		System.out.println(myfirstcard + "\n" + mysecondcard + "\n" + mythirdcard);
	}
}
