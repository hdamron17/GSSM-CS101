package cards;

import java.util.ArrayList;
import java.util.Arrays;

public class Hand {
	private ArrayList<Card> cards;
	
	public Hand() {
		cards = new ArrayList<Card>();
	}
	
	public Hand(Card...cards) {
		this.cards.addAll(Arrays.asList(cards));
	}
	
	public void add(Card card) {
		cards.add(card);
	}
	
	public int evaluate() {
		int ret = 0;
		for(int index = 0; index < cards.size(); index++) {
			ret += cards.get(ret).pointValue();
		}
		return ret;
	}
	
	/**
	 * Gets the number of hard and soft aces
	 * @return returns number of hard aces first then
	 * 		soft in two-element array
	 */
	public int[] aces() {
		int hard = 0, soft = 0;
		for(int index = 0; index < cards.size(); index++) {
			if(cards.get(index).pointValue() == 11)
				soft++;
			if(cards.get(index).pointValue() == 1)
				hard++;
		}
		return new int[]{hard, soft};
	}
	
	public String displayShown() {
		String message = "" + cards.get(0);
		for(int index = 1; index < cards.size(); index++) {
			message += "\n" + cards.get(index);
		}
		message += "\nNet worth: " + evaluate();
		for(int count = 0; count < aces()[0]; count++) {
			message += " or " + (evaluate() - 10);
		}
		return message + "\n";
	}
	
	public String displayHidden() {
		
	}
	
	public String toString() {
		return displayShown();
	}
}
