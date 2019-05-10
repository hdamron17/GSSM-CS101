package circleSphere;
/**
 * Emulates a circle or sphere with a specified radius
 * @author Hunter Damron
 * //CircleSphere.java
 * //Honor Code: I did not give or receive any unauthorized help
 */
public class CircleSphere {
	private double radius;
	
	/**
	 * Constructs CicleSphere with specified radius
	 * @param radius Radius of the circle/sphere
	 */
	public CircleSphere(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Changes the radius to specified distance
	 * @param radius Radius of new circle/sphere
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Gets the radius of the circle/sphere
	 * @return Returns radius of circle/sphere
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Gets the area of the circle
	 * @return Returns area of the circle with specified radius
	 */
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	/**
	 * Gets circumference of circle
	 * @return Returns circumference of circle
	 */
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}
	
	/**
	 * Gets the volume of sphere
	 * @return Returns volume of sphere
	 */
	public double getVolume() {
		return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
	}
	
	/**
	 * Gets the surface area of sphere
	 * @return Return surface area of sphere
	 */
	public double getSurfaceArea() {
		return 4.0 * Math.PI * Math.pow(radius, 2);
	}
}
