package integerSeparator;
/**
 * Separates an integer into individual digits from decimal format (alternate method)
 * @author Hunter Damron
 * //IntegerSeparatorAlternate.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.util.Scanner;

public class IntegerSeparatorAlternate {
	/**
	 * main method starts the process
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String integer; //Integer to be broken into digits (as a string)
		int numDigits; //Number of digits (length of integer as String)
		int counter = 0; //Counts up from 0 for array index
		int[] digits; //Integer separated into digits
		
		System.out.print("Enter an integer: ");
		integer = scan.next();
		numDigits = integer.length();
		digits = new int[numDigits];
		while(counter < numDigits) {
			/**
			 * Loop puts the parsed substring into the array at index specified by counter
			 */
			digits[counter] = Integer.parseInt(integer.substring(counter, counter + 1));
			counter++;
		}
		System.out.print("The digits are:");
			for(int digit : digits) {
				/**
				 * Prints each digit individually using a for loop because of unknown length
				 */
				System.out.print(" " + digit);
			}
		scan.close();
	}
}
