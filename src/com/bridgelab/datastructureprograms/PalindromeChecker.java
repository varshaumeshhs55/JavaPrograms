
/******************************************************************************
 *  Compilation:  javac -d bin PalindromeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprogram.PalindromeChecker n
 *  
 *  Purpose: �> A palindrome is a string that reads the same forward and backward.
 *  		 	To construct an algorithm to input a string of characters and 
 *  			check whether it is a palindrome.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   04-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Deque;

public class PalindromeChecker {
	/*
	* The main function is to read the input from the user
	* and checking whether the entered string is palindrome 
	* or not
	*/
	public static void main(String[] args) {
        Deque deque=new Deque(100);
      System.out.println("enter the String to check Palindrome­ or not ");
      String string=DataStructureUtility.readString();
      for(int i=0;i<string.length();i++)
        {
            char c =string.charAt(i);
          //Method 1- using function of Deque class of
			//com.bridgelabz.util package
            deque.addRear(c);
        }
        int flag=0; 
      //Method 2- using function of Deque class of
      		//com.bridgelabz.util package
        while(deque.size()>1)
        {
        	//Method 3- using function of Deque class of
			//com.bridgelabz.util package
			
			//Method 4- using function of Deque class of
			//com.bridgelabz.util package
            if(deque.removeFront()!=deque.removeRear())
            {
                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
}


}

