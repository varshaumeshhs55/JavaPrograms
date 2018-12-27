
/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.VendingMachine
 *  
 *  Purpose: To find the fewest notes to be returned to the vending machine
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine {
	/*
	* The main function is written to take input from the user and
	* call the calculate function that finds the fewest notes 
	* to be returned to the vending machine
	*/
	public static void main(String[] args) {
		
	
	   AlgorithmUtility au=new AlgorithmUtility();
       System.out.println("enter the money to be drawed");
       Scanner sc=new Scanner(System.in);
     //Reading the input from the user
       int money=sc.nextInt();
       int[] notes = { 2000,500,100,50,10,5,2,1};
       System.out.println("the remaining change should be given to customer is ");
     //Method 1- using static function of AlgorithmUtility class of
     		//com.bridgelabz.util package
       au.calculate(money, notes);
       
       
   

}
}

