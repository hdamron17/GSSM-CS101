package polynomials;
/**
 * 
 */
import java.util.Stack;
import javax.swing.JOptionPane;

public class PolynomialSolver {
	public static void main(String[] args) {
		int[][] polynomial;
		Polynomial poly;
		String stringPoly;
		stringPoly = JOptionPane.showInputDialog("Enter a polynomial "
				+ "in form Ax^B + Cx^D + -Ex^F where powers decrease from B.");
System.out.println("Polynomial = " + stringPoly);
		polynomial = parsePolynomial(stringPoly);
		poly = new Polynomial(polynomial);
System.out.println("Polynomial within class = " + poly);
System.out.println("Number of Rational Roots: " + poly.getRoots().length);
		System.out.print("Rational roots:");
		for(double root : poly.getRoots()) {
			System.out.print(" " + root + ";");
		}
		System.out.println();
		
	}
	
	//Form: 2x^0 + 5x^2 + -4x^3
	static int[][] parsePolynomial(String stringPoly) {
		String stringCoeff = "", stringPower = "";
		String workingChar;
		int coeff, power, counter = 0; //0 for coefficient, 1 for power
		int[][] ret; //
		boolean coeffSign = true, //true for positive, false for negative
				toCoeff = true; //true goes to coefficient, false goes to power
		Stack<Integer> polyStack = new Stack<Integer>(); //coefficient in first; then power
		stringPoly = stringPoly.trim();
		while(counter < stringPoly.length()) {
			workingChar = stringPoly.substring(counter, counter + 1);
			switch(workingChar) {
			case " ": 
				break;
			case "x": 
			case "^": 
				toCoeff = false;
				break;
			case "+":
				coeff = Integer.parseInt(stringCoeff);
				power = Integer.parseInt(stringPower);
				if(!coeffSign) {
					coeff = -coeff;
				}
//System.out.println("power = " + power + "; coeff = " + coeff);
				polyStack.push(power);
				polyStack.push(coeff);
				stringCoeff = "";
				stringPower = "";
				toCoeff = true;
				coeffSign = true;
				break;
			case "-":
				toCoeff = true;
				coeffSign = false;
				break;
			default:
				if(toCoeff) {
					stringCoeff += workingChar;
				} else {
					stringPower += workingChar;
				}
			}
			counter++;
		}
		coeff = Integer.parseInt(stringCoeff);
		if(!coeffSign) {
			coeff = -coeff;
		}
		power = Integer.parseInt(stringPower);
//System.out.println("power = " + power + "; coeff = " + coeff);
		polyStack.push(power);
		polyStack.push(coeff);
		ret = new int[polyStack.size() / 2][2];
		counter = 0;
		while(counter <= polyStack.size() + 1) {
			ret[counter][0] = polyStack.pop();
			ret[counter][1] = polyStack.pop();
			counter++;
		}
		return ret;
	}
}
