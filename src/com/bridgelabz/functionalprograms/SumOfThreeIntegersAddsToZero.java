
/******************************************************************************
 *  Compilation:  javac -d bin SumOfThreeIntegersAddsToZero.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.SumOfThreeIntegersAddsToZero
 *  
 *  Purpose: A program with cubic running time. Read in N integers and counts the
			 number of triples that sum to exactly 0.
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOfThreeIntegersAddsToZero {
	/*
	* The main function is written to take input from the user and
	* call sumOfThreeInt function that counts the 
	* number of triples that sum to exactly 0.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int num=sc1.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
        	System.out.println("enter the arr"+i);
        	arr[i]=sc1.nextInt();
        }
        int n=arr.length;

		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
        fu.sumOfThreeInt(arr,n);
	}

}
