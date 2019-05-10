/*
 * AddTester.java
 * Hunter Damron
 * I did this
 * Purpose: Use Rectangle add() method and prints new position and dimensions
 * 
 * Program in book should print new rectangle with upper left-hand corner at (0,0)
 */

package E24;

import java.awt.Rectangle;

public class AddTester {
	public static void main(String[] args) {
		Rectangle box = new Rectangle(5, 10, 20, 30);
		box.add(0, 0);
		System.out.println("Expected output of box: Position - (0,0) ; Width - 20 ; Height - 30");
		System.out.println("Actual Output of box: " + box + "\nOops, I was wrong... add() function brings the nearest point to the specified coordinate");
	}
}