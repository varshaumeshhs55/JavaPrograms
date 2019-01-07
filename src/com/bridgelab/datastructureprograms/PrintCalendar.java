
/******************************************************************************
 *  Compilation:  javac -d bin PrintCalendar.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.PrintCalendar n
 *  
 *  Purpose: �> Takes the month and year as command�line arguments and 
 *  			prints the Calendar of the month.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   05-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.util.DataStructureUtility;

public class PrintCalendar {
	/*
	* The main function is written to take input from the user
	* and print the calendar
	*/
	   

	     public static void main(String[] args) {
	     Scanner scan = new Scanner (System.in);

	     //Prompt the user to enter year
	     System.out.print("Enter full year (e.g., 2001): ");
	     int year = scan.nextInt();

	     // Prompt the user to enter month
	     System.out.print("Enter month in number between 1 and 12: ");
	     int month = scan.nextInt();

	     // Print calendar for the month of the year
	      if (month < 1 || month > 12 || year < 1700)
	       System.out.println("Wrong input!");
	       else
	          DataStructureUtility.printMonth(year, month);

	   }

		
		}

