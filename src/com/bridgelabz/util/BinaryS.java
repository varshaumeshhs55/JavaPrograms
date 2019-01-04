package com.bridgelabz.util;

public class BinaryS {  
	
	      
	// A function to find  
	// factorial of a given number 
	
	  
	static int binomialCoeff(int n, 
	                         int k) 
	{ 
	    int res = 1; 
	  
	    // Since C(n, k) = C(n, n-k) 
	    if (k > n - k) 
	        k = n - k; 
	  
	    // Calculate value of  
	    // [n*(n-1)*---*(n-k+1)] /  
	    // [k*(k-1)*---*1] 
	    for (int i = 0; i < k; ++i) 
	    { 
	        res *= (n - i); 
	        res /= (i + 1); 
	    } 
	  
	    return res; 
	} 
	  
	  
	// A Binomial coefficient  
	// based function to find  
	// nth catalan number in  
	// O(n) time 
	static int catalan( int n) 
	{ 
	      
	    // Calculate value of 2nCn 
	    int c = binomialCoeff(2 * n, n); 
	  
	    // return 2nCn/(n+1) 
	    return c / (n + 1); 
	} 
	  
	// A function to count number of 
	// BST with n nodes using catalan 
	public static int countBST( int n) 
	
	{ 
	    // find nth catalan number 
	    int count = catalan(n); 
	  
	    // return nth catalan number 
	    return count; 
	} 
}
	// A function to count number 
	// of binary trees with n nodes  
	