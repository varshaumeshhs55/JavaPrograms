
/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.LeapYear 
 *  
 *  Purpose: Determines whether the given year is a leap year or not.
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;



public class LeapYear {
	/*
	* The main function is written to take input from the user and
	* call leapYear function that determines if a year is a leap 
	* year or not
	*/
	public static void main(String[] args)
	{ 
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
	    System.out.println("enter the year");
        int year=sc1.nextInt();
      //Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
        fu.leapYear(year);
        
		
	}

}

