package com.bridgelab.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;

public class BalancedParenthesis {
	
    public static void main(String[] args) {

        //DataStructureUtility sc=new DataStructureUtility();
        System.out.println("enter the string ");
        String exp1=DataStructureUtility.readString();
       
        char[] exp = exp1.toCharArray();
         
   
       
         if (Stack.ParenthesisBalanced(exp))
           System.out.println("Balanced ");
         else
           System.out.println("Not Balanced ");  
   }

}

