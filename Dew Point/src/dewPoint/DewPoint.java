package dewPoint;
/**
 * Calculates the dew point from temperature and relative
 * 		humidity
 * @author Hunter Damron; Partner: Nikki
 * //DewPoint.java
 * //Honor code: I did not lie, cheat, or steal
 */
public class DewPoint {
	public static final double A = 17.27, B = 237.7;
	private double humidity;
	private double temp;
	private TempScale scale;
	
	/**
	 * Constructs DewPoint from relative humidity, temperature
	 * 		and the temperature scale
	 * @param humidity Relative Humidity
	 * @param temp Temperature
	 * @param scale Temperature Scale (K, C, or F)
	 */
	public DewPoint(double humidity, double temp, TempScale scale) {
		this.humidity = humidity;
		this.temp = TempScale.convert(temp, scale, TempScale.C);
		this.scale = scale;
	}
	
	/**
	 * Gets the dew point of the instance with specified parameters
	 * @return Returns the dew point
	 */
	public double getDewPoint() {
		double fTRH; //function of F and RH
		double ret; //return value in Celsius
		fTRH = A * temp / (B + temp) + Math.log(humidity);
		ret = B * fTRH / (A - fTRH);
		return TempScale.convert(ret, TempScale.C, scale);
	}
	
	public String scaleName() {
		return scale.toString();
	}
}
