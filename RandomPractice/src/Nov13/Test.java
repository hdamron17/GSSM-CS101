package Nov13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//gradePointSummary();
		//System.out.println(factorial(5));
		//displayFibonacci(6);
		//System.out.println("GCD = " + gcd(16, 12));
		//displayTriangleA(5);
		//displayTriangleB(4);
		//displayTriangleC(6);
		//displayTriangleC(5);
	}

	static void displayTriangleA(int n) {
		String out = ""; int m;
		for(int count = 1; count <= n; count++) {
			for(m = 1; m <= count; m++) {
				out += "* ";
			}
			out += "\n";
		}
		System.out.print(out);
	}

	static void displayTriangleB(int n) {
		String out = ""; int m;
		for(int count = n; count >= 1; count--) {
			for(m = count; m >= 1; m--) {
				out += "* ";
			}
			out += "\n";
		}
		System.out.print(out);
	}

	static void displayTriangleC(int n) {
		displayTriangleA((n + 1) / 2);
		displayTriangleB(n / 2);
	}

	static void gradePointSummary() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many grades are we adding together? ");
		int numOfGrades = input.nextInt();
		int count = 0;
		double high = 0, low = 100, gradeSum = 0, grade;
		for(; count < numOfGrades; count++) {
			System.out.println("Enter grade #" + (count + 1) + ": ");
			grade = input.nextDouble();
			gradeSum += grade;
			if(grade > high)
				high = grade;
			if(grade < low)
				low = grade;
		}
		System.out.println("high = " + high + "; low = " + low + "; sum = " + gradeSum + "; average = " + (gradeSum / numOfGrades));
		input.close();
	}
	
	static int factorial(int n) {
		int factorial = 1;
		for(; n > 1; n --) {
			factorial *= n;
		}
		return factorial;
	}
	
	static void displayFibonacci(int n) {
		int prev = 1, prevKeeper, fibNum = 1;
		for(int count = 3; count <= n; count++) {
			prevKeeper = fibNum;
			fibNum += prev;
			prev = prevKeeper;
		}
		if(n <= 0)
			fibNum = 0;
		System.out.println("Fibonacci Number " + n + " = " + fibNum);
	}
	
	public static int gcd(int x, int y) {
		int remainder = 1;
		while(remainder != 0) {
			remainder  = x % y;
			if(remainder == 0)
				return y;
			x = y;
			y = remainder;
		}
		return 1;
	}
}

