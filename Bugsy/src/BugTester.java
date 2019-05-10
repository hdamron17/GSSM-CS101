/**
 * BugTester.java
 * @author Hunter Damron
 * Honor Code: This work is mine and mine only
 * Purpose: tests Bug class
 */

import java.util.Random;

public class BugTester {
	public static void main(String[] args){
		Bug bugsy = new Bug(3);
		Random gen = new Random();
		int next, end = 20;
		System.out.println("Bugsy starts at " + bugsy.getPosition());
		while(end > 0) {
			next = gen.nextInt(5);
			if(next == 0){
				bugsy.turn();
				System.out.println("Bugsy made a turn at " + bugsy.getPosition());
			}
			else {
				bugsy.move();
				System.out.print(". ");
			}
			end--;
		}
		System.out.println("Bugsy ended at " + bugsy.getPosition());
	}
	
	public static void othermain(String[] args) { //Kept for simpler testing purposes only
		Bug bugsy = new Bug(3);
		System.out.println("Bugsy starts at " + bugsy.getPosition());
		bugsy.move();bugsy.move();bugsy.move();bugsy.move();bugsy.turn();
		bugsy.move();bugsy.move();bugsy.turn();bugsy.move();bugsy.move();
		System.out.println("Bugsy is now at " + bugsy.getPosition() + "; Should be at 7");
	}
}
