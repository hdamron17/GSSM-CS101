import java.util.Scanner;
public class TestconvertToCommon {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("\u9371 Enter string to be converted: ");
		String toBeConverted = stdin.nextLine();
		toBeConverted = MiscMethod.convertToCommon(toBeConverted);
		System.out.println("It has been converted to \"" + toBeConverted + "\"");
		stdin.close();
	}
}
