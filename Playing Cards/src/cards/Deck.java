/**
 * A deck of cards. Includes preloaded deck for blackjack
 * @author Hunter Damron
 * //Deck.java
 * //Honor Code: I did not lie, cheat, or steal
 */
package cards;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	
	/**
	 * Preloaded ArrayLists for standard deck
	 */
	public final static ArrayList<String> STD_RANKS = new ArrayList<String>
		(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
	public final static ArrayList<String> STD_SUITS = new ArrayList<String>
		(Arrays.asList("Spades", "Clubs", "Hearts", "Diamonds"));
	public final static ArrayList<Integer> STD_VALUES = new ArrayList<Integer>
		(Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values) {
		cards = new ArrayList<Card>(ranks.size() * suits.size());
		for(int suitIndex = 0; suitIndex < suits.size(); suitIndex++) {
			for(int rankIndex = 0; rankIndex < ranks.size(); rankIndex++) {
				cards.add(new Card(ranks.get(rankIndex), suits.get(suitIndex), values.get(rankIndex)));
			}
		}
		size = cards.size();
		shuffle();
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		Random gen = new Random();
		Card intermediate;
		int randomIndex, unshuffledSize;
		for(unshuffledSize = cards.size(); unshuffledSize > 0; unshuffledSize--){
			randomIndex = gen.nextInt(unshuffledSize);
			intermediate = cards.get(randomIndex);
			cards.set(randomIndex, cards.get(unshuffledSize - 1));
			cards.set(unshuffledSize - 1, intermediate);
		}
		size = cards.size();
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		Card ret;
		if(size > 0) {
			ret = cards.get(size - 1);
			size--;
			return ret;
		} else {
			return null;
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ",  \t";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ",  \t";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}