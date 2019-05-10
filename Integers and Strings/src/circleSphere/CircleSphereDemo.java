package circleSphere;
/**
 * Tests CircleSphere class to print dimensions
 * @author Hunter Damron
 * //CircleSphereDemo.java
 * //Honor Code: This is my own work, not anyone else's
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleSphereDemo {
	/**
	 * main method starts the process
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CircleSphere roundThing;
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		double radius;
		System.out.print("Enter the radius of your cirlce or sphere: ");
		radius = scan.nextDouble();
		roundThing = new CircleSphere(radius);
		System.out.println("The circle/sphere has an area of " + fmt.format(roundThing.getArea()) + " square units"
		+ ", \na circumference of " + fmt.format(roundThing.getCircumference()) + " units"
		+ ", \na volume of " + fmt.format(roundThing.getVolume()) + " cubic units"
		+ ", \nand a surface area of " + fmt.format(roundThing.getSurfaceArea()) + " square units");
		scan.close();
	}
}
