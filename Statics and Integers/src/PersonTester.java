/**
 * Tests Person class, especially its payCheck method
 * @author Hunter Damron
 * //PersonTester.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public class PersonTester {
	/**
	 * Begins execution at main
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Person boss = new Person("Mr. Big", 2000.0, 1985);
		Person worker = new Person("Steve", 25.0, 1992);
		Person intern = new Person("Kelly", 0.0, 1998);
		System.out.println("Workers: " + boss + ", " + worker + ", and " + intern);
		
		int week = 1;
		double[] weekHours = {40, 34, 50, 58, 15, 0, 52, 42, 39, 30};
		for(double hours : weekHours) {
			System.out.println("Week " + week + " (" + hours + " hours)"
					+ " : $" + worker.paycheck(hours));
			week++;
		}
	}
}
