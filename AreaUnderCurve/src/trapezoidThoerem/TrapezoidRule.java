package trapezoidThoerem;
/**
 * Creates a quadratic equation within an interval 
 * 		and uses trapezoids to approximate the area
 * @author Hunter Damron
 * //TrapezoidRule.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public class TrapezoidRule {
	private double a, b, c, beginning, num;
	private double interval;
	
	/**
	 * Constructs TrapezoidRule from the given parameters 
	 * 		(form ax^2 + bx + c)
	 * @param a Coefficient of x^2
	 * @param b Coefficient of x
	 * @param c y-intercept
	 * @param beginning Beginning of interval
	 * @param end End of interval
	 * @param intervals Number of subintervals
	 */
	public TrapezoidRule(double a, double b, double c, 
			double beginning, double end, long intervals) {
		this.a = a;
		this.b = b;
		this.c = c;
		num = intervals;
		if(beginning <= end) {
		this.beginning = beginning;
			interval = (end - beginning) / intervals;
		} else {
			this.beginning = end;
			interval = (beginning - end) / intervals;
		}
	}
	
	/**
	 * Gets the area under the curve within the interval
	 * @return Returns area under the curve
	 */
	public double findArea() {
		double area = 0, base1, base2;
		for(int count = 0; count < num; count++) {
			base1 = a * Math.pow((beginning + count * interval), 2) 
					+ b * (beginning + count * interval) + c;
			base2 = a * Math.pow((beginning + (count + 1) * interval), 2) 
					+ b * (beginning + (count + 1) * interval) + c;
			area += 0.5 * interval * (base1 + base2);
		}
		return area;
	}
}
