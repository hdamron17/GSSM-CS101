/**
 * BankAcount.java
 * Hunter Damron
 * Honor Code: I did this myself
 * Purpose: Emulates a bank account with methods to deposit, withdraw, and return the balance
 */
public class BankAccount {
	
	/**
	 * Instance variables
	 */
	private double balance = 0;
	
	/**
	 * Constructors
	 */
	public BankAccount() {
		balance = 0;
	}
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	/**
	 * Deposits specified amount into account
	 * @param amount
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	/**
	 * Withdraws specified amount into account
	 * @param amount
	 */
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	/**
	 * Returns the value of the balance
	 * @return the account balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Adds interest to the current balance; rate is put in as a percent
	 */
	public void addInterest(double rate) {
		double multiplier;
		multiplier = (100 + rate) / 100;
		balance = balance * multiplier;
	}
}
