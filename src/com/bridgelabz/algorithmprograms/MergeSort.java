
/******************************************************************************
 *  Compilation:  javac -d bin MergeSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MergeSort
 *  
 *  Purpose: Sorts the array using the merge sort algorithm
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class MergeSort {
	/*
	 * The main function is written to take input from the user and call mergeSort
	 * functions that sorts the given array.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Merge sort");
		int i;

		System.out.println("Enter the size of your array");
		int n = sc.nextInt();
		String arr[] = new String[n];
		System.out.println("Enter the elements");

		for (i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		AlgorithmUtility.mergeSort(arr, 0, n);
		System.out.println("Elements after sorting");
		for (i = 0; i < n; i++) {
			System.out.println(arr[i] + "");
		}

		sc.close();
	}

	// TODO Auto-generated method stub

}
