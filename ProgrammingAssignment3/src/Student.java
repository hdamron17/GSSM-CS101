/**
 * Student.java
 * Hunter Damron
 * Honor Code: I did not lie, cheat, or steal
 * Purpose: Emulates a student portfolio with grades and a method to get the average grade
 */

import javax.swing.JOptionPane;

public class Student {
	/**
	 * Instance Variables
	 */
	private double totalPoints;
	private double totalQuizes;
	private String name;
	
	/*
	 * Constructs new student with name created from JOptionPane
	 */
	public Student() {
		totalPoints = 0;
		totalQuizes = 0;
		name = JOptionPane.showInputDialog("Enter your first name: ");
		name = name + " " + JOptionPane.showInputDialog("Enter your last name: ");
	}
	
	/*
	 * Constructs new Student with name as parameter
	 */
	public Student(String name) {
		totalPoints = 0;
		totalQuizes = 0;
		this.name = name;
	}
	
	/*
	 * Adds a quiz grade through JOptionPane input dialog box
	 */
	public void addQuiz() {
		String stringScore = JOptionPane.showInputDialog("What did you make on your quiz?");
		double score = Double.parseDouble(stringScore);
		totalPoints = totalPoints + score;
		totalQuizes++;
	}
	
	/*
	 * Adds a quiz with score as a parameter
	 */
	public void addQuiz(double score) {
		totalPoints = totalPoints + score;
		totalQuizes++;
	}
	
	/* 
	 * Returns the first and last names of student separated by a space
	 */
	public String getName() {
		return name;
	}
	
	/* 
	 * Returns the number of total points
	 */
	public double getTotalPoints() {
		return totalPoints;
	}
	
	/*
	 * Returns the average score on all quizes
	 */
	public double getAverageScore() {
		if(totalQuizes != 0) {
			return totalPoints / totalQuizes;
		}
		else {
			return 0;
		}
	}
}
