package easterSunday;
/**
 * Tests EasterDate class to print the date of Easter in the specified year
 * @author Hunter Damron
 * //EasterDateDemo.java
 * //Honor Code: This is my code. I did not share it or steal it
 */
import java.util.Scanner;

public class EasterDateDemo {
	/**
	 * main method starts the process
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		int year;
		EasterDate date;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year for Easter Sunday calculation: ");
		year = Integer.parseInt(scan.next());
		date = new EasterDate(year);
		//Alternate: System.out.println("Easter is on " + date.getMonth()
		//		+ "/" + date.getDay() + "/" + year);
		System.out.println("Easter is on " + date.getDate());
		scan.close();
	}
}
