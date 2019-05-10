/*
 * BatteryTester.java
 * Hunter Damron
 * Honor Code: I copied this tester from Mrs. Bunn's board with integrity
 * Purpose: Tests Battery class by initializing with a charge, draining, and recharging
 */
public class BatteryTester {
	public static void main(String[] args) {
		Battery AA = new Battery(2400);
		double drainAmount = 50;
		
		AA.drain(drainAmount);
		System.out.println ("Remianing capacity: " + AA.getRemainingCapacity());
		
		AA.charge();
		System.out.println("This battery capacity is " + AA.getRemainingCapacity());
	}
}
