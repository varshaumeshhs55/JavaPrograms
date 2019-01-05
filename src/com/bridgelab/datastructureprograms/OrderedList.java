package com.bridgelab.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelabz.util.DataStructureUtility;

public class OrderedList {
	static String sortFile="/home/admin1/test.txt";
	static String fName="/home/admin1/test.txt";

	public static void main(String[] args) throws FileNotFoundException {

		DataStructureUtility LinkedList=new DataStructureUtility();
		String csvFile = "/home/admin1/test.txt";
		String line = "";
		DataStructureUtility Li=new DataStructureUtility();
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		try
		{
			while ((line = br.readLine()) != null)
			{
				String[] name = line.split(" ");
				for(int i=0;i<name.length;i++){
					String name1=name[i];
					DataStructureUtility.insert(Li, name1);
				}
			}
			while(true)
			{
				System.out.println("please select one option");
				System.out.println("1.Display list 2.to search element 3.Display modified File  ");
				int option=DataStructureUtility.readInteger();
				switch(option) {
				case 1:DataStructureUtility.printList(LinkedList);
				break;
				case 2:{System.out.println("Enter the key element to be searched");
				int key=DataStructureUtility.readInteger();
				String key1=String.valueOf(key);
				int k=DataStructureUtility.delete(LinkedList, key1);
				System.out.println(k);
				if(k==0) {
					DataStructureUtility.insert(LinkedList, key1);
				}
				int[] sortedArray = DataStructureUtility.toIntConv(LinkedList);    
				int[] stringSortedArray=DataStructureUtility.stringSort(sortedArray);
				String sortedString[]=DataStructureUtility.intTostring(stringSortedArray);
				//String[] sarray=new String[sortedarr.length];
				DataStructureUtility.usingFileWriter(LinkedList,sortedString,sortFile);
				break;}
				case 3:    DataStructureUtility.dispFile(sortFile);
				break;
				default:System.out.println("Please enter an valid option");
				break;

				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}




	}
}

