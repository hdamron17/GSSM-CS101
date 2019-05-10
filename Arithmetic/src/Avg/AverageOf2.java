/*
 * Still non functional -> hangs at line 21 (nextInt into s)
 */

package Avg;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AverageOf2
{
	public static void main(String[] args) {
		int n, s, total;
		Scanner stdIn = new Scanner(System.in), second = new Scanner(System.in);
		System.out.print("How many integers do you plan to average? ");
		n = stdIn.nextInt();
		if(n >= 1) {
			total = 0;
			System.out.print("Which integers? ");
			for (double countdown = n; countdown == 0; countdown = countdown - 1) {
				s = second.nextInt();
				total = total + s;
				System.out.println("countdown reads: " + countdown);
				countdown--;
			}
			double avg = total / n;
			JOptionPane.showMessageDialog(null, "The average is " + avg);
		}
		else {
			System.out.println("Invalid number of integers");
		}
		stdIn.close(); second.close();
	}
}
