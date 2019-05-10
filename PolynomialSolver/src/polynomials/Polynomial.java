package polynomials;
/**
 * 
 */
import java.util.Arrays;
import java.util.Stack;

public class Polynomial {
	private int[][] condensedPolynomial; //zero order is coefficient; first order is power
	private int[] polynomial; //includes all zeros but no powers
	//private int degree;

	/**
	 * @deprecated
	 * Constructs polynomial from degree and polynomial
	 * @param degree Degree of polynomial
	 * @param condensedPolynomial in form {{a, b}, {c, d}} for cx^d + ax^b 
	 * where last term has greatest degree
	 */
	public Polynomial(int degree, int[][] condensedPolynomial) {
		polynomial = new int[degree + 1];
		this.condensedPolynomial = condensedPolynomial;
		int count = 0;
		polynomial = new int[degree + 1];
		while(count < condensedPolynomial.length) {
			polynomial[condensedPolynomial[count][1]] = condensedPolynomial[count][0];
			count++;
		}
	}

	public Polynomial(int[][] condensedPolynomial) {
		int degree = condensedPolynomial[condensedPolynomial.length - 1][1];
		polynomial = new int[degree + 1];
		this.condensedPolynomial = condensedPolynomial;
		int count = 0;
		polynomial = new int[degree + 1];
		while(count < condensedPolynomial.length) {
			polynomial[condensedPolynomial[count][1]] = condensedPolynomial[count][0];
			count++;
		}
	}

	public String toString() {
		String ret;
		int count = condensedPolynomial.length - 1;
		ret = "" + condensedPolynomial[count][0] + "x^" + condensedPolynomial[count][1];
		count--;
		while(count >= 0) {
			ret += " + " + condensedPolynomial[count][0] + "x^" + condensedPolynomial[count][1];
			count--;
		}
		return ret;		
	}

	public String getFullPolynomial() {
		String ret;
		int count = polynomial.length - 1;
		ret = "" + polynomial[count] + "x^" + count;
		count--;
		while(count >= 0) {
			ret += " + " + polynomial[count] + "x^" + count;
			count--;
		}
		return ret;		
	}

	public double[] getRoots() {
		int p, q, factor, dividend;
		int[] qArray;
		double possibleRoot;
		Stack<Integer> pFactors, qFactors;
		Stack<Double> possibleFactors;
		q = polynomial[polynomial.length - 1];
		p = polynomial[0];
		factor = 1;
		pFactors = new Stack<Integer>();
		while(factor <= p) {
			if(p % factor == 0) {
//System.out.println("Flag 3; factor = " + factor + "; p = " + p);
				pFactors.push(factor);
				pFactors.push(-factor);
			}
			factor++;
		}
		factor = 1;
		qFactors = new Stack<Integer>();
		while(factor <= q) {
			if(q % factor == 0) {
				qFactors.push(factor);
				qFactors.push(-factor);
			}
			factor++;
		}
		possibleFactors = new Stack<Double>();
		qArray = toIntArray(qFactors);
		while(!pFactors.isEmpty()) {
			dividend = pFactors.pop();
			for(int divisor : qArray) {
				possibleRoot = (double)dividend / divisor;
//System.out.println("possibleRoot = " + possibleRoot);
				if(possibleFactors.search(possibleRoot) == -1) {
//System.out.println(possibleRoot + " passed the gate");
					possibleFactors.push(possibleRoot);
				}
			}
		}
//System.out.println("Flag 1");
		Stack<Double> roots = new Stack<Double>();
		double doubleFactor = 0;
		double partialQuotient, outPartialQuotient;
		while(!possibleFactors.isEmpty()) {
//System.out.println("Flag 2; next pop: " + possibleFactors.peek());
			doubleFactor = (possibleFactors.pop()).doubleValue();
//System.out.println("Flag 4; factor = " + factor);
			partialQuotient = 0;
			outPartialQuotient = 0;
			for(double partialDividend : Arrays.copyOfRange(polynomial, 0, polynomial.length - 1)) {
				partialQuotient = (partialQuotient - partialDividend) / doubleFactor;
//System.out.println("Flag 5; factor = " + doubleFactor + "; patialQuotient (" + partialQuotient + ") == (" + polynomial[polynomial.length - 1] + ")");
			outPartialQuotient = partialQuotient;
			}
//System.out.println("factor = " + doubleFactor + "; partialQuotient = " + partialQuotient + "; outPartialQuotient = " + outPartialQuotient);
			if(outPartialQuotient == polynomial[polynomial.length - 1]) {
				roots.push(doubleFactor);
			}
//System.out.println("Should start testing now; does " + factor + " work? " + (partialQuotient == polynomial[polynomial.length - 1]));		
			/*
			if(partialQuotient == polynomial[polynomial.length - 1]) {
				roots.push(factor);
//System.out.println("YAY! PUSHING " + factor + " INTO roots");
			}
			*/
		}

		double[] rootArray = new double[roots.size()];
		int counter = 0;
		while(!roots.empty()) {
			rootArray[counter] = roots.pop();
			counter++;
		}
		return rootArray;
	}

	private int[] toIntArray(Stack<Integer> stack) {
		int[] intArray = new int[stack.size()];
		int count = 0;
		while(!stack.isEmpty()) {
			intArray[count] = stack.pop();
			count++;
		}
		return intArray;
	}

	@SuppressWarnings("unused")
	private double[] toDoubleArray(Stack<Double> stack) {
		double[] intArray = new double[stack.size()];
		int count = 0;
		while(!stack.isEmpty()) {
			intArray[count] = stack.pop();
			count++;
		}
		return intArray;
	}
}
