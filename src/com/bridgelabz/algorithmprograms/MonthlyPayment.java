
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
		Scanner sc1 = new Scanner(System.in);

		System.out.println("enter principal loan ammount");
		double p = sc1.nextDouble();
		System.out.println("enter percent compound interest");
		double r = sc1.nextDouble();
		System.out.println("enter years to pay off");

		double y = sc1.nextDouble();
		AlgorithmUtility.monthlyPayment(p, r, y);
		sc1.close();
	}

}
