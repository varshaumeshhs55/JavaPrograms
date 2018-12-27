
/******************************************************************************
 *  Compilation:  javac -d bin PrimeNumber.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.PrimeNumbers
 *  
 *  Purpose: Finds the prime numbers in the given range
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class PrimeNumber {
	/*
	* The main function is written to take input from the user and
	* call the primeNumber() function that finds prime numbers
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		//Reading inputs from user
		System.out.println("enter the prime number");
		int num=sc1.nextInt();
		//Method 1- using static function of AlgorithmUtility class of
				//com.bridgelabz.util package
		au.primeNumber(num);

	}

}
