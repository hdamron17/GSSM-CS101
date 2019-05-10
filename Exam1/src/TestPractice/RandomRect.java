package TestPractice;

import java.util.Random;
import java.awt.Rectangle;

public class RandomRect {
	public static void main(String[] args) {
		Random rand = new Random();
		int width = rand.nextInt(51) + 10;
		int height = rand.nextInt(51) + 10;
		int topx = 100 - width / 2;
		int topy = 100 - height / 2;
		Rectangle rect = new Rectangle(topx, topy, width, height);
		System.out.println("The rectangle is " + rect.getWidth() + " x " + rect.getHeight() + ", with the top lef corner at (" + rect.getX() + ", " + rect.getY() + ")");
		System.out.println("The center is at (" + rect.getCenterX() + ", " + rect.getCenterY() + ")");
	}
}