package militaryTime;
/**
 * Demos the MilitaryTime class to use military time
 * @author Hunter Damron
 * //MilitaryTimeDemo.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public class MilitaryTimeDemo {
	/**
	 * Begins program execution
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		MilitaryTime time = new MilitaryTime(1230, 0415);
		System.out.println(time.interval() + "\n" + time.overnightInterval());
		time = new MilitaryTime(0001, 0625);
		System.out.println(time.interval() + "\n" + time.overnightInterval());
		time = new MilitaryTime(1230, 0242);
		System.out.println(time.interval() + "\n" + time.overnightInterval());
	}
}
