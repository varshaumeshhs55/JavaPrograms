package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		System.out.println("enter the no of elements ");
		int n=sc1.nextInt();
		String str[]=new String[n];
		for( int i=0;i<str.length;i++){
			System.out.println("Enter a string to put at position " + i + " of the array: ");
	        str[i]=sc1.next();
		}
	    String str1[]=au.insertionSort(str, n);
		for(int i=0;i<str.length;i++)
		{
			System.out.println("the sorted element is:"+str[i]);
				
			
		}
	       
	       
	        }
		
			
		}

	


