/**
 * BankAccountTester.java
 * Hunter Damron
 * Honor Code: This is mine. There are many like it but this one is mine. 
 * 		I did not use someone else's
 * Purpose: Tests BankAccount class by creating a BankAccount, depositing 
 * 		$1000, withdrawing $500, and withdrawing $400 more dollars
 */

import java.text.DecimalFormat;

public class BankAccountTester {
	public static void main(String[] args) {
		BankAccount myMoney = new BankAccount();
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		myMoney.deposit(1000);
		System.out.println("Your account has a balance of $" + fmt.format(myMoney.getBalance()));
		myMoney.withdraw(500);
		System.out.println("Your account has a balance of $" + fmt.format(myMoney.getBalance()));
		myMoney.withdraw(400);
		System.out.println("Your account has a balance of $" + fmt.format(myMoney.getBalance()));
		myMoney.addInterest(7);
		System.out.println("Your account has a balance of $" + fmt.format(myMoney.getBalance()));
		myMoney.addInterest(7);
		System.out.println("Your account has a balance of $" + fmt.format(myMoney.getBalance()));
		myMoney.addInterest(7);
		System.out.println("Your account has a balance of $" + fmt.format(myMoney.getBalance()));
		myMoney.addInterest(7);
	}
}
