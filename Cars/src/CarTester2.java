/**
 * Uses Car class to add gas, drive, add gas again, and then drive some more
 * @author Hunter Damron
 * //CarTester2.java
 * //Honor Code: I did this without cheat
 */
public class CarTester2 {
	public static void main(String[] args) {
		Car clunker = new Car(10);
		clunker.addGas(10);
		System.out.println("The clunker is starting with " + 
		clunker.getGasInTank() + " galons in the tank\n");
		clunker.drive(40);
		clunker.addGas(5);
		clunker.drive(50);
		System.out.println("The clunker now has " + 
		clunker.getGasInTank() + " galons in the tank");
		System.out.println("My car is: " + clunker);
	}
}
