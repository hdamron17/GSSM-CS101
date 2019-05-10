/**
 * Countdown.java
 * Hunter Damron
 * Honor code: I did this work myself
 * Purpose: print a countdown from user entered starting point
 * @author hdamron17
**/
import java.util.Scanner;

public class Countdown {

	public static void main(String[] args)
	{
		int startPos; //starting point for countdown
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter countdown staring point: ");
		startPos = stdIn.nextInt();
		int i = startPos;
		while(i>0)
		{
			System.out.println(i + "...");
			i--;
		}
		System.out.println("Lift off!");
		
		stdIn.close();
	} // end main
} // end class Countdown


/* Expected Output (input = 7)
 * Enter countdown staring point: 7
 * 7...
 * 6...
 * 5...
 * 4...
 * 3...
 * 2...
 * 1...
 * Lift off!
*/