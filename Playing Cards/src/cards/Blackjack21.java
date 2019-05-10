/**
 * User plays against the computer in a game of Blackjack 21
 * @author Hunter Damron
 * //Blackjack21.java
 * //Honor Code: I did not lie, cheat, or steal
 */
package cards;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Blackjack21 {
	
	private static int handValue = 0;
	
	/**
	 * Begins program execution
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		String message, aceMessage, netWorth;
		String[] buttons = {"Hit", "Stand"};
		int dealerValue = 0, handAces = 0, dealerAces = 0;
		boolean win = false, hit = true, harden = true, cont = true;

		/*11 is the maximum number of cards before winning or busting*/
		final int MAX_CARDS = 11; 
		ArrayList<Card> hand, dealer;
		Deck deck = new Deck(Deck.STD_RANKS, Deck.STD_SUITS, 
				new ArrayList<Integer>(Arrays.asList(11, 2, 3, 4, 5, 
						6, 7, 8, 9, 10, 10, 10, 10)));

		while(cont) {
			finish: {
			hand = new ArrayList<Card>(MAX_CARDS);
			dealer = new ArrayList<Card>(MAX_CARDS);
			handValue = 0; dealerValue = 0; handAces = 0; dealerAces = 0;
			win = false; hit = true;
			deck.shuffle();

			hand.add(deck.deal());
			handValue += hand.get(hand.size() - 1).pointValue();
			if(hand.get(hand.size() - 1).rank().matches("A"))
				handAces++;

			hand.add(deck.deal());
			handValue += hand.get(hand.size() - 1).pointValue();
			if(hand.get(hand.size() - 1).rank().matches("A"))
				handAces++;

			dealer.add(deck.deal());
			dealerValue += dealer.get(dealer.size() - 1).pointValue();
			if(dealer.get(dealer.size() - 1).rank().matches("A"))
				dealerAces++;

			dealer.add(deck.deal());
			dealerValue += dealer.get(dealer.size() - 1).pointValue();
			if(dealer.get(dealer.size() - 1).rank().matches("A"))
				dealerAces++;
			
			message = "Dealer's Cards:\n" + dealer.get(0) + "\nand " + 
					(dealer.size() - 1) + " face-down card";
			if(dealer.size() > 3)
				message += "s";
			else
				message += "";
			message += "\n\nYour cards:";
			for(int index = 0; index < hand.size(); index++) {
				message += "\n" + hand.get(index);
			}

			netWorth = "\nYour net worth: " + handValue;
			aceMessage = "";
			for(int count = 1; count <= handAces; count++) {
				aceMessage += " or " + (handValue - count * 10);
			}
			
			harden = true;
			while(handAces > 0 && harden) {
				harden = JOptionPane.showConfirmDialog(null, message + netWorth
						+ aceMessage + "\n\nWould you like to change one "
						+ "of your aces to be one and your net worth "
						+ (handValue - 10) + "?",  "Harden ace", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
				if(harden) {
					found: for(int index = 0; index < hand.size(); index++) {
						if(hand.get(index).pointValue() == 11) {
							hand.set(index, new Card("A", hand.get(index).suit(), 1));
							handValue -= 10;
							break found;
						}
					}
					handAces--;
				}
			}
			
			if(dealerValue == 21) {
				win = false;
				break finish;
			}
			if(handValue == 21) {
				win = true;
				break finish;
			}

			message = "Dealer's Cards:\n" + dealer.get(0) + "\nand " + 
					(dealer.size() - 1) + " face-down card";
			if(dealer.size() > 3)
				message += "s";
			else
				message += "";
			message += "\n\nYour cards:";
			for(int index = 0; index < hand.size(); index++) {
				message += "\n" + hand.get(index);
			}

			netWorth = "\nYour net worth: " + handValue;
			aceMessage = "";
			for(int count = 1; count <= handAces; count++) {
				aceMessage += " or " + (handValue - count * 10);
			}
			
			hit = JOptionPane.showOptionDialog(null, message + netWorth +
					aceMessage, "Blackjack 21", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, buttons, buttons[1]) == JOptionPane.YES_OPTION;

			while(hit) {
				hit = false;
				hand.add(deck.deal());
				handValue += hand.get(hand.size() - 1).pointValue();
				if(hand.get(hand.size() - 1).rank().matches("A"))
					handAces++;


				message = "Dealer's Cards:\n" + dealer.get(0) + "\nand "
						+ (dealer.size() - 1) + " face-down card";
				if(dealer.size() > 3)
					message += "s";
				else
					message += "";
				message += "\n\nYour cards:";
				for(int index = 0; index < hand.size(); index++) {
					message += "\n" + hand.get(index);
				}
				netWorth = "\nYour net worth: " + handValue;
				aceMessage = "";
				for(int count = 1; count <= handAces; count++) {
					aceMessage += " or " + (handValue - count * 10);
				}
				
				harden = true;
				if(hand.get(hand.size() - 1).pointValue() == 11 && harden) {
					harden = JOptionPane.showConfirmDialog(null, message + netWorth
							+ aceMessage + "\n\nWould you like to change "
							+ "your ace to be one and your net worth "
							+ (handValue - 10) + "?",  "Harden ace", 
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
					if(harden) {
						found: for(int index = 0; index < hand.size(); index++) {
							if(hand.get(index).pointValue() == 11) {
								hand.set(index, new Card("A", hand.get(index).suit(), 1));
								handValue -= 10;
								break found;
							}
						}
						handAces--;
					}
				}
				
				if(handValue == 21) {
					win = true;
					break finish;
				}

				while(handValue > 21) {
					if(handAces == 0) {
						win = false;
						break finish;
					}
					if(JOptionPane.showConfirmDialog(null, message + netWorth
							+ aceMessage + "\n\nWould you like to change one "
							+ "of your aces to be one and your net worth "
							+ (handValue - 10) + "?",  "Harden ace", 
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						found: for(int index = 0; index < hand.size(); index++) {
							if(hand.get(index).pointValue() == 11) {
								hand.set(index, new Card("A", hand.get(index).suit(), 1));
								handValue -= 10;
								break found;
							}
						}
						handAces--;
					} else {
						win = false;
						break finish;
					}
				}
				
				message = "Dealer's Cards:\n" + dealer.get(0) + "\nand "
						+ (dealer.size() - 1) + " face-down card";
				if(dealer.size() > 3)
					message += "s";
				else
					message += "";
				message += "\n\nYour cards:";
				for(int index = 0; index < hand.size(); index++) {
					message += "\n" + hand.get(index);
				}
				netWorth = "\nYour net worth: " + handValue;
				aceMessage = "";
				for(int count = 1; count <= handAces; count++) {
					aceMessage += " or " + (handValue - count * 10);
				}
				
				hit = JOptionPane.showOptionDialog(null, message + netWorth + 
						aceMessage, "Blackjack 21", 
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, buttons, buttons[1]) == JOptionPane.YES_OPTION;
			}
			if(dealerValue == 21) {
				win = false;
				break finish;
			}
			while(dealerValue < 16) {
				dealer.add(deck.deal());
				dealerValue += dealer.get(dealer.size() - 1).pointValue();
				if(dealer.get(dealer.size() - 1).rank().matches("A"))
					dealerAces++;
				if(dealerValue == 21) {
					win = false;
					break finish;
				}
				while(dealerValue > 21) {
					if(dealerAces == 0) {
						win = true;
						break finish;
					}
					found: for(int index = 0; index < dealer.size(); index++) {
						if(dealer.get(index).pointValue() == 11) {
							dealer.set(index, new Card("A", dealer.get(index).suit(), 1));
							dealerValue -= 10;
							break found;
						}
					}
					dealerAces--;
				}
			}
			win = handValue > dealerValue;
		}

		message = "";
		for(int index = 0; index < dealer.size(); index++) {
			message += "\n" + dealer.get(index);
		}
		message += "\nDealer's net worth: " + dealerValue;
		for(int count = 1; count <= dealerAces; count++) {
			message += " or " + (dealerValue - count * 10);
		}
		message += "\n\nYour cards:";
		for(int index = 0; index < hand.size(); index++) {
			message += "\n" + hand.get(index);
		}
		message += "\nYour net worth: " + handValue;

		if(win) {
			message += "\n\nYou win!";
		} else {
			message += "\n\nYou lose.";
		}
		
		try {
			cont = JOptionPane.showConfirmDialog(null, message + 
					"\nWould you like to play again?", "Continue?", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		} catch(NullPointerException e) {
			cont = false;
		}
		}
	}
}