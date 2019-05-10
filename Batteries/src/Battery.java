/**
 * Models a battery with a specific capacity, drain and charge
 * @author Hunter Damron
 * Honor code: I created this masterpiece on my own
 * Purpose: Emulates a battery which can be drained and recharged to its initial state
 */
public class Battery {
	/**
	 * instance variables
	 */
	private double capacity;
	private double initialCapacity;
	
	/**
	 * Constructor(s)
	 * @capacity
	 */
	public Battery(double capacity){
		this.capacity = capacity;
		initialCapacity = capacity;
	}
	
	/**
	 * drains the battery by the given amount
	 * @param amount
	 */
	public void drain(double amount){
		capacity = capacity - amount;
	}
	/**
	 * charges the battery to its original capacity
	 */
	public void charge(){
		capacity = initialCapacity;
	}
	/**
	 * returns the remaining capacity of the battery
	 * @return remaining capacity
	 */
	public double getRemainingCapacity(){
		return capacity;
	}
}

