package game;

import java.util.Random;
import javax.swing.JOptionPane;

public class HighLowGameBroken {
	public static void main(String[] args) {
		Random gen = new Random();
		int answer, guess, bound = 100;
		boolean cont = true;
		while(cont) {
			try {
				bound = Integer.parseInt(JOptionPane.showInputDialog("Enter the upper bound for this session", "Bounds"));
			} catch(Exception e) {
				break; 
			}
			answer = gen.nextInt(bound) + 1;
			try {
				guess = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and " + bound));
			} catch(Exception e) {
				break;
			}
			while(guess != answer) {
				if(answer == -1)
					break;
				else {
					if(guess > answer)
						JOptionPane.showMessageDialog(null, "Too high");
					if(guess < answer)
						JOptionPane.showMessageDialog(null, "Too low");
				}
				try {
					guess = Integer.parseInt(JOptionPane.showInputDialog("Try again"));
				} catch(Exception e) {
					break;
				}
			}
			cont = JOptionPane.showConfirmDialog(null, "Would you like to continue?", 
					"Continue?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		}
	}
}
