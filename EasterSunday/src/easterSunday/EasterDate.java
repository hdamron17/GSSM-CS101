package easterSunday;
/**
 * Calculates the date of Easter for the given year using Gauss's formula
 * @author Hunter Damron
 * //EasterDate.java
 * //Honor Code: I made this program with moral integrity
 */
import java.text.DecimalFormat;

public class EasterDate {
	private int year;
	
	/**
	 * Constructs EasterDate with specified year
	 * @param year Year of calculation
	 */
	public EasterDate(int year) {
		this.year = year;
	}
	
	/**
	 * Gets the day of Easter sunday
	 * @return Returns the day number of Easter Sunday
	 */
	public int getMonth() {
		int a, b, c, d, e, g, h, j, k, m, r, n;
		a = year % 19;
		b = year / 100;
		c = year % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		return n;
	}
	
	/**
	 * Gets the month of Easter Sunday
	 * @return Returns the month number of Easter Sunday
	 */
	public int getDay() {
		int a, b, c, d, e, g, h, j, k, m, r, n, p;
		a = year % 19;
		b = year / 100;
		c = year % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;
		return p;
	}
	
	/**
	 * Converts the date to a String formatted as MM/DD/YYYY
	 * @return Returns the date of Easter Sunday
	 */
	public String getDate() {
		DecimalFormat fmt2Digit = new DecimalFormat("00");
		DecimalFormat fmt4Digit = new DecimalFormat("0000");
		return fmt2Digit.format(this.getMonth()) + "/"
				+ fmt2Digit.format(getDay()) + "/" + fmt4Digit.format(year);
	}
}
