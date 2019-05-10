package integerMath;
/**
 * Demos the IntegerMath class to complete basic arithmetic
 * @author Hunter Damron
 * //IntegerMathDemo.java
 * //Honor Code: This is my work.
 */
import java.util.Scanner;

public class IntegerMathDemo {
	/**
	 * main method starts the process
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your two integers separated by a space: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a + b = " + IntegerMath.sum(a, b)
				+ "\na - b = " + IntegerMath.difference(a, b)
				+ "\na * b = " + IntegerMath.product(a, b)
				+ "\nAverage of a and b = " + IntegerMath.average(a, b)
				+ "\nDistance between a and b = " + IntegerMath.distance(a, b)
				+ "\nMinimum of a and b = " + IntegerMath.minimum(a, b)
				+ "\nMaximum of a and b = " + IntegerMath.maximum(a, b));
		scan.close();
	}
}
