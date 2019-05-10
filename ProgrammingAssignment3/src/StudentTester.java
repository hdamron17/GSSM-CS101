/**
 * StudentTester.java
 * Hunter Damron
 * Honor Code: This is my work and I treat it with utmost respect
 * Purpose: Uses Student class v1.0 and v2.0 to emulate student quiz grading
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class StudentTester {
	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		Student  student1, student2;
		String input, name, stringScore;
		int score;
		
		name = JOptionPane.showInputDialog("Enter your first name: ");
		name = name + " " + JOptionPane.showInputDialog("Enter your last name: ");
		student1 = new Student(name);		
		input = JOptionPane.showInputDialog("Thank you, " + student1.getName() + ", for using the new, "
				+ "experimental version of this software. Type \"-h\" for a help dialog and the commonds");
		while(!input.matches("quit")){
			if(input.matches("quiz")) {
				stringScore = JOptionPane.showInputDialog("What did you make on your quiz?");
				score = Integer.parseInt(stringScore);
				student1.addQuiz(score);
			} else if (input.matches("total")) {
				JOptionPane.showMessageDialog(null, student1.getName() + " has " + student1.getTotalPoints()
				+ " points so far.");
			} else if (input.matches("average")) {
				JOptionPane.showMessageDialog(null, student1.getName() + "'s average is " 
						+ fmt.format(student1.getAverageScore())
				+ " points.");
			} else if(input.matches("-h")) {
				JOptionPane.showMessageDialog(null, "The purpose of this program is "
						+ "to aid in student quiz scoring\n"
						+ "Your commands are: \n"
						+ "\"quiz\" to add a quiz grade\n"
						+ "\"total\" to print the total number of points calculated thus far\n"
						+ "\"average\" to calculate and print the student's average\n"
						+ "and \"-h\" to print this help dialog");
			} else {
				JOptionPane.showMessageDialog(null, "I'm sorry. I'm afraid I can't let you do that.");
			}
			input = JOptionPane.showInputDialog("Please enter your next command (-h for help dialog)");
		}
		JOptionPane.showMessageDialog(null,"Goodbye, " + student1.getName() 
			+ ". We will now continue to the next student.");
		
		student2 = new Student();
		input = JOptionPane.showInputDialog("Thank you, " + student2.getName() + ", for using the new, "
				+ "experimental version of this software. Type \"-h\" for a help dialog and the commonds");
		while(!input.matches("quit")){
			if(input.matches("quiz")) {
				student2.addQuiz();
			} else if (input.matches("total")) {
				JOptionPane.showMessageDialog(null, student2.getName() + " has " + student2.getTotalPoints()
				+ " points so far.");
			} else if (input.matches("average")) {
				JOptionPane.showMessageDialog(null, student2.getName() + "'s average is "
						+ fmt.format(student2.getAverageScore())
				+ " points.");
			} else if(input.matches("-h")) {
				JOptionPane.showMessageDialog(null, "The purpose of this program is "
						+ "to aid in student quiz scoring\n"
						+ "Your commands are: \n"
						+ "\"quiz\" to add a quiz grade\n"
						+ "\"total\" to print the total number of points calculated thus far\n"
						+ "\"average\" to calculate and print the student's average\n"
						+ "and \"-h\" to print this help dialog");
			} else {
				JOptionPane.showMessageDialog(null, "I'm sorry. I'm afraid I can't let you do that.");
			}
			input = JOptionPane.showInputDialog("Please enter your next command (-h for help dialog)");
		}
	}
}