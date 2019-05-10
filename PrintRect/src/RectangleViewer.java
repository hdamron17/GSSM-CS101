/**
 * RectangleViewer.java
 * Hunter Damron
 * Honor Code: Cheat I did not
 * Purpose: Prints the rectangles formed by PrintRectangle.java
 * 		with a JFrame
 */

import javax.swing.JFrame;
import javax.swing.JComponent;

public class RectangleViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("3 Random Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent component = new PrintRectangle();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
