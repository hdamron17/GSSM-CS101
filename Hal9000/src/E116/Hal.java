package E116;

import javax.swing.JOptionPane;

public class Hal
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showInputDialog("Hello, " + name + ". My name is Hal. What would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm Sorry, " + name + " I'm afraid I can't let you do that.");
	}
}
