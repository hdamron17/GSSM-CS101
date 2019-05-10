package System;
import java.io.File;
import java.io.IOException;
import java.util.BitSet;
import java.util.Scanner;

public class RAM {
	private BitSet bitRAM;

	public RAM(File ram) {
		char[] term;
		String stringRAM = "";
		try (Scanner stdin = new Scanner(ram)) {
			while(stdin.hasNext()) {
				term = stdin.next().toCharArray();
				for(char bit : term) {
					if(bit == '1') {
						stringRAM += "1";
					}
					if(bit == '0') {
						stringRAM += "0";
					}
				}
			}
			term = stringRAM.toCharArray();

			System.out.println("stringRAM size = " + stringRAM.length() + "\nterm size = " + term.length);

			bitRAM = new BitSet(term.length);
			for(int index = 0; index < term.length; index++) {
				if(term[index] == '1')
					bitRAM.set(index);
				else
					bitRAM.clear(index);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public RAM(int size) {
		bitRAM = new BitSet(size);
	}

	public int getSize() {
		return bitRAM.size();
	}

	public boolean getBoolean(int index) {
		return bitRAM.get(index);
	}

	public byte getBit(int index) {
		boolean bit = bitRAM.get(index);
		if(bit == true)
			return 1;
		else
			return 0;
	}

	public byte getByte(int index) {
		int begin = (index / 8) * 8;
		byte[] ret = bitRAM.toByteArray();
		return ret[index / 8];
		/*
		for(int bit = 0; bit < 8; bit++) {
			if(bitRAM.get(begin + bit))
System.out.println("Bit " + (begin + bit) + " is set");
				ret += Math.pow(2, 8 - bit);
		}

		return ret;
		 */
	}

	public static String toBinary(byte term) {
		return Integer.toBinaryString(term & 0xFF);
	}
}
