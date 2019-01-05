package com.bridgelabz.algorithmprograms;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;

public class AnnagramPalindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Method 1- using static function of AlgorithmUtility class of
        //com.bridgelabz.util package
        System.out.println("The prime numbers between 0-1000 are");
        int num=AlgorithmUtility.readInteger();//storing the value to ref variable
        List<String> primeList=new ArrayList<>();//declaration
        primeList=(List<String>) AlgorithmUtility.findPrime(num);//method call

        //Method 2- using static function of AlgorithmUtility class of
        //com.bridgelabz.util package
        Set<String> primeAnagramSet=new HashSet<>();//declaration
        System.out.println("The prime numbers which are anagrams are");
        primeAnagramSet=AlgorithmUtility.primeAnagram(primeList);//method call

        //Method 3- using static function of AlgorithmUtility class of
        //com.bridgelabz.util package
        Set<Integer> primePalindromeSet=new HashSet<>();//Set declaration
        System.out.println("The prime numbers which palindrome are");
        primePalindromeSet=AlgorithmUtility.primePalindrome(primeList);//method call
        System.out.println(primePalindromeSet);

    }
	}

