package mathPractice;
/**
 * Uses MathProblem class to make a student study session
 * @author Hunter Damron
 * //ModifiedMathPractice.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class ModifiedMathPractice {
	/**
	 * Starts execution of the application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		boolean proceed = true;
		MathProblem prob;
		DecimalFormat fmt = new DecimalFormat("0");
		String level = "", operation = "", stringYesNo;
		Random gen = new Random();
		Operation op = Operation.ADD;
		int guess, problems, probNumber, opGen,
		correctQ = 0, totalQ = 0, correctQinSession, totalQinSession;
		boolean correct;
		String[] levelChoices = {"Easy", "Medium", "Hard"};
		String[] opChoices = {"Addition (+)", "Subtraction (-)", "Multiplication (x)",
		"Division (/)", "Suprise Me!"};
		String[] yesNo = {"Yes!", "No :("};
		JOptionPane.showMessageDialog(null, "Welcome. This MathProblem application "
				+ "is intended to help children learn elementary math."
				+ "\nYou can choose from three levels of difficulty and "
				+ "four different operations.");
		while(proceed) {
			correctQinSession = 0;
			totalQinSession = 0;
			problems = 0;
			/*
			 * Try catch included to prevent NumberFormatException 
			 * when output is not an integer
			 */
			try {
				problems = Integer.parseInt(JOptionPane.showInputDialog("How many "
						+ "questions would you like to practice?"));
			} catch(NumberFormatException e) {
				problems = 0;
				//JOptionPane.showMessageDialog(null, "Invalid Integer changed to 0");
			}
			if(problems!= 0) {
				level = (String)JOptionPane.showInputDialog(null, "Please choose easy, "
						+ "medium, or hard.", "Levels", JOptionPane.QUESTION_MESSAGE, 
						null, levelChoices, levelChoices[0]);
				operation = (String)JOptionPane.showInputDialog(null, "Please choose +, -, "
						+ "x, or / to practice.", "Operation", JOptionPane.QUESTION_MESSAGE, 
						null, opChoices, opChoices[0]);
			}
			probNumber = 1;
			while(probNumber <= problems) {
				if(operation.equals("Suprise Me!")) {
					opGen = gen.nextInt(4);
					switch(opGen) {
					case 0: op = Operation.ADD; break;
					case 1: op = Operation.SUBTRACT; break;
					case 2: op = Operation.MULTIPLY; break;
					case 3: op = Operation.DIVIDE;
					}
				} else {
					op = Operation.parseOp(operation);
				}
				prob = new MathProblem(level, op);
				probNumber++;
				guess = 0;
				/*
				 * Try catch included to prevent NumberFormatException 
				 * when output is not an integer
				 */
				try {
					guess = Integer.parseInt(JOptionPane.showInputDialog(prob.getProblem()));
				} catch(NumberFormatException e) {
					guess = 0;
					JOptionPane.showMessageDialog(null, "Invalid Integer changed to 0");
				}
				correct = prob.evaluate(guess);
				JOptionPane.showMessageDialog(null, prob.getMessage() + "\n" + prob);
				totalQ++;
				totalQinSession++;
				if(correct) {
					correctQ++;
					correctQinSession++;
				}
			}
			if(problems != 0) {
				if(totalQ != totalQinSession) {
					JOptionPane.showMessageDialog(null, "Study Session Results:\nYou got "
							+ correctQinSession + " out of " + totalQinSession
							+ " questions in this session correct for an average of "
							+ fmt.format(100 * (double)correctQinSession / totalQinSession)
							+ "%.\nOverall " + correctQ + " of " + totalQ + " for an average "
							+ "of " + fmt.format(100 * (double)correctQ / totalQ) + "%.");
				} else {
					JOptionPane.showMessageDialog(null, "Study Session Results:\nYou got "
							+ correctQinSession + " out of " + totalQinSession
							+ " questions in this session correct for an average of "
							+ fmt.format(100 * (double)correctQinSession / totalQinSession)
							+ "%.");
				}
			}
			/*
			 * Try catch included to prevent NullPointerException 
			 * when dialog box is prematurely closed
			 */
			try {
				stringYesNo = (String)JOptionPane.showInputDialog(null, 
						"Would you like to start another study session?",
						"Continue?", JOptionPane.QUESTION_MESSAGE, null, yesNo, yesNo[0]);
				proceed = stringYesNo.equals("Yes!");
			} catch(NullPointerException e) {
				proceed = false;
			}
		}
	}
}
