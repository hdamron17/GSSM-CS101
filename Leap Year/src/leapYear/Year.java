package leapYear;
/**
 * Tests year to see if it is a leap year
 * @author Hunter Damron
 * //Year.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public class Year {
	private int yr;
	
	/**
	 * Constructs new Year instance from the year
	 * @param yr Year
	 */
	public Year(int yr) {
		this.yr = yr;
	}
	
	/**
	 * Tests the year to see if it is a leap year
	 * @return Returns true if the year is a leap year
	 */
	public Boolean isLeapYear() {
		return yr > 1582 && yr % 4 == 0 && (yr % 100 != 0 || yr % 400 == 0);
	}
}
