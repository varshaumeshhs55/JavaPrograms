package com.bridgelab.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.CustQueue;
import com.bridgelabz.util.DataStructureUtility;

public class PrimeAnagramOnQueue {
	
	public static void main(String[] args) {
		CustQueue q=new CustQueue(1000);
	    List<Integer> list2 = new ArrayList<Integer>();
	    list2 = DataStructureUtility.primeN(0,1000); //finding prime
	    q=DataStructureUtility.AnagramPrime(list2); //finding anagram
//	    System.out.println(stack.size()+" is the size of the stack");
	    System.out.println("Printing the elements in reverse order using remove function of queue ");
	    while(!q.isEmpty())
	    {
	        System.out.println(q.remove()+" "+q.remove());
	    }
	}
	}




