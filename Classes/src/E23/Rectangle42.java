/*
 * Rectangle42.java
 * Hunter Damron
 * I did this
 * Purpose: creates rectangle with area of 42 sq 
 * units and rectangle with perimeter of 42 units
 * then prints output
 */

package E23;

import java.awt.Rectangle;

public class Rectangle42 {
	public static void main(String[] args)
	{
		Rectangle area, perimeter; //Rectangle with area of 42
		area = new Rectangle(10,10,6,7);
		perimeter = new Rectangle(10,10,11,10);
		double h = area.getHeight();
		double w = area.getWidth();
		System.out.println("Rectangle area has dimensions " + h + " x " + w);
		h = perimeter.getHeight();
		w = perimeter.getWidth();
		System.out.println("Rectangle perimeter has dimensions " + h + " x " + w);
	}
}
