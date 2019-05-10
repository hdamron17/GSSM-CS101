/**
 * Manages students' names and scores
 * @author Hunter Damron
 * //Honor Code: I did not lie, cheat, or steal
 * //ScoreKeeper.java
 */
package scoreKeeper;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ScoreKeeper {
	/**
	 * Begins program execution
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Student[] students;
		int largest, curve;
		boolean lookup, found;
		String name, foundStudent;
		DecimalFormat fmt = new DecimalFormat("#0.00");

		students = new Student[Integer.parseInt(JOptionPane.showInputDialog
				("How many scores will you be using today?"))];
		for(int count = 0; count < students.length; count++) {
			students[count] = new Student(JOptionPane.showInputDialog
					("Enter student #" + (count + 1) + "'s first name"), 
					JOptionPane.showInputDialog("Enter student #" 
					+ (count + 1) + "'s last name"));
			students[count].changeScore(Integer.parseInt(JOptionPane.showInputDialog
					("Enter " + students[count].getName() + "'s score")));
		}
		largest = students[0].getScore();
		for(Student count : students) {
			if(count.getScore() > largest)
				largest = count.getScore();
		}
		displayArray(students);

		if(largest < 100) {
			if(JOptionPane.showConfirmDialog(null, "Would you like to curve the grades?")
					== JOptionPane.YES_OPTION) {
				curve = 100 - largest;
				for(int count = 0; count < students.length; count++) {
					students[count].changeScore(students[count].getScore() + curve);
				}
				displayArray(students);
			}
		}
		JOptionPane.showMessageDialog(null, "The class average is: " + fmt.format(average(students)));
		lookup = true;
		while(lookup) {
			if(JOptionPane.showConfirmDialog(null, "Would you like to look up a certain student's score?",
					"Student Look-Up", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				name = JOptionPane.showInputDialog("Which student would you like to look at?");
				found = false;
				foundStudent = "Student not found";
				for(int count = 0; !found && count < students.length; count++) {
					if(students[count].getName().equalsIgnoreCase(name)) {
						found = true;
						foundStudent = "" + students[count];
					}
				}
				JOptionPane.showMessageDialog(null, "" + foundStudent);
			} else {
				lookup = false;
			}
		}
	}

	/**
	 * Displays the array of Students and scores in JOptionPane
	 * @param array Array of Students
	 */
	public static void displayArray(Student[] array) {
		String message = "Your students are: \n";
		for(int count = 0; count < array.length; count++) {
			if(count == array.length - 1 && array.length > 1)
				message += " and";
			message += " " + array[count] + "\n";
		}
		JOptionPane.showMessageDialog(null, message);
	}

	/**
	 * Displays the average score for an array of Students
	 * @param array Array of Students
	 * @return Returns the average score
	 */
	public static double average(Student[] array) {
		double sum = 0;
		for(Student count : array) {
			sum += count.getScore();
		}
		return sum / array.length;
	}
}
