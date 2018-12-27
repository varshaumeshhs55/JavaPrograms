
/******************************************************************************
 *  Compilation:  javac -d bin QuadraticEquation.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.Quadratic 
 *  
 *  Purpose: To find the roots of the equation a*x*x + b*x + c.
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class QuadraticEquation {
	/*
	* The main function is written to take input from the user and
	* call quadraticEquation function that find roots of the equation.
	*/
	public static void main(String[] args) {
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner s = new Scanner(System.in);
	  //Reading the inputs from the user
	    System.out.println("Given quadratic equation:ax^x + bx + c");
	    System.out.print("Enter a:");
	    int  a = s.nextInt();
	    System.out.print("Enter b:");
	    int b = s.nextInt();
	    System.out.print("Enter c:");
	    int c = s.nextInt();
	  //Method 1- using non-static function of FunctionalUtilty class
	  		//of com.bridgelabz.util package
	    fu.quadraticEquation(a,b,c);
		  
		
	}

}
