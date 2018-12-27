
/******************************************************************************
 *  Compilation:  javac -d bin PrimeFactors.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.PrimeFactors 
 *  
 *  Purpose: Computes the prime factorization of N using brute force
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PrimeFactors {

	/*
	* The main function is written to take input from the user and
	* call primeFactors function that computes the prime factors.
	*/

	public static void main(String[] args) {
		
		// TODO Auto-generated method 

		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc1.nextInt();

		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		fu.primeFactors(n);
		
		

	}

}
