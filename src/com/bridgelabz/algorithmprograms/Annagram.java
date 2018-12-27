/******************************************************************************
 *  Compilation:  javac -d bin Annagram.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.Annagram
 *  
 *  Purpose: Determines whether two strings are anagram.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class Annagram {
	/*
	* The main function is written to take input from the user and and 
	* call the annagram function that checks anagram of two strings
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au=new AlgorithmUtility();
		@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in); 
		//Reading input two input strings from user
		System.out.println("enter 1st string");
		String str1=sc1.next();
		System.out.println("enter 2st string");
		String str2=sc1.next();
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		boolean b=au.annagram(str1,str2);
		if(b)
		{
			System.out.println("the two string is an algorithm");
		}
		else
				
	        System.out.println("the two string is not an algorithm");
	}

}


	
	
	

		
	