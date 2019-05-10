import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pi {
	private static double pi = 3;
	private static long count = 0;
	private static boolean clicked = false;
	
	public static void main(String[] args) {
		JButton button1 = new JButton("Calculate");
		JLabel label = new JLabel("Precision count " + count + " : pi = " + pi);
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(label);
		frame.add(panel);
		
		class ButtonClick implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				label.setText("Precision count " + count + " : pi = " + pi);
			}
		}
		class WindowClose implements WindowListener {
			public void windowClosed(WindowEvent arg0) {
				clicked = true;
			}

			public void windowActivated(WindowEvent arg0) {}
			public void windowClosing(WindowEvent arg0) {}
			public void windowDeactivated(WindowEvent arg0) {}
			public void windowDeiconified(WindowEvent arg0) {}
			public void windowIconified(WindowEvent arg0) {}
			public void windowOpened(WindowEvent arg0) {}
			
		}
		
		button1.addActionListener(new ButtonClick());
		frame.addWindowListener(new WindowClose());

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(600, 100);
		frame.setTitle("Pi");
		frame.setVisible(true);
		
		for(count = 2; !clicked && count < Long.MAX_VALUE; count += 2) {
			pi += 4 * Math.pow(-1, count / 2 + 1) / (count * (count + 1) * (count + 2));
		}
	}
}