package cards;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		ArrayList<String> ranks = new ArrayList<String>
//				(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
				(Arrays.asList("A", "2", "3", "4", "5"));
		ArrayList<String> suits = new ArrayList<String>
//				(Arrays.asList("Spades", "Clubs", "Hearts", "Diamonds"));
				(Arrays.asList("Spades", "Clubs"));
		ArrayList<Integer> values = new ArrayList<Integer>
//				(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
				(Arrays.asList(1, 2, 3, 4, 5));
		
		/*
		 * Following lines included for testing purposes
		 */
		Deck deck = new Deck(ranks, suits, values);
		System.out.println("Creating deck...\n" + deck);
		deck.shuffle();
		System.out.println("------------------------------------------------------"
				+ "\nShuffling deck...\n" + deck);
		System.out.println("------------------------------------------------------"
				+ "\nDealing cards: ");
		while(!deck.isEmpty()) {
			System.out.println(deck.size() + " : " + deck.deal());
		}
		System.out.println("\n------------------------------------------------------"
				+ "\nEmpty deck: \n" + deck);
	}
}