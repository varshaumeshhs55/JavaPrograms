/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnna.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeAnna n
 *  
 *  Purpose: �> 2D Array the numbers that are Anagram and numbers that are not 
 *  			Anagram
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   05-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeAnna {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 that anagram and not anagram
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> li1 = new ArrayList<List<Integer>>();
		List<Integer> li2 = new ArrayList<Integer>();
		List<Integer> li3 = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		//Method 1- using function of DataStructureUtility class of
				//com.bridgelabz.util package
		li3 = DataStructureUtility.primeN(0, 1000);
		System.out.println("Total number of prime numbers are :" + li3.size());
		//Method 2- using DataStructureUtility class of
				//com.bridgelabz.util package
		set = DataStructureUtility.primeAnagram(li3);
		li2.addAll(set);
		li1.add(li2);
		for (int i = 0; i < li2.size(); i++) {
			if (li3.contains(li2.get(i))) {
				li3.remove(li2.get(i));
			}
		}
		li1.add(li3);
		//Method 3- using DataStructureUtility class of
				//com.bridgelabz.util package
		DataStructureUtility.printPrimeAndAnagram(li1);
	}
}
