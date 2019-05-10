package graphics;

import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class GraphViewer {
	/**
	 * Begins application execution
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		quit: {
		JFrame frame = new JFrame();
		int width = 800, height = 600;
		GraphComponent graph;
		String[] choices = {"Axes", "Random Lines", "Polynomial Graph"};
		String stringChoice = "Axes";
		int choice;
		double a, b, c;
		NumberFormat numFmt = NumberFormat.getNumberInstance();
		JFormattedTextField aText, bText, cText;
		JPanel panel = new JPanel();

		frame.setSize(width + frame.getContentPane().getWidth(), 
				height + frame.getContentPane().getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stringChoice = (String)JOptionPane.showInputDialog(null, 
				"Would you like to draw axes, random lines, or a "
				+ "polynomial graph?", "Drawing Choice", 
				JOptionPane.QUESTION_MESSAGE, null, choices, stringChoice);
		if(stringChoice == null) {
			break quit;
		}
		switch(stringChoice) {
		case "Polynomial Graph":
			choice = 3; 
			break;
		case "Random Lines":
			choice = 1; break;
		case "Axes":
		default:
			choice = 2;
		}
		frame.setTitle(stringChoice);
		
		if(choice == 3) {
			aText = new JFormattedTextField(numFmt); 
			bText = new JFormattedTextField(numFmt);
			cText = new JFormattedTextField(numFmt);
			
			aText.setColumns(4);
			bText.setColumns(4);
			cText.setColumns(4);

			panel.add(new JLabel("Enter Quadratic Polynomial: "));
			panel.add(aText);
			panel.add(new JLabel("x^2 + "));
			panel.add(bText);
			panel.add(new JLabel("x + "));
			panel.add(cText);

			JOptionPane.showConfirmDialog(null, panel, "Enter Polynomial", 
					JOptionPane.OK_CANCEL_OPTION);
			try {
				a = numFmt.parse(aText.getText()).doubleValue();
			} catch(Exception e) {
				a = 0; System.err.println("Invalid double for A set to 0");
			}
			try {
				b = numFmt.parse(bText.getText()).doubleValue();
			} catch(Exception e) {
				b = 0; System.err.println("Invalid double for B set to 0");
			}
			try {
				c = numFmt.parse(cText.getText()).doubleValue();
			} catch(Exception e) {
				c = 0; System.err.println("Invalid double for C set to 0");
			}
			graph = new GraphComponent(3, a, b, c);
		} else {
			graph = new GraphComponent(choice);
		}
		
		frame.add(graph);
		frame.setVisible(true);
	}
	}
}
