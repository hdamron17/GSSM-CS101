package System;

import java.io.File;

public class BitRAMTester {
	public static void main(String[] args) {
		String name = "test.txt";
		File file = getRAMFile(name);
		RAM ram = new RAM(file);
		
System.out.println("ram size = " + ram.getSize());
		
		for(int index = 0; index < ram.getSize(); index++) {
System.out.print(ram.getBit(index));
		}
System.out.println();
System.out.println("\n" + ram.getByte(1));
System.out.println(RAM.toBinary((byte) -42));
	}
	
	private static File getRAMFile(String name) {
		ClassLoader loader = BitRAMTester.class.getClassLoader();
		File file = new File(loader.getResource(name).getFile());		
		return file;
	}
}

