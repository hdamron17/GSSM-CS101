package leapYear;
/**
 * Tests user supplied year to see if it is a leap year
 * @author Hunter Damron
 * //LeapYearDemo.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.util.Scanner;

public class LeapYearDemo {
	/**
	 * Begins application execution at main
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int yr;
		Year test;
		
		System.out.print("Enter a year to see if it is a leap year: ");
		yr = stdin.nextInt();
		test = new Year(yr);
		if(test.isLeapYear()) {
			System.out.println("Yes, " + yr + " is a yeap year.");
		} else {
			System.out.println(yr + " is not a leap year.");
		}
		stdin.close();
		
		/********************************/
		/* Output tests:				*/
		/* 1999 no			1997 no		*/
		/* 1998 no			2000 yes	*/
		/* 1800 no			1600 yes	*/
		/* 1492 no			1738 no		*/
		/* 1984 yes			1942 no		*/
		/* All good						*/
		/********************************/
	}
}
