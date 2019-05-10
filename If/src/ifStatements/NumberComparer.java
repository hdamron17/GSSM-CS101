package ifStatements;
/**
 * Compares three number to see if they are the same, all different, or neither
 * @authorHunter Damron
 * //HumberComparer.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.util.Scanner;
public class NumberComparer {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double number1, number2, number3;
		System.out.print("Enter three numbers for scrutiny: ");
		number1 = Double.parseDouble(stdin.next());
		number2 = Double.parseDouble(stdin.next());
		number3 = Double.parseDouble(stdin.next());
		if(number2 == number1 && number3 == number2) {
			System.out.println("All same");
		} else if(number1 != number2 && number2 != number3 && number1 != number3) {
			System.out.println("All different");
		} else {
			System.out.println("Neither");
		}
		stdin.close();
	}
}
