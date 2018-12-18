//User Input and Replace String Template “Hello <<UserName>>, How are you?”
/*varsha
18/12/2018*/

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;



public class ReplaceString {
	public static void main(String[] args)
	{
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter username");
		String s1=sc1.next();
		fu.replaceString(s1);
		
	}

}
