package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class SwapNibble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    AlgorithmUtility au=new AlgorithmUtility();
		    Scanner sc1=new Scanner(System.in); 
	        int flag=0;
	        System.out.println("enter the Value of n");
	        int a=sc1.nextInt();
	        int c=au.swapNibbles(a);
	        System.out.println(c);
	        int[] d=au.toNibbleBinary(c);
	        for(int j=7;j>=0;j--)
	        {
	            System.out.print(d[j]);
	        }

	        for (int i = 1; i < c; i++) {

	            if (Math.pow(2, i) == c)
	                flag =1;

	        }
	        if(flag==1)
	            System.out.println("number is power of 2");

	        else
	            System.out.println("number is not a power of 2");




	    }

	}


