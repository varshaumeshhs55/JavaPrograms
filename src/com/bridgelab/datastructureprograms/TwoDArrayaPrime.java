
/******************************************************************************
 *  Compilation:  javac -d bin TwoDArrayaPrime .java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.TwoDArrayaPrime  n
 *  
 *  Purpose: �> Store the prime numbers in a 2D Array, the first dimension 
 *  represents the range 0�100,100�200, and so on. While the second dimension 
 *  represents the prime numbers in that range
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

public class TwoDArrayaPrime {

	public static void main(String[] args) {
		/*
		* The main function is to print the 2 dimension representation
		* of the prime numbers from 0-1000
		*/
		// TODO Auto-generated method stub
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		List<Integer> li1 = new ArrayList<Integer>();
		int a = 0;
		int b = 100;
		for (int i = 0; i < 10; i++) {
			//Method 1- using function of DataStructureUtility class of
			//com.bridgelabz.util package
//			System.out.println("the prime number between " + a + "and" + b + "are");
			li1 = DataStructureUtility.primeN(a, b);
//			System.out.println(li1);
			li.add(li1);
			a += 100;
			b += 100;
		}
		List<Integer> onlyprime= new ArrayList<Integer>();
		for(int i=0;i<li.size();i++)
		{onlyprime=li.get(i);
		for(int j=0;j<onlyprime.size();j++)
		{
			System.out.print(onlyprime.get(j)+" ");
		}
		System.out.println();
		}
	}

}
