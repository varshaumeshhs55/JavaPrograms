
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
		String i = args[0];
		String j = args[1];
		String k = args[2];

		int date = Integer.parseInt(i);

		int month = Integer.parseInt(j);

		int year = Integer.parseInt(k);
		AlgorithmUtility.dayOfWeek(date, month, year);

	}

}
