
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
 ******************************************************************************/package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class MergeSort {
	/*
	* The main function is written to take input from the user and
	* call mergeSort functions that sorts the given array.
	*/

	public static void main(String[] args) {
	
		
		        
		        AlgorithmUtility au=new AlgorithmUtility();
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Merge sort");
		        int i;
		      //Reading input number of data to be entered into the array
		        System.out.println("Enter the size of your array");
		        int n=sc.nextInt();
		        String arr[]=new String[n];
		        System.out.println("Enter the elements");
		      //Reading input data 
		        for( i=0;i<n;i++)
		        {   
		            arr[i]=sc.next();
		        }
		      //Method 1- using static function of AlgorithmUtility class of
				//com.bridgelabz.util package
		        AlgorithmUtility.mergeSort(arr,0,n);
		        System.out.println("Elements after sorting");
		        for(i=0;i<n;i++)
		        {
		            System.out.println(arr[i]+"");
		        }

		    }

		
		// TODO Auto-generated method stub

	}


