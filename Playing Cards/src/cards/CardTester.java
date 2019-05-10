package cards;
/**
 * This is a class that tests the Card class.
 * @author Hunter Damron
 * //CardTester.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] card = new Card[4];
		int cardNum = 0;
		card[0] = new Card("K", "Hearts", 12);
		card[1] = new Card("Q", "Diamonds", 11);
		card[2] = new Card("3", "Hearts", 2);
		card[3] = new Card("Q", "Diamonds", 11);
		while(cardNum < 4) {
			System.out.println("Card " + cardNum + " has a rank " + card[cardNum].rank()
					+ ", a suit of " + card[cardNum].suit() + ", and a point value of "
					+ card[cardNum].pointValue() + ".");
			cardNum++;
		}
		if(card[1].matches(card[3])) {
			System.out.println("Card 2 matches card 4.");
		} else {
			System.out.println("Card 2 does not match card 4.");
		}
		if(card[0].matches(card[2])) {
			System.out.println("Card 1 matches card 3.");
		} else {
			System.out.println("Card 1 does not match card 3.");
		}
	}
}