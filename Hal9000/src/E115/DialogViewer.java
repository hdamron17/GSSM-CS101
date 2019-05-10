/**
 * DialogViewer.java
 * Hunter Damron
 * Honor Code: I did this work myself
 * Purpose: Asks for the user's name and welcomes that user
 */

package E115;

import javax.swing.JOptionPane;

public class DialogViewer
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, " + name + ".\nI'm Hal. Nice to Meet you.");
	}
}
