package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class CouponNumbers {
 public static void main(String[] args) {
	 
	 FunctionalUtility fu=new FunctionalUtility();
	 Scanner sc1=new Scanner(System.in);
     System.out.println("enter the distinct coupon number");
     int n=sc1.nextInt();
     int count =fu.collect(n);
     System.out.println("count is "+count);
	
}
}
