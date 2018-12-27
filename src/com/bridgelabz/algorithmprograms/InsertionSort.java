/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.InsertionSort
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
import com.bridgelabz.util.FunctionalUtility;

public class InsertionSort {
	/*
	* The main function is written to take input from the user and calls 
	* the function insertionSort that sorts the array
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		//Reading inputs from the user
		System.out.println("enter the no of elements ");
		int n=sc1.nextInt();
		String str[]=new String[n];
		for( int i=0;i<str.length;i++){
			System.out.println("Enter a string to put at position " + i + " of the array: ");
	        str[i]=sc1.next();
		}
		//Method 1- using static function of AlgorithmUtility class of
				//com.bridgelabz.util package
	    String str1[]=au.insertionSort(str, n);
		for(int i=0;i<str.length;i++)
		{
			System.out.println("the searched element is:"+str[i]);
				
			
		}
	       
	       
	        }
		
			
		}

	


