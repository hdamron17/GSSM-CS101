package ifStatements;
/**
 * Reads a double then prints if that number is zero, positive, or negative
 * 		and if that number is small or large
 * @author Hunter Damron
 * //FloatTester.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.util.Scanner;
public class FloatTester {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double number;
		System.out.print("Enter a number: ");
		number = Double.parseDouble(stdin.next());
		System.out.print("The number is ");
		if(number == 0) {
			System.out.print("zero");
		} else if (number > 0) {
			System.out.print("positive");
		} else {
			System.out.print("negative");
		}
		if(Math.abs(number) > 1000000) {
			System.out.print(". It is also large.\n");
		} else if(Math.abs(number) < 1) {
			System.out.print(". It is also small.\n");
		} else {
			System.out.println(".");
		}
		stdin.close();
	}
}
