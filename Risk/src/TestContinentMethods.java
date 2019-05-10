import java.util.Scanner;

public class TestContinentMethods {
	public static void main(String[] args) {
		Continent var;
		var = Continent.testMethod();
		System.out.println("run() returns " + var);
		for(Continent sec : Continent.values()) {
			System.out.println("getNumCountries() returns " + sec.getNumCountries());
		}
	}
}
