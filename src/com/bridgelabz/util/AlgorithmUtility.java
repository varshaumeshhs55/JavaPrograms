package com.bridgelabz.util;

import java.util.Arrays;

public class AlgorithmUtility {
	
public boolean annagram(String str1,String str2)
{
	
	if(str1.length()!=str2.length())
	{
		return false;
	
	}
	else
	{   char[] ch1=str1.toLowerCase(
			).toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	
	
		for(int i=0;i<str1.length();i++)
		{
			if(ch1[i]!=ch2[i])
			    return false; 
	}
		return true;
		
	
	
	}
}
}


