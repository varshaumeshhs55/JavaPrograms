package com.bridgelab.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.util.DataStructureUtility;

public class PrintCalendar {

	     /** Main method */

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

