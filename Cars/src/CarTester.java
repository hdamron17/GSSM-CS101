/**
 * Uses Car class to add gas and drive until the car runs out of fuel
 * @author Hunter Damron
 * //CarTester.java
 * //Honor Code: I did this without cheat
 */

import java.text.DecimalFormat;

public class CarTester {
	
	/**
	 * Creates a Volkswagon Beetle and drives
	 * @param args Empty command line arguments
	 */
	public static void main(String[] args) {
		Car VolkswagonBeetle = new Car(28);
		DecimalFormat fmt = new DecimalFormat("#,##0.000");
		VolkswagonBeetle.addGas(10);
		System.out.println("The Volkswagon Beetle is starting with " + 
		fmt.format(VolkswagonBeetle.getGasInTank()) + " galons in the tank");
		while(VolkswagonBeetle.getGasInTank() > 0) {
			VolkswagonBeetle.drive(30);
			System.out.println("The Volkswagon Beetle has " + 
			fmt.format(VolkswagonBeetle.getGasInTank()) + " galons left in the tank");
		}
	}
}
