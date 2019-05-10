package mathPractice;
/**
 * Value of operation for use in MathProblem
 * @author Hunter Damron
 * //Operation.java
 * //Honor Code: I did not lie, cheat, or steal
 */
public enum Operation {
	ADD("+"), SUBTRACT("-"), MULTIPLY("x"), DIVIDE("/");
	
	private String symbol;
	
	/**
	 * Private constructor to associate symbol
	 * @param symbol Mathematical symbol of operation
	 */
	private Operation(String symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Returns symbol
	 */
	public String toString() {
		return symbol;
	}
	
	/**
	 * Parses the operation name or symbol to Operation
	 * @param name Name or symbol of operation
	 * @return Returns operation as Operation
	 */
	public static Operation parseOp(String name) {
		Operation ret;
		try {
			name = name.toLowerCase();
		} catch (Exception e) {
			name = "+"; //Sets to addition by default
		}
		switch(name) {
		case "subtraction (-)":
			ret = Operation.SUBTRACT; break;
		case "multiplication (x)":
			ret = Operation.MULTIPLY; break;
		case "division (/)":
			ret = Operation.DIVIDE; break;
		case "addition (+)": 
		default:
			ret = Operation.ADD; //Goes to addition by default
		}
		return ret;
	}
} 
