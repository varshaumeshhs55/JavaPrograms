
/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramOnQueue.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeAnagramOnQueue n
 *  
 *  Purpose: �> Add the Prime Numbers that are Anagram in the Range of 0 � 1000 
 *  			in a Queue using the Linked List and Print the Anagrams from 
 *  			the Queue.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   05-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.CustQueue;
import com.bridgelabz.util.DataStructureUtility;

public class PrimeAnagramOnQueue {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using queue
	*/
	
	public static void main(String[] args) {
		//Customized Queue
		CustQueue q=new CustQueue(1000);
	    List<Integer> list2 = new ArrayList<Integer>();
		
	    //Method 1- using function of DataStructureUtility class of
		//com.bridgelabz.util package
	    list2 = DataStructureUtility.primeN(0,1000); //finding prime
	  //Method 2- using function of DataStructureUtility class of
		//com.bridgelabz.util package
	    q=DataStructureUtility.AnagramPrime(list2); //finding anagram
//	    System.out.println(stack.size()+" is the size of the stack");
	    System.out.println("Printing the elements in reverse order using remove function of queue ");
	  //Method 3- using function of Queue class of
		//com.bridgelabz.util package
	    while(!q.isEmpty())
	    {
	        System.out.println(q.remove()+" "+q.remove());
	    }
	}
	}




