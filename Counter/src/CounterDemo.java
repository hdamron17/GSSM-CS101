/*
 * CounterDemo.java
 * Hunter Damron
 * Honor Code: I didn't cheat
 * Purpose: Utilizes the Counter class to make a counter capable of clicking, 
 * 		undoing, reseting, and displaying the counter's value
 */

import javax.swing.JOptionPane;

public class CounterDemo {
	public static void main(String[] args) {
		Counter click = new Counter();
		String input = "junk";
		while(!(input.matches("quit"))) {
			if(input.matches("")) {
				click.click();
			}
			if(input.matches("reset")) {
				click.reset();
			}
			if(input.matches("undo")) {
				click.undo();
			}
			if(input.matches("-h")) {
			JOptionPane.showMessageDialog(null, "This program is used as a basic counter.\n"
					+ "Commands are:\n\"quit\" to end the program\n"
					+ "\"undo\" to undo the last click\n"
					+ "\"reset\" to set the counter back to zero\n"
					+ "and \"-h\" to show this message dialog");	
			}			
			input=JOptionPane.showInputDialog("Counter reads " + click.getValue() + 
					"\nPress enter to coninue. (-h for help dialog and list of commands)");
		}
	}
}
