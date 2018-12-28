
/******************************************************************************
 *  Compilation:  javac -d bin Array2D.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.Array2D 
 *  
 *  Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from
 *  		 standard input and printing them out to standard output.
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Array2D {
	
	/*
	* The main function is written to take input from the user and
	* call displayArray function that displays array of any type
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner s = new Scanner(System.in);
	 
	    System.out.print("Enter no of rows: m");
	    int  m= s.nextInt();
	    System.out.print("Enter no of columns: n");
	    int n = s.nextInt();
	    System.out.print("1:Integer 2:Double 3:boolean");
	    int c = s.nextInt();
	  
	    switch(c)
	    {
	    case 1:Integer[][] array=new Integer[m][n];
	    System.out.println("varsha");
	           for(int i=0;i<m;i++) {
	        	   for(int j=0;j<n;j++)
	        	   {
	        		   array[i][j]=s.nextInt();
	        	   }
	           }
	      
	           fu.displayArray(array);
	           break;
	           
	    case 2:Double[][] Darray=new Double[m][n];
        for(int i=0;i<m;i++) {
     	   for(int j=0;j<n;j++)
     	   {
     		   Darray[i][j]=s.nextDouble();
     	   }
        }
        fu.displayArray(Darray);
        break;      
	           
	    case 3:Boolean[][] Barray=new Boolean[m][n];
        for(int i=0;i<m;i++) {
     	   for(int j=0;j<n;j++)
     	   {
     		   Barray[i][j]=s.nextBoolean();
     	   }
        }
        fu.displayArray(Barray);
        break;    
        
        default:
        	System.out.println("please select the choice");
        	break;
	           
	    }

	}

}
