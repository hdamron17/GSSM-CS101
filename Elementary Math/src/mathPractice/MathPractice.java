package mathPractice;
/**
 * Uses MathProblem class to help students practice math
 * @author Hunter Damron
 * //MathPractice.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import javax.swing.JOptionPane;

public class MathPractice {
	/**
	 * Starts execution of the application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		MathProblem prob;
		String level, operation;
		int guess = 0;
		Boolean validNumber = true;
		String[] levelChoices = {"Easy", "Medium", "Hard"};
		String[] opChoices = {"Addition (+)", "Subtraction (-)", "Multiplication (x)",
				"Division (/)"};
		
		JOptionPane.showMessageDialog(null, "Welcome. This MathProblem tester program "
				+ "is intended to help children learn elementary math.");
		level = (String)JOptionPane.showInputDialog(null, "Please choose easy, medium, "
				+ "or hard.",
				"Levels", JOptionPane.QUESTION_MESSAGE, null, levelChoices, levelChoices[0]);
		operation = (String)JOptionPane.showInputDialog(null, "Please choose +, -, x, or / "
				+ "to practice.",
				"Operation", JOptionPane.QUESTION_MESSAGE, null, opChoices, opChoices[0]);
		prob = new MathProblem(level, operation);
		do {
			try {
				guess = Integer.parseInt(JOptionPane.showInputDialog(prob.getProblem()));
				validNumber = true;
			} catch(NumberFormatException e) {
				validNumber = false;
				JOptionPane.showMessageDialog(null, "Please enter a valid integer");
			}
		} while(validNumber != true);
		prob.evaluate(guess);
		JOptionPane.showMessageDialog(null, prob.getMessage() + "\n" + prob);
	}
}
