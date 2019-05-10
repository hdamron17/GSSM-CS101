package game;
/**
 * Generates a random number in user specified bounds then prompts the user 
 * 		for guesses until he/she guesses the number
 * @author Hunter Damron
 * //HighLowGame.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class HighLowGame {
	/**
	 * Begins execution of application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Random gen = new Random();
		int bound, answer, guess, num, intCont;
		boolean cont = true, win = false;
		JOptionPane.showMessageDialog(null, "Welcome to the high low game."
				+ "\nA random number will be generated and you will try to "
				+ "guess the number.\nThe computer will tell you each time "
				+ "if you are too high or too low.");
		end: while(cont) {
			num = 0;
			repeat: {
				try {
					bound = Integer.parseInt(JOptionPane.showInputDialog(
							"Please enter an upper bound for your game."));
				} catch(Exception e) {
					bound = 100; //100 by default
				}
				if(bound <= 0) {
					bound = 100; //100 by default
				}
				answer = gen.nextInt(bound) + 1;
				win = false;
				while(!win) {
					try {
						guess = Integer.parseInt(JOptionPane.showInputDialog(
								"Enter a number between 1 and " + bound));
					} catch(Exception e) {
						guess = -1;
					}
					num++;
					if(guess < 0) {
						num--;
						if(JOptionPane.showConfirmDialog(null, "You entered "
								+ "either an invalid integer or a negative number "
								+ "so you must quit now. Are you sure you want to leave?", 
								"Leaving so soon?", JOptionPane.YES_NO_OPTION, 
								JOptionPane.YES_NO_OPTION, null) == JOptionPane.YES_OPTION) {
							if(JOptionPane.showConfirmDialog(null, "Would you like to play "
									+ "again?", "Play again", JOptionPane.YES_NO_OPTION, 
									JOptionPane.YES_NO_OPTION, null) == JOptionPane.YES_OPTION) {
								win = true;
								break repeat;
							} else {
								break end;
							}
						}
					} else if(guess == answer) {
						win = true;
					} else if(guess > answer) {
						JOptionPane.showMessageDialog(null, "Too high");
					} else if(guess < answer) {
						JOptionPane.showMessageDialog(null, "Too low");
					}
				}
				intCont = JOptionPane.showConfirmDialog(null, "Congratulations. You won the "
						+ "game in only " + num + " moves. Would you like to play again?", 
						"Winning!", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, null);
				cont = intCont == JOptionPane.YES_OPTION;
				if(!cont) {
					break end;
				}
			}
		}
	}
}