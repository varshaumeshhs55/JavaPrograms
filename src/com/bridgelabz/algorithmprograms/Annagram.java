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
	 * The main function is written to take input from the user and and call the
	 * annagram function that checks anagram of two strings
	 */
	public static void main(String[] args) {
		System.out.println("enter the first string");
        String s1=AlgorithmUtility.readString();
        System.out.println("enter the second string");
        String s2=AlgorithmUtility.readString();
        boolean b=AlgorithmUtility.annagrams(s1,s2);//function is called to check the conditions
        if(b)
        {
            System.out.println("Strings are anagrams");
        }
        else
            System.out.println("Strings are not anagrams");


	
}
}