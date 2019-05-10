/**
 * PictureDemo.java
 * Hunter Damron
 * Honor Code: I ain't a cheater
 * Purpose: Creates picture based on user choice, then gives the user 
 * 		the option to make a border around the picture, scale down to 
 * 		half the size, or scale up to twice the size, respectively.
 */

import javax.swing.JOptionPane;

public class PictureDemo {	
	public static void main(String[] args) {
		String input; //Reads user input
		Picture queenmary = new Picture();
		/*
		 * Loads picture based on user input
		 */
		input = JOptionPane.showInputDialog(null, "Which picture would you like to load?\n"
				+ "'A' for NM.jpg\n'B' for queen-mary.png\nAny other option will default to B");
		if(input.matches("A")) {
			queenmary.load("NM.jpg"); 
		}
		else {
			queenmary.load("queen-mary.png");
		}
		/*
		 * Makes border around picture
		 */
		input = JOptionPane.showInputDialog("Would you like a border around your picture?");
		if(input.matches("yes")) {
			makeBorder(queenmary);
		}
		else {
			if(!(input.matches("no"))) {
			JOptionPane.showMessageDialog(null, "Are you dumb?! This is a yes or no question!\n"
					+ "Here it is without a border, idiot.");
			}
		}
		/*
		 * Scale picture down by 1/2
		 */
		input = JOptionPane.showInputDialog("Would you like to scale your picture to one half its size?");
		if(input.matches("yes")) {
			makeHalf(queenmary);
		} 
		else {
			if(!(input.matches("no"))) {
			JOptionPane.showMessageDialog(null, "Mamma always said \"Stupid is as stupid does.\""
					+ " So you must be stupid or something. It is yes or no.");
			}
		}
		/*
		 * Scales picture up by 2
		 */
		input = JOptionPane.showInputDialog("Would you like to scale your picture to one twice its size?");
		if(input.matches("42")) {
			JOptionPane.showMessageDialog(null, "What is the answer to the ultimate question of life,"
					+ " the universe, and everything?");
		}
		if(input.matches("yes")) {
			makeTwice(queenmary);
		} 
		else {
			if(!(input.matches("no"))) {
			JOptionPane.showMessageDialog(null, "My vocabulary is very limited. I understand yes, no, and 42.");
			}
		}
	}
	
	public static void  makeBorder(Picture pic) {
		
		int width = pic.getWidth();
		width = width - 30;
		int height = pic.getHeight();
		height = height - 30;
		pic.scale(width, height);
		pic.move(15, 15);
		pic.border(10);
	}
	
	public static void makeHalf(Picture pic) {
		
		int width = pic.getWidth();
		int topx = width / 4;
		width = width / 2;
		int height = pic.getHeight();
		int topy = height / 4;
		height = height / 2;
		pic.scale(width, height);
		pic.move(topx, topy);
	}
	
	public static void makeTwice(Picture pic) {
		
		int width = pic.getWidth();
		int topx = -1 * width / 4;
		width = width * 2;
		int height = pic.getHeight();
		int topy = -1 * height / 4;
		height = height * 2;
		pic.move(topx, topy);
		pic.scale(width, height);
	}
}