
/******************************************************************************
 *  Compilation:  javac -d bin DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.DayOfWeek
 *  
 *  Purpose: Finds the day of the week for the given date.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class DayOfWeek {
	/*
	 * The main function is written to take input from the user and and call the
	 * dayOfWeek function that returns the integer representation of the week
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);

		System.out.println("enter the date");
		int date = sc1.nextInt();
		System.out.println("enter the month");
		int month = sc1.nextInt();
		System.out.println("enter the year");
		int year = sc1.nextInt();

		AlgorithmUtility.dayOfWeek(date, month, year);

	}

}
