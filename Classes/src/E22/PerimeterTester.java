/*
 * PerimeterTester.java
 * Hunter Damron
 * I did this
 * Purpose: creates rectangle of random dimensions then prints perimeter
 */

package E22;

import java.awt.Rectangle;

public class PerimeterTester {
	public static void main(String[] args)
	{
		Rectangle PerimeterTester;
		PerimeterTester = new Rectangle(10,10,42,19);
		double h = PerimeterTester.getHeight(); //Height of Rectangle PerimeterTester
		double w = PerimeterTester.getWidth(); //Width of Rectangle PerimeterTester
		double perimeter = 2 * h + 2 * w; //Perimeter of Rectangle PerimeterTester
		System.out.println("The perimeter of Rectangle PerimeterTester is: " + perimeter);
	}
}
