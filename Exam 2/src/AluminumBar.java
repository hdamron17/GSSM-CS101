public class AluminumBar {
	private double length, side;
	
	public AluminumBar(double length, double side) {
		this.length = length;
		this.side = side;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getSide(){
		return side;
	}
	
	public double getVolume() {
		return length * side * side;
	}
	
	public double getSurfaceArea() {
		return 2 * side * side + 4 * length * side;
	}
	
	public void addToLength(double amount) {
		if(-amount < length) {
			length = length + amount; //or use += operator
		} else {
			length = 0; //because length cannot be negative
		}
	}
}
