package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Permutation {

	FunctionalUtility fu=new FunctionalUtility();
    Scanner s = new Scanner(System.in);
    System.out.println("enter a string");
    String str = s.next();
    int l=str.length();
    fu.permut(str,l);
}
