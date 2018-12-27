
/******************************************************************************
 *  Compilation:  javac -d bin Utility .java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.Utility 
 *  
 *  Purpose: Search and Sorted the given list and print elapsed time
 *  		 performance in descending order
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.FunctionalUtility;

public class Utility {
	/*
	* The main function is written to take input from the user and
	* call the following functions that sorts the given array:
	* 	(i)binary search method for integers
	* 	(ii)binary search method for strings
	* 	(iii)insertion Sort method for integers
	* 	(iv)insertion Sort method for strings
	* 	(v)bubble sort method for integers
	* 	(vi)bubble sort method for strings
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au = new AlgorithmUtility();
		Scanner s = new Scanner(System.in);
		System.out.println("1:binary search for integer");
		System.out.println("2:binary search for string");
		System.out.println("3:insertion sort for integer");
		System.out.println("4:insertion sort for string");
		System.out.println("5:bubble sort for integer");
		System.out.println("6:bubble sort for string");
		int c = s.nextInt();
		//Reading the choice of the user
		switch (c) {
		case 1:
			
			System.out.println("enter the no of elements");
			int n = s.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter a integer to put at position " + i + " of the array: ");
				arr[i] = s.nextInt();
			}
			System.out.println("enter the search element");
			int x = s.nextInt();
			long start_time1=System.nanoTime();
			//Method 1- using static function of AlgorithmUtility class
			//of com.bridgelabz.util package
			int result = au.binarySearch(arr, 0, n - 1, x);
			long stop_time1=System.nanoTime();

			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at index " + result);
			long elapsed_time1=stop_time1-start_time1;
			System.out.println("elapsed time is:"+elapsed_time1);
			break;

		 case 2:
	        {
	            System.out.println("enter the string length");
	            int len=s.nextInt();
	            String str[]= new String[len];
	            for(int i=0;i<len;i++)
	            {
	            	  System.out.println("enter the string element ");
	                  str[i]=s.next();
	            }
	            System.out.println("enter the key string");
	            String key=s.next();
	            String[] str2=au.sort1(str);
	            for(int i=0;i<str2.length;i++) {
	            	System.out.println(str2[i]);
	            }
	            long start_time2=System.nanoTime();
	          //Method 2- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
	            int res=au.binarySearchStr(str2, key);
	            long stop_time2=System.nanoTime();

	            if(res==-1)
	                System.out.println("the element not found");
	            else
	                System.out.println("the element is in the index"+res);
	            long elapsed_time2=stop_time2-start_time2;
				System.out.println("elapsed time is:"+elapsed_time2);
	            break;
	        }

		 case 3:
		   
			 System.out.println("enter the no of elements ");
				int nu=s.nextInt();
				String str[]=new String[nu];
				for( int i=0;i<str.length;i++){
					System.out.println("Enter a string to put at position " + i + " of the array: ");
			        str[i]=s.next();
				}
				long start_time3=System.nanoTime();
				//Method 3- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
			    String str1[]=au.insertionSort(str, nu);
			    long stop_time3=System.nanoTime();
			    
				for(int i=0;i<str.length;i++)
				{
					System.out.println("the searched element is:"+str[i]);
						
					
				}
				 long elapsed_time3=stop_time3-start_time3;
					System.out.println("elapsed time is:"+elapsed_time3);
		 case 4:
			 System.out.println("enter the no of elements ");
				int b=s.nextInt();
				int a[]=new int[b];
				for( int i=0;i<a.length;i++){
					System.out.println("Enter a integer to put at position " + i + " of the array: ");
			        a[i]=s.nextInt();
				}
				long start_time4=System.nanoTime();
				//Method 4- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
			    int ar1[]=au.insertionSortInteger(a);
			    long stop_time4=System.nanoTime();
				for(int i=0;i<a.length;i++)
				{
					System.out.println("the searched element is:"+a[i]);
						
					
				}
				long elapsed_time4=stop_time4-start_time4;
				System.out.println("elapsed time is:"+elapsed_time4);
				
				
				
		 case 5:
			 System.out.println("How many numbers you want to insert");
             int n1=s.nextInt();
             System.out.println("Enter the integer numbers for the array");
             int[] array=new int[n1];
             int i;
             for( i=0;i<n1;i++)
                 array[i]=s.nextInt();  
             System.out.println("the original array is:");
             for(i=0;i<n1;i++) {
                 System.out.println(array[i]);
             }long start_Time5=System.nanoTime();
           //Method 5- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
             int array2[]=au.bubbleSortInteger(array);
             long stop_Time5=System.nanoTime();
             System.out.println("Sorted array list is:");
             for(i=0;i<n1;i++)
                 System.out.println(array[i]);                    
             long elapsed_Time5=stop_Time5-start_Time5;
             System.out.println("the elapsed time is "+elapsed_Time5);
             
		 case 6:      
		     System.out.println("How many String you want to insert");
             int n2=s.nextInt();
             System.out.println("Enter the Strings ");
             String[] str3=new String[n2];
           
             for(int j=0;j<n2;j++)
             str3[j]=s.next();  
             System.out.println("the original array is:");
             for(i=0;i<n2;i++) {
             System.out.println(str3[i]);}
             long start_Time6=System.nanoTime();
           //Method 6- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
             au.bubbleSortString(str3);
             long stop_Time6=System.nanoTime();
             System.out.println("Sorted array list is:");
             for(i=0;i<n2;i++)
                 System.out.println(str3[i]);
             long elapsed_Time6=stop_Time6-start_Time6;
             System.out.println("the elapsed time is "+elapsed_Time6);
         }}
         

		}

	

