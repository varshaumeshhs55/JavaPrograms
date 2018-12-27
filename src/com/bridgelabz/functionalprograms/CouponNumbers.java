/******************************************************************************
 *  Compilation:  javac -d bin CouponNumbers.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.CouponNumber 
 *  
 *  Purpose: Generates distinct coupon number and number of 
 *  		 random number required to get distinct coupon numbers
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class CouponNumbers {
	
 public static void main(String[] args) {
	 /*
		* The main function is written to take input from the user and
		* calls collect function that generates distinct coupon
		*  numbers
		*/
	 FunctionalUtility fu=new FunctionalUtility();
	 Scanner sc1=new Scanner(System.in);
     System.out.println("enter the distinct coupon number");
   //Reading input number from the user
     int n=sc1.nextInt();
 	//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
     int count =fu.collect(n);
     System.out.println("count is "+count);
	
}
}
