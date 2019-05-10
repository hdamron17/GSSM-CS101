/*
 * ReplaceTester.java
 * Hunter Damron
 * I did this
 * Purpose: Encodes input by changing i's to !'s and s's to $'s
 */

package E25;

public class ReplaceTester {
	public static void main(String[] args) {
		String input = "Mississippi";
		System.out.println("Initial input: Mississippi");
		input = input.replace("i", "!");
		input = input.replace("s", "$");
		System.out.println("Expected output: M!$$!$$!pp!\nActual output: " + input);
	}
}
