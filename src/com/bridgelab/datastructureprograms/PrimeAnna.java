package com.bridgelab.datastructureprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeAnna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> li1 = new ArrayList<List<Integer>>();
		List<Integer> li2 = new ArrayList<Integer>();
		List<Integer> li3 = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		li3 = DataStructureUtility.primeN(0, 1000);
		System.out.println("Total number of prime numbers are :" + li3.size());
		set = DataStructureUtility.primeAnagram(li3);
		li2.addAll(set);
		li1.add(li2);
		for (int i = 0; i < li2.size(); i++) {
			if (li3.contains(li2.get(i))) {
				li3.remove(li2.get(i));
			}
		}
		li1.add(li3);
		DataStructureUtility.printPrimeAndAnagram(li1);
	}
}
