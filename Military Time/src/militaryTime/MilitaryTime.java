package militaryTime;
/**
 * Calculates time intervals from military time
 * @author Hunter Damron; Partner: Nikki
 * //MilitaryTime.java
 * //Honor code: I did not lie, cheat, or steal
 */
import java.text.DecimalFormat;

public class MilitaryTime {
	private int startHours, startMinutes, stopHours, stopMinutes;
	private DecimalFormat fmt = new DecimalFormat("00");
	
	/**
	 * Constructs new MilitaryTime object
	 * @param startTime Starting time in form HHMM
	 * @param stopTime Stopping time in form HHMM
	 */
	public MilitaryTime(int startTime, int stopTime) {
		startHours = startTime / 100;
		startMinutes = startTime % 100;
		stopHours = stopTime / 100;
		stopMinutes = stopTime % 100;
	}
	
	/**
	 * Calculates the number of hours (not including minutes)
	 * @return Returns number of hours
	 */
	public int hours() {
		return stopHours - startHours + 
				(int)Math.floor((stopMinutes - startMinutes) / 60.0);
	}
	
	/**
	 * Calculates the number of minutes (not including hours)
	 * @return Returns number of minutes
	 */
	public int minutes() {
		return stopMinutes - startMinutes - 
				(int)Math.floor((stopMinutes - startMinutes) / 60.0) * 60;
	}
	
	/**
	 * Calculates the total number of hours (including minutes)
	 * @return Returns total number of hours
	 */
	public double totalHours() {
		return this.hours() + this.minutes() / 60.0;
	}
	
	/**
	 * Calculates the total number of minutes (including hours)
	 * @return Returns total number of minutes
	 */
	public int totalMinutes() {
		return this.minutes() + this.hours() * 60;
	}
	
	/**
	 * Generates a string with the time interval
	 * @return Returns a String with the time interval
	 */
	public String interval() {
		return "Elapsed time from start time to end time is " + fmt.format(this.hours())
				+ " hours and " + fmt.format(this.minutes()) + " minutes";
	}
	
	/**
	 * Generates a string with the time interval
	 * @return Returns a String with the time interval
	 */
	public String overnightInterval() {
		int hours;
		hours = stopHours - startHours - (int)Math.floor((stopHours - startHours) / 24.0)
				* 24 + (int)Math.floor((stopMinutes - startMinutes) / 60.0);
		return "Overnight elapsed time from start time to end time is " + fmt.format(hours) 
				+ " hours and " + fmt.format(this.minutes()) + " minutes";
	}
}
