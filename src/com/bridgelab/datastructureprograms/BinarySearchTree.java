package com.bridgelab.datastructureprograms;

import java.util.ArrayList;

import com.bridgelabz.util.BinaryS;
import com.bridgelabz.util.DataStructureUtility;

public class BinarySearchTree {
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
	    count[i]= BinaryS.countBST(arr[i]); 
	  
	  
	    // print count of BST and  
	    // binary trees with n nodes 
	    System.out.println("Count of BST with nodes is \n" + count[i]);  
	    		                               
	                                   
	    
	} 
	} }
	  