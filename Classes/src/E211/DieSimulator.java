/*
 * DieSimulator.java
 * Hunter Damron
 * I did this
 * Purpose: Generates a random number between 1 and 6
 * to emulate a six-sided die being rolled
 */

package E211;

import java.util.Random;

public class DieSimulator {
	public static void main(String[] args) {
		int output = 0;
		do {
			Random rand = new Random();
			System.out.print("The die rolled: ");
			output = rand.nextInt(6) + 1;
			System.out.println(output);
		} while(output != 6);
	}
}
