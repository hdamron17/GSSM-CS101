package TestPractice;

import java.util.Random;
import java.awt.Rectangle;
import java.util.Scanner;

public class RandomRect {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The x value for the center is: ");
		int centerx = input.nextInt(10) + 1;
		System.out.print("The y value for the center is: ");
		int centery = input.nextInt(10) + 1;
		Random rand = new Random();
		int width = rand.nextInt(10) + 1;
		int height = rand.nextInt(10) + 1;
		System.out.println("width: " + width);
		System.out.println("height: " + height);
		double topx = width / 2;
		System.out.println("half of width: " + topx);
		topx = centerx - topx;
		double topy = height / 2;
		System.out.println("Half of height: " + topy);
		topy = centery - topy;
		System.out.println("The rectangle is " + width + " x "+ height);
		Rectangle rect = new Rectangle();
		rect.setRect(topx, topy, width, height);
		System.out.println(rect);
		input.close();
	}
}
