import java.util.Scanner;

public class TestCapitalize {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String in;
		System.out.print("Enter your string to be capitalized: ");
		in = stdin.nextLine();
		in = MiscMethod.capitalizeAll(in);
		System.out.println("The return is \"" + in + "\"");
	}
}
