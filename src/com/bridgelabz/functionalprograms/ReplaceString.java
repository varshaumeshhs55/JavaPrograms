//User Input and Replace String Template �Hello <<UserName>>, How are you?�
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
		String str="Hello <<UserName>>,How are you??";
		System.out.println("enter uname");
		String uname=sc1.next();
		fu.replaceString(str,uname);
		
	}

}
