/*
 * AreaTester.java
 * Hunter Damron
 * I did this
 * Purpose: Creates rectangle of random dimensions then prints area
 */

package E21;

import java.awt.Rectangle;

public class AreaTester {
	public static void main(String[] args)
	{
		Rectangle AreaTester;
		AreaTester = new Rectangle(10,10,42,19);
		double h = AreaTester.getHeight(); //Height of Rectangle AreaTester
		double w = AreaTester.getWidth(); //Width of Rectangle AreaTester
		double area = h * w; //Area of Rectangle AreaTester
		System.out.println("The area of Rectangle AreaTester is: " + area);
	}
}
