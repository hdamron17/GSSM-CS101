package dewPoint;
/**
 * Converts between temperature measurement scales
 * @author Hunter Damron; Partner: Nikki
 * //TempScale.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public enum TempScale {
	K(" Kelvins"), C("° C"), F("° F");
	
	public static final double ABS_ZERO = -273.15;
	public static final double F_TO_C_SCALE_FACTOR = 5.0 / 9.0;
	public static final double F_TO_C_CONSTANT = 32.0;
	private String name;
	
	private TempScale(String name) {
		this.name = name;
	}
	
	/**
	 * Overrides String toString() method
	 */
	public String toString() {
		return name;
	}
	
	/**
	 * Parses string to TempScale value
	 * @param symbol String value of symbol
	 * @return Returns the TempScale value of the symbol
	 */
	public static TempScale parseTempScale(String symbol) {
		TempScale ret;
		symbol = symbol.toUpperCase();
		switch(symbol) {
		case "K":
		case "KELVIN":
			ret = K;
			break;
		case "F":
		case "FAHRENHEIT":
			ret = F;
			break;
		case "C":
		case "Celsius":
		default:
			ret = C;
		}
		return ret;
	}
	
	/**
	 * Converts temperature to Celsius scale
	 * @param temp Temperature in other scale
	 * @param from TempScale value from which to be converted
	 * @param to TempScale value to which to be converted
	 * @return Returns the temperature in Celsius
	 */
	public static double convert(double temp, TempScale from, TempScale to) {
		double ret, Celsius;
		switch(from) {
		case K:
			Celsius = temp + TempScale.ABS_ZERO;
			break;
		case F:
			Celsius = TempScale.F_TO_C_SCALE_FACTOR * (temp - TempScale.F_TO_C_CONSTANT);
			break;
		case C:
		default:
			Celsius = temp;
		}
		switch(to) {
		case K:
			ret = Celsius - TempScale.ABS_ZERO;
			break;
		case F:
			ret = Celsius / TempScale.F_TO_C_SCALE_FACTOR + TempScale.F_TO_C_CONSTANT;
			break;
		case C:
		default:
			ret = Celsius;	
		}
		return ret;
	}
}
