
/******************************************************************************
 *  Compilation:  javac -d bin BalancedParenthesis .java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.BalancedParenthesis  n
 *  
 *  Purpose: ­> Take an Arithmetic Expression such as
 *  (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
 *  performance of operations. Ensure parentheses must appear in a balanced
 *  fashion.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/package com.bridgelab.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;

public class BalancedParenthesis {
	
    public static void main(String[] args) {
    	/*
    	* The main function is written to take input from the user and and 
    	* call the isBalanced function that checks if the parantheses of 
    	* the entered arithmetic expression
    	*/
        //DataStructureUtility sc=new DataStructureUtility();
        System.out.println("enter the string ");
        String exp1=DataStructureUtility.readString();
       
        char[] exp = exp1.toCharArray();
         
      //Method 1- using static function of Utility class of
      		//com.bridgelabz.util package
       
         if (Stack.ParenthesisBalanced(exp))
           System.out.println("Balanced ");
         else
           System.out.println("Not Balanced ");  
   }

}

