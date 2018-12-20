package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
	    System.out.println("enter x");
        int x=sc1.nextInt();
        System.out.println("enter y");
        int y=sc1.nextInt();
        fu.distance(x,y);
	}

}
