package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOfThreeIntegersAddsToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int num=sc1.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
        	System.out.println("enter the arr"+i);
        	arr[i]=sc1.nextInt();
        }
        int n=arr.length;
        fu.sumOfThreeInt(arr,n);
	}

}
