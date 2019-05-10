package grades;

import java.util.Scanner;

public class GradeSummarizer {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many grades are we adding together?");
		int numOfGrades = input.nextInt();
		int[] grade = new int[numOfGrades];
		double gradeSum = 0;
		for(int count = 0; count < numOfGrades; count++) {
			System.out.print("Enter grade #" + (count + 1) + ": ");
			grade[count] = input.nextInt();
			gradeSum += grade[count];
		}
		input.close();
	}
}
