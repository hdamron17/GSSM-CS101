package integerSeparator;
/**
 * Separates an integer into individual digits from decimal format
 * @author Hunter Damron
 * //IntegerSeparator.java
 * //Honor Code: I did not cheat
 */
import java.util.Scanner;

public class IntegerSeparator {
	/**
	 * main method starts the process
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int integer; //Integer to be broken into digits
		int numDigits; //Number of digits
		int counter = 0; //Counts up from 0 for array index
		int[] digits; //Integer separated into digits

		System.out.print("Enter an integer: ");
		integer = Integer.parseInt(scan.next());
		numDigits = (int) Math.log10((double) integer) + 1;
		digits = new int[numDigits];
		while(numDigits > 0) {
			/**
			 * While loop gets the digit specified by counter and subtracts that digits from the integer
			 * Then the loop decreases the numDigits and increases counter until numDigits is zero
			 */
			digits[counter] = integer / (int)Math.pow(10, numDigits - 1);
			integer = integer % (int)Math.pow(10, numDigits - 1);
			counter++;
			numDigits--;
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
