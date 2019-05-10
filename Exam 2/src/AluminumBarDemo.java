import javax.swing.JOptionPane;

public class AluminumBarDemo {

    public static void main(String [] args) {

	String value;
	value = JOptionPane.showInputDialog("Enter length of the bar: ");
	double length = Double.parseDouble(value);
	value = JOptionPane.showInputDialog ("Enter side of the bar: ");
	double side = Double.parseDouble(value);

	AluminumBar b = new AluminumBar (length, side);

	JOptionPane.showMessageDialog(null, "volume: " + b.getVolume());	
	JOptionPane.showMessageDialog (null, "surface area: " + b.getSurfaceArea());

	value = JOptionPane.showInputDialog ("How much longer " + "should the bar be? ");  
	double addition = Double.parseDouble(value);
		b.addToLength(addition);
		JOptionPane.showMessageDialog (null, "length: " + b.getLength());
	JOptionPane.showMessageDialog (null, "volume: " + b.getVolume());	
	JOptionPane.showMessageDialog (null, "surface area: " + b.getSurfaceArea());
      }
   }
