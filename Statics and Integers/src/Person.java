/**
 * Creates an employee with a name, year of birth, and salary
 * @author Hunter Damron
 * //Person.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public class Person {
	private String name;
	private double hourlyWage;
	private int id;
	private final int YEAR_BORN; //Instance constant so it should not be changed (UPPER_CASE by default)
	public static final double BASE_HOURS_PER_WEEK = 40.0; //Static so it is used by the class not by each object
		//Public so the user of the class can see see this constant
	private static int employeeNumber; //Static but not final - 
		//can be used by all but it can be changed (changed for whole class)
	
	public Person(String name, double hourlyRate, int yearOfBirth) {
		this.name = name;
		hourlyWage = hourlyRate;
		YEAR_BORN = yearOfBirth;
		employeeNumber++;
		id = employeeNumber;
	}
	
	/**
	 * Gets the name of the employee
	 * @return Returns name of employee
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the employee's year of birth
	 * @return Returns the employee's year of birth
	 */
	public int getYearBorn() {
		return YEAR_BORN;
	}
	
	/**
	 * Gives the paycheck for the number of hours the employee worked
	 * @param hours Number of hours the employee worked
	 * @return Returns paycheck for the period of time
	 */
	public double paycheck(double hours) {
		if(hours > BASE_HOURS_PER_WEEK) {
			return hourlyWage * BASE_HOURS_PER_WEEK + 1.5 * hourlyWage * (hours - BASE_HOURS_PER_WEEK); 
		} else {
			return hourlyWage * hours;
		}
	}
	
	/**
	 * Overrides Object toString method to suit the class's needs
	 */
	public String toString() {
		String info = name + " ID: " + id;
		return info;
	}
}
