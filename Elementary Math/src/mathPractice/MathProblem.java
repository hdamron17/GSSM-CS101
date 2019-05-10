package mathPractice;
/**
 * Helps students practice math
 * @author Hunter Damron
 * //MathProblem.java
 * //Honor Code: I did not lie, cheat, or steal
 */
import java.util.Random;

public class MathProblem {
	private int operand1, operand2;
	private Operation op;
	private int level;
	private int answer;
	private String message;
	Random gen;

	/**
	 * Constructs a new MathProblem from level 
	 * and operation (as String)
	 * @param level Difficulty of problem (easy, medium, or hard)
	 * @param operation Math operation to be practiced
	 */
	public MathProblem(String level, String operation) {
		op = Operation.parseOp(operation);
		init(level, op);
	}
	
	/**
	 * Constructs a new MathProblem from level 
	 * and operation (as Operation)
	 * @param level
	 * @param operation
	 */
	public MathProblem(String level, Operation operation) {
		op = operation;
		init(level, operation);
	}
	
	/**
	 * Finishes the construction of object 
	 * 		after Operation has been settled
	 * //Included to reduce amount of redundant code
	 * @param level Level as string
	 * @param operation Operation as Operation
	 */
	private void init(String level, Operation operation) {
		int intermediateOperand = 0;
		try {
			level = level.toLowerCase();
		} catch (Exception e) {
			level = "easy"; //sets to easy by default
		}
		switch(level) {
		case "hard":
			this.level = 2; break;
		case "medium":
			this.level = 1; break;
		case "easy":
		default:
			this.level = 0;
		}
		gen = new Random();
		if(op == Operation.DIVIDE) {
			do {
				operand2 = gen.nextInt(9 * (int)Math.pow(10, (double)this.level))
						+ (int)Math.pow(10, (double)this.level);
			} while(operand2 == 0);
			intermediateOperand = gen.nextInt(9 * (int)Math.pow(10, (double)this.level))
					+ (int)Math.pow(10, (double)this.level);
			operand1 = operand2 * intermediateOperand;
		} else {
			operand1 = gen.nextInt(9 * (int)Math.pow(10, (double)this.level))
					+ (int)Math.pow(10, (double)this.level);
			operand2 = gen.nextInt(9 * (int)Math.pow(10, (double)this.level))
					+ (int)Math.pow(10, (double)this.level);
		}
		if(op == Operation.SUBTRACT && operand1 < operand2) {
			intermediateOperand = operand2;
			operand2 = operand1;
			operand1 = intermediateOperand;
		}
		switch(op) {
		case SUBTRACT:
			answer = operand1 - operand2; break;
		case MULTIPLY:
			answer = operand1 * operand2; break;
		case DIVIDE:
			answer = operand1 / operand2; break;
		case ADD: //ADD by default
		default:
			answer = operand1 + operand2; break;
		}
		message = "Not answered yet";
	}
	
	/**
	 * Gets the problem as a string
	 * @return Returns the math problem
	 */
	public String getProblem() {
		return "" + operand1 + " " + op + " " + operand2 + " = ?";
	}

	/**
	 * Compares the user's guess to the right answer
	 * @param guess User's guess
	 * @return Returns true if the user's guess is correct
	 */
	public Boolean evaluate(int guess) {
		Boolean right = guess == answer;
		int messageNum = gen.nextInt(4);
		if(right) {
			switch(messageNum) {
			case 0: message = "You got it right!"; break;
			case 1: message = "Congratulations. Keep it up!"; break;
			case 2: message = "Good answer! You're learning."; break;
			case 3: message = "You are a genius! That's right.";
			}
		} else {
			switch(messageNum) {
			case 0: message = "I'm sorry. That's incorrect."; break;
			case 1: message = "Better luck next time."; break;
			case 2: message = "That is not right, but you can do this."; break;
			case 3: message = "That's not quite right, but you'll get there.";
			}
		}
		return right;
	}

	/**
	 * Gets a randomly generated message depending on the status of the question
	 * @return Returns a message of encouragement for the user
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Overrides toString() to get question with answer
	 * @return Returns the problem with answer
	 */
	public String toString() {
		return "" + operand1 + " " + op + " " + operand2 + " = " + answer;
	}
}
