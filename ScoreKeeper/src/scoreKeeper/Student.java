/**
 * Emulates a student with a single score
 * @author Hunter Damron
 * //Honor Code: I did not lie, cheat, or steal
 * //Student.java
 */
package scoreKeeper;

public class Student {
	private int score;
	private String fName, lName;

	public Student(String fName, String lName, int score) {
		this.fName = fName;
		this.lName = lName;
		this.score = score;
	}

	public Student(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		score = 0;
	}

	public String getName() {
		return fName + " " + lName;
	}

	public int getScore() {
		return score;
	}

	public void changeScore(int score) {
		this.score = score;
	}

	public String toString() {
		return getName() + " : " + getScore();
	}
}
