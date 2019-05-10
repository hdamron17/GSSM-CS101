import java.util.Scanner;
public class TestingStringCompare {
	public static void main(String[] args) {
		String tester = "Kamchatka";
		String input;
		int cmp;
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter comparison string: ");
		input = stdin.next();
		cmp = tester.compareTo(input);
		System.out.println("Comparison value: " + cmp);
		cmp = tester.compareToIgnoreCase(input);
		System.out.println("Comparison value: " + cmp);
		stdin.close();
	}
}
