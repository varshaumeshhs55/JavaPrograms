/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramOnStack.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.PrimeAnagramOnStack n
 *  
 *  Purpose: �> Add the Prime Numbers that are Anagram in the Range of 0 � 1000 in 
 *  			a Stack using the Linked List and Print the Anagrams in the 
 *  			Reverse Order.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   05-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.MyGenericsStack;
import com.bridgelabz.util.Stack;

public class PrimeAnagramOnStack {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using stack
	*/
	
		public static void main(String[] args) throws Exception {
			
		
		    MyGenericsStack stack=new  MyGenericsStack(1000);
		    List<Integer> list2 = new ArrayList<Integer>();
		    list2 = DataStructureUtility.primeN(0,1000); //finding prime
		    stack=DataStructureUtility.AnagramPrime1(list2); //finding anagram
//		    System.out.println(stack.size()+" is the size of the stack");
		    System.out.println("Printing the elements in reverse order using pop function of stack");
		    while(!stack.isStackEmpty())
		    {
		        System.out.println(stack.pop()+" "+stack.pop());
		    }
		}
		}


			



