/*
 * PayrollStatement.java
 * Homework 1 - Assignment Statements
 * Assignment 3: Exercise 2.11
 * Print out a payroll statement using both
 * console and JOptionPane dialog boxes.
 */

package Chapter2;

import java.util.Scanner;		// Program uses Scanner object
import javax.swing.JOptionPane;	// Program uses JOptionPane


public class PayrollStatement {

	// main method begins execution of Java application
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Gets the input from the keyboard
		String employeeName;        // Employee's name
		String federalOutput;		// String version of rate
		String stateOutput;			// String version of rate
		String userInput;			// String to collect user input multiple times
		
		int    hoursWorkedInAWeek;	// Number of hours worked in a week
		double payRate;				// Rate of pay per hour
		double grossPay;			// Total pay before deductions
		double netPay;				// Total pay after deductions
		double federalTaxRate;		// Percentage rate for federal taxes
		double stateTaxRate;		// Percentage rate for state taxes
		double federalDeductions;	// The amount deducted for federal
		double stateDeductions;		// The amount deducted for state
		
		
		// Console Application: Have user enter thier name and assign it to employeeName
		System.out.print( "Enter employee's name: " );
		employeeName = scanner.next();
		
		// Ask for total hous worked in a week and assign it to hoursWorkedInAWeek
		System.out.print( "Enter total hours worked in a week: " );
		hoursWorkedInAWeek = scanner.nextInt();		
		
		// Ask for pay rate and assign it to payRate
		System.out.print( "Enter hourly pay rate: " );
		payRate = scanner.nextDouble();		
		
		// Ask for federal tax withholding rate and assign it to federalTaxRate
		System.out.print( "Enter the federal tax withholding rate: ");
		federalTaxRate = scanner.nextDouble();
		
		// Ask for state tax withholding rate and assign it to stateTaxRate
		System.out.print( "Enter the state tax withholding rate: ");
		stateTaxRate = scanner.nextDouble();
		
		// Calculate to get total gross pay before deductions
		grossPay = hoursWorkedInAWeek * payRate;
		
		// Calculate federal tax deduction and state tax deduction
		federalDeductions = ( grossPay * federalTaxRate );
		stateDeductions = ( grossPay * stateTaxRate );
		
		// Calucaute net pay after deductions
		netPay = grossPay - federalDeductions - stateDeductions;
		
		// Convert federal and state rates into percentages for output
		federalOutput = ( federalTaxRate * 100 ) + "%";
		stateOutput = ( stateTaxRate * 100 ) + "%";
		
		// Output the payroll statement of the employee to the console
		System.out.println( "Employee Name: " + employeeName );
		System.out.println( "Hours Worked: " + hoursWorkedInAWeek );
		System.out.println( "Pay Rate: " + payRate );
		System.out.println( "Gross Pay: $" + Math.round( grossPay * 100.0 ) / 100.0 );
		System.out.println( "Deductions");
		System.out.println( "\tFederal Withholding (" + federalOutput + ") $" + Math.round( federalDeductions * 100.0 ) / 100.0 );
		System.out.println( "\tState Withholding (" + stateOutput + ") $" + Math.round( stateDeductions * 100.0 ) / 100.0 );
		System.out.println( "\tTotal Deductions: $" + Math.round( ( federalDeductions + stateDeductions ) * 100.0 ) / 100.0 );
		System.out.println( "Net Pay: $" + Math.round( netPay * 100.0 ) / 100.0 );
		
	
		scanner.close();	// Close the Scanner object
		
		
		// JOptionPane Dialog Application: Using dialog boxes for input and output for payroll statement
		// Prompt user for the employee name and assign it to employeeName
		employeeName  = JOptionPane.showInputDialog( "Enter employee's name: " );
		
		// Prompt user for total hours worked in a week - parse string to int type and assign it to hoursWorkedInAWeek
		userInput = JOptionPane.showInputDialog( "Enter total hours worked in a week: " );
		hoursWorkedInAWeek = Integer.parseInt( userInput );
		
		// Prompt user for pay rate - parse string to double type and assign it to payRate
		userInput = JOptionPane.showInputDialog( "Enter hourly pay rate: " );
		payRate = Double.parseDouble( userInput );
		
		// Prompt user for the federal tax withholding rate - parse to double type and assign to federalTaxRate
		userInput = JOptionPane.showInputDialog( "Enter the federal tax withholding rate: " );
		federalTaxRate = Double.parseDouble( userInput );
		
		// Prompt user for the state tax withholding rate - parse to double type and assign to stateTaxRate
		userInput = JOptionPane.showInputDialog( "Enter the state tax withholding rate: " );
		stateTaxRate = Double.parseDouble( userInput );	
		
		// Calculate to get total gross pay before deductions
		grossPay = hoursWorkedInAWeek * payRate;
		
		// Calculate federal tax deduction and state tax deduction
		federalDeductions = ( grossPay * federalTaxRate );
		stateDeductions = ( grossPay * stateTaxRate );
		
		// Calucaute net pay after deductions
		netPay = grossPay - federalDeductions - stateDeductions;
		
		// Convert federal and state rates into percentages for output
		federalOutput = ( federalTaxRate * 100 ) + "%";
		stateOutput = ( stateTaxRate * 100 ) + "%";
		
		// Output the employee payroll statement in a JOptionPane Message Dialog box
		JOptionPane.showMessageDialog( null, "Employee Name: " + employeeName + "\n" +
											 "Hours Worked: " + hoursWorkedInAWeek + "\n" +
											 "Pay Rate: " + payRate + "\n" +
											 "Gross Pay: $" + grossPay + "\n" +
											 "Deductions" + "\n" +
											 "\t   Federal Withholding (" + federalOutput + ") $" + Math.round( federalDeductions * 100.0 ) / 100.0 + "\n" +
											 "\t   State Withholding (" + stateOutput + ") $" + Math.round( stateDeductions * 100.0 ) / 100.0 + "\n" +
											 "\t   Total Deductions: $" + Math.round( ( federalDeductions + stateDeductions ) * 100.0 ) / 100.0 + "\n" +
											 "Net Pay: $" + Math.round( netPay * 100.0 ) / 100.0 + "\n" 
											 , employeeName + "'s Payroll Statement", JOptionPane.PLAIN_MESSAGE);
		
		
		System.exit(0);		// Exit the Application
		
		
	} // end method main

} // end class PayrollStatement
