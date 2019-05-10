package dewPoint;
/**
 * Tests the DewPoint class to calculate dew point 
 * 		from temperature and relative humidity
 * @author Hunter Damron; Partner: Nikki
 * //DewPointDemo.java
 * //Honor code: I did not lie, cheat, or steal
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class DewPointDemo {
	/**
	 * Begins program execution
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		double humidity, temp;
		TempScale scale;
		DewPoint dew;
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter relative humidity, temperature, "
				+ "and scale separated by spaces: ");
		humidity = Double.parseDouble(stdIn.next());
		temp = Double.parseDouble(stdIn.next());
		scale = TempScale.parseTempScale(stdIn.next());
		/*
		 * If statement for the case that user inputs dew point as a percent
		 * rather than a decimal
		 */
		if(humidity > 1) {
			humidity /= 100; 
		}
		dew = new DewPoint(humidity, temp, scale);
		System.out.println("Dew Point is " 
				+ fmt.format(dew.getDewPoint()) + dew.scaleName());
		stdIn.close();
	}
}
