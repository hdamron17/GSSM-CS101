package Dec6;

public class BigIntegerPractice {
	public static void main(String[] args) {
		byte a = 7, b = 4;
		System.out.println("a =\t" + Integer.toBinaryString(a) + "b\nb =\t" + Integer.toBinaryString(b) + "b\nOr:\t" + Integer.toBinaryString(a | b) + "b\nAnd:\t" + Integer.toBinaryString(a & b) + "b\nXor:\t" + Integer.toBinaryString(a ^ b) + "b");
		int i = 0x32;
		char c = (char) i;
		System.out.println("Char " + Integer.toHexString(i) + " : " + c + "\n");
		for(int f = 0; f < 256; f++) {
			c = (char) f;
			System.out.println("Char " + Integer.toHexString(f) + " : " + c + "\nint : " + Integer.toBinaryString(f) + "b ; char : " + Integer.toBinaryString((byte) c));
		}
	}
}
