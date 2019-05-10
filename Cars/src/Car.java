/**
 * Emulates car by driving with certain fuel efficiency and certain amount of gas in the tank
 * @author Hunter Damron
 * //Car.java
 * //Honor Code: I made this myself and I am quite proud
 */

public class Car {
	private double efficiency; //in mph
	private double gasInTank; //amount of gas in tank
	
	/**
	 * Creates car with carMPH efficiency
	 * @param carMPH Efficiency of car
	 */
	public Car(double carMPH) {
		efficiency = carMPH;
		gasInTank = 0;
	}
	
	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Car[efficiency = " + efficiency + "; gas level = " + gasInTank + "]";
	}
	
	/**
	 * Adds specified amount of gas to the tank
	 * @param fuelIn Amount of fuel to be added to the tank
	 */
	public void addGas(double fuelIn) {
		gasInTank = gasInTank + fuelIn;
	}
	
	/**
	 * Drives the car for specified distance
	 * @param distance Distance traveled by car
	 */
	public void drive(double distance) {
		double maxDistance = gasInTank * efficiency;
		if (distance <= maxDistance) {
			gasInTank = gasInTank - (distance / efficiency);
		}
		else {
			gasInTank = gasInTank - (maxDistance / efficiency);
		}
	}
	
	/**
	 * Gets the amount of gas in the tank
	 * @return Returns the amount of gas in the tank
	 */
	public double getGasInTank() {
		return gasInTank;
	}
}
