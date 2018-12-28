/******************************************************************************
 *  Compilation:  javac -d bin ReplaceString.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.ReplaceString 
 *  
 *  Purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?”
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;



public class ReplaceString {
	/*
	* The main function is written to take input from the user and
	* call replaceString function that replaces the template with user
	* input
	*/
	public static void main(String[] args)
	{
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
		String str="Hello <<UserName>>,How are you??";
		System.out.println("enter uname");
		String uname=sc1.next();
		{
			if(uname.length()<3)
			{
				System.out.println("enter a name greater than 3 alphabet");
		}
			

		//Method 1- using non-static function of FunctionalUtilty class
				//of com.bridgelabz.util package
		String message=FunctionalUtility.replaceString(str,uname);
		System.out.println(message);
		
		}
	}
}



