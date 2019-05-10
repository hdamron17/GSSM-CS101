package integerMath;
/**
 * Completes basic arithmetic
 * @author Hunter Damron
 * //IntegerMathDemo.java
 * //Honor Code: This is my work.
 */
public class IntegerMath {
	
	/**
	 * Generates the sum of two numbers
	 * @param a The first variable in the series
	 * @param b The second variable in the series
	 * @return Returns a + b
	 */
	public static int sum(int a, int b) {
		return a + b;
	}
	
	/**
	 * Generates the difference between two numbers
	 * @param a The first variable
	 * @param b The second variable
	 * @return Returns the difference of a and b
	 */
	public static int difference(int a, int b) {
		return a - b;
	}
	
	/**
	 * Generates the product of two numbers
	 * @param a The first variable
	 * @param b The second variable
	 * @return Returns the product of a and b
	 */
	public static int product(int a, int b) {
		return a * b;
	}
	
	/**
	 * Gets the average of two numbers
	 * @param a The first variable
	 * @param b The second variable
	 * @return Returns the average of the two numbers
	 */
	public static double average(int a, int b) {
		return (a + b) / 2.0;
	}
	
	/**
	 * Gets the distance from a to b
	 * @param a Starting position
	 * @param b Ending position
	 * @return Returns the always positive distance between Wes and Hunter
	 */
	public static int distance(int a, int b) {
		return Math.abs(a - b);
	}
	
	/**
	 * Gets the, minimum value of a and b
	 * @param a the first variable
	 * @param b the second variable
	 * @return Returns the maximum of the two
	 */
	public static int maximum(int a, int b) {
		return Math.max(a, b);
	}
	
	/**
	 * Gets the minimum value of and and B
	 * @param a the second variable
	 * @param b the first variable
	 * @return Returns the minimum of the two
	 */
	public static int minimum(int a, int b) {
		return Math.min(a, b);	
	}
}
