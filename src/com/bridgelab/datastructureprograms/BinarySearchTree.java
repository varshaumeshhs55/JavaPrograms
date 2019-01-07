
/******************************************************************************
 *  Compilation:  javac -d bin BinarySearchTree.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.BinarySearchTree n
 *  
 *  Purpose: �> You are given N nodes, each having unique value ranging
 *  			from [1, N], how many different binary search tree can be created 
 *  			using all of them.
 *
 *  @author Varsha Umesh
 *  @version 1.0
 *  @since   04-01-2019
 *
 ******************************************************************************/package com.bridgelab.datastructureprograms;

import java.util.ArrayList;

import com.bridgelabz.util.BinaryS;
import com.bridgelabz.util.DataStructureUtility;

public class BinarySearchTree {
	/*
	* The main function is written to take input from the user
	* and to find how many binary search trees can be formed
	* from the entered number of nodes
	*/
	public static void main (String[] args) 
	{ 
	    int count1, count2;
	  
	    // find count of BST and  
	    // binary trees with n nodes 
	    System.out.println("enter the number of elements");
	    int num=DataStructureUtility.readInteger();
	    int arr[]=new int[num];
	    for(int i=0;i<arr.length;i++)
	    {
	    	
	    	arr[i]=DataStructureUtility.readInteger();
	    }
	    double[] count=new double[arr.length];
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	//Method 1- using function of Utility class of
			//com.bridgelabz.util package
	    count[i]= BinaryS.countBST(arr[i]); 
	  
	  
	    // print count of BST and  
	    // binary trees with n nodes 
	    System.out.println("Count of BST with nodes is \n" + count[i]);  
	    		                               
	                                   
	    
	} 
	} }
	  