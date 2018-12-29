
/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MonthlyPayment 
 *  
 *  Purpose: Determines monthly payment for the given principle amount,
 *  		 years to pay off and percentage rate of the interest amount.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {
	/*
	 * The main function is written to take input from the user and call the
	 * monthlyPayment() function calculates monthly payment
	 */

	public static void main(String[] args) {
		String i = args[0];
		String j = args[1];
		String k = args[2];

		double p = Integer.parseInt(i);

		double r = Integer.parseInt(j);

		double y = Integer.parseInt(k);
		AlgorithmUtility.monthlyPayment(p, r, y);
		
	}

}
