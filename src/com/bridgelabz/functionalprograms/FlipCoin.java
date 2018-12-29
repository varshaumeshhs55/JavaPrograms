
/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.FlipCoin 
 *  
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class FlipCoin {
	/*
	* The main function is written to take input from the user and
	* calls flipCoin function that calculate head vs tail percenatage 
	* after flipping a coin n number of times
	*/
	public static void main(String[] args) 
	{int i=0;
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
	    do {
        System.out.println("enter the number of times to flip");
        int num=sc1.nextInt();
      //Method 1- using non-static function of FunctionalUtilty class
      		//of com.bridgelabz.util package
        fu.flipCoin(num);
        i++;
	}
while(i<=20);
	}
	    

}
