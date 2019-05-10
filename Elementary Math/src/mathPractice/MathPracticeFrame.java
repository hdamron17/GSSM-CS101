package mathPractice;

import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MathPracticeFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathPracticeFrame window = new MathPracticeFrame();
					window.frame.setTitle("Math Practice");
					window.frame.setVisible(true);
					window.frame.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MathPracticeFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Math Practice");
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		Boolean proceed = true;
		MathProblem prob;
		DecimalFormat fmt = new DecimalFormat("0");
		String level, operation, stringYesNo;
		int guess, problems, probNumber, 
		correctQ = 0, totalQ = 0, correctQinSession, totalQinSession;
		Boolean validNumber, correct;
		String[] levelChoices = {"Easy", "Medium", "Hard"};
		String[] opChoices = {"Addition (+)", "Subtraction (-)", "Multiplication (x)",
				"Division (/)"};
		String[] yesNo = {"Yes!", "No :("};
		JOptionPane.showInternalMessageDialog(panel, "Welcome. This MathProblem tester program "
				+ "is\nintended to help children learn elementary math.");
		while(proceed) {
			correctQinSession = 0;
			totalQinSession = 0;
			validNumber = true;
			problems = 0;
			do {
				try {
					problems = Integer.parseInt(JOptionPane.showInternalInputDialog(panel, "How many "
							+ "questions would you like to practice?"));
					validNumber = true;
				} catch(Exception e) {
					validNumber = false;
					JOptionPane.showInternalMessageDialog(panel, "Please enter a valid integer");
				}
			} while(validNumber != true);
			level = (String)JOptionPane.showInternalInputDialog(panel, "Please choose easy, medium, "
					+ "or hard.",
					"Levels", JOptionPane.QUESTION_MESSAGE, null, levelChoices, levelChoices[0]);
			operation = (String)JOptionPane.showInternalInputDialog(panel, "Please choose +, -, x, or / "
					+ "to practice.",
					"Operation", JOptionPane.QUESTION_MESSAGE, null, opChoices, opChoices[0]);
			probNumber = 1;
			while(probNumber <= problems) {
				prob = new MathProblem(level, operation);
				probNumber++;
				guess = 0;
				validNumber = true;
				do {
					try {
						guess = Integer.parseInt(JOptionPane.showInternalInputDialog(panel, prob.getProblem()));
						validNumber = true;
					} catch(Exception e) {
						validNumber = false;
						JOptionPane.showInternalMessageDialog(panel, "Please enter a valid integer");
					}
				} while(validNumber != true);
				correct = prob.evaluate(guess);
				JOptionPane.showInternalMessageDialog(panel, prob.getMessage() + "\n" + prob);
				totalQ++;
				totalQinSession++;
				if(correct) {
					correctQ++;
					correctQinSession++;
				}
			}
			if(totalQ != totalQinSession) {
				JOptionPane.showInternalMessageDialog(panel, "Study Session Results:\nYou got "
						+ correctQinSession + " out of " + totalQinSession
						+ " questions in this session correct for an average of "
						+ fmt.format(100 * (double)correctQinSession / totalQinSession) + "%."
						+ "\nOverall " + correctQ + " of " + totalQ + " for an average of "
						+ fmt.format(100 * (double)correctQ / totalQ) + "%.");
			} else {
				JOptionPane.showInternalMessageDialog(panel, "Study Session Results:\nYou got "
						+ correctQinSession + " out of " + totalQinSession
						+ " questions in this session correct for an average of "
						+ fmt.format(100 * (double)correctQinSession / totalQinSession) + "%.");
			}
			try {
			stringYesNo = (String)JOptionPane.showInternalInputDialog(panel, 
					"Would you like to start another study session?",
					"Continue?", JOptionPane.QUESTION_MESSAGE, null, yesNo, yesNo[0]);
			proceed = stringYesNo.equals("Yes!");
			} catch(Exception e) {
				proceed = false;
			}
		}
	}
}
