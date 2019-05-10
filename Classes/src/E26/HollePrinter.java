/*
 * HollePrinter.java
 * Hunter Damron
 * I did this
 * Purpose: Takes input then changes e's into o's and o's into e's
 */

package E26;

public class HollePrinter {
	public static void main(String[] args) {
		String input = "Hello, World!";
		input = input.replace("e", "☻");
		input = input.replace("o", "e");
		input = input.replace("☻", "o");
		System.out.println("Expected output: Holle, Werld!");
		System.out.println("Actual output: " + input);
	}
}
