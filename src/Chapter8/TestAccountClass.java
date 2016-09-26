/**
 * TestAccountClass.java
 * Homework 6: Objects and Classes
 * Exercise 8.7 - Account Object
 * 
 */
package Chapter8;

import java.util.Date;

public class TestAccountClass {
	
	public static void main(String[] args) {
		
		// create an account
		Account a1 = new Account(1122, 20000.00);
		Account.setAnnaualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		
		// print out balance, monthly interest rate, and date created
		System.out.println("Balance: "+a1.getBalance());
		System.out.println("Monthly Interest Rate: "+a1.getMonthlyInterestRate());
		System.out.println("Date created: "+a1.getDateCreated());
		
		
	} // end method main

} // end class TesctAccountClass

class Account {
	
	/** VARIABLES */
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	
	/** CONSTRUCTOR */
	public Account() {
		dateCreated = new Date();
	}
	
	/** CONSTRUCTOR */
	public Account(int id, double balance) {
		
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	/** getters and setters */
	public int getId() {return this.id;}
	
	public void setID(int id) {this.id = id;}
	
	public double getBalance() {return this.balance;}
	
	public void setBalance(double balance) {this.balance = balance;}
	
	public static double getAnnaualInterestRate() {return annualInterestRate;}
	
	public static void setAnnaualInterestRate(double air) {annualInterestRate = air;}
	
	public Date getDateCreated() {return this.dateCreated; }
	
	
	/** Class Methods */
	public double getMonthlyInterestRate() {
		
		double mir = 0;
		
		mir = annualInterestRate / 12;
		
		return mir;
		
	} // end method getMonthlyInterestRate
	
	public void withdraw(double funds) {
		
		this.balance -= funds;
		
	} // end method withdraw
	
	public void deposit(double funds) {
		
		this.balance += funds;
		
	} // end method withdraw
	
	
	
	
	
	
	
	
	
	
	
} // end class Account