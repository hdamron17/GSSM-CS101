package trapezoidThoerem;
/**
 * Demos the TrapezoidRule class by getting the area under a curve
 * @author Hunter Damron
 * //TrapezoidDemo.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrapezoidDemo {
	/**
	 * Begins execution of application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0.###");
		TrapezoidRule trap;
		/*
		 * Panel used in the JOptionPane so three inputs can be 
		 * 		collected at once and so text fields can be formatted 
		 * 		to only accept numbers
		 */
		JPanel panel = new JPanel();
		NumberFormat numFmt = NumberFormat.getNumberInstance();
		JTextField aText = new JFormattedTextField(numFmt), 
				bText = new JFormattedTextField(numFmt), 
				cText = new JFormattedTextField(numFmt),
				beginningText = new JFormattedTextField(numFmt),
				endText = new JFormattedTextField(numFmt),
				intervalText = new JFormattedTextField(numFmt);
		long interval = 0;
		double a = 0, b = 0, c = 0, beginning = 0, end = 0;

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

		beginningText.setColumns(4);
		endText.setColumns(4);
		intervalText.setColumns(4);

		panel = new JPanel();
		panel.add(new JLabel("Find area under curve of interval: ["));
		panel.add(beginningText);
		panel.add(new JLabel(", "));
		panel.add(endText);
		panel.add(new JLabel("] with "));
		panel.add(intervalText);
		panel.add(new JLabel(" subintervals"));

		JOptionPane.showConfirmDialog(null, panel, "Interval", 
				JOptionPane.OK_CANCEL_OPTION);
		try {
			beginning = numFmt.parse(beginningText.getText()).doubleValue();
		} catch(Exception e) {
			beginning = 0; 
			System.err.println("Invalid double for start of interval set to 0");
		}
		try {
			end = numFmt.parse(endText.getText()).doubleValue();
		} catch(Exception e) {
			end = 0; 
			System.err.println("Invalid double for end of interval set to 0");
		}
		try {
			interval = numFmt.parse(intervalText.getText()).longValue();
		} catch(Exception e) {
			interval = 0; 
			System.err.println("Invalid long integer for number of intervals set to 0");
		}
		
		if(interval >= 1000000000)
			JOptionPane.showMessageDialog(null, "You asked for a LOT of subintervals. "
					+ "Prepare for a long wait!");
		
		trap = new TrapezoidRule(a, b, c, beginning, end, interval);
		JOptionPane.showMessageDialog(null, "Area is: " + 
				fmt.format(trap.findArea()));
	}
}

/**~Output~************************************************************************/
/*__a__|__b__|__c__|_beginning_|_end_|_intervals_|_estimated area_|_computed area_*/
/*  1  |  0  |  0  |    -2     |  2  |     4     |      6         |      6        */
/*  1  |  0  |  0  |    -2     |  2  |     8     |      5.5       |      5.5      */
/*  2  |  3  | -4  |    -1     |  2  |     6     |     -1.25      |     -1.25     */
/* -4  | -1  | -3  |    -2     |  2  |     4     |     -36        |     -36       */
/* 	42 |  0  |  0  |     0     |  10 |     10    |      14070     |      14070    */
/* -9  |  3  |  6  |    -4     | -1  |     3     |     -198       |     -198      */
/*  5  | -4  |  8  |     5     | -3  |     8     |      292       |      292      */
/* -3  |  8  | -9  |     6     |  7  |     10    |     -84.005    |     -84.005   */
/**********************************************************************************/