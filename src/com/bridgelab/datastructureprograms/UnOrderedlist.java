/******************************************************************************
 *  Compilation:  javac -d bin UnorderedList.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.UnorderedList n
 *  
 *  Purpose: Reads the text from a file, split it into words and arrange it as Linked List.
 *  		 Takes a user input to search a Word in the List. If the Word is not found then 
 *  		 add it to the list, and if it found then remove the word from the List.
 *  		 In the end save the list into a file
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.DataStructureUtility;

public class UnOrderedlist
{ 
	public static void main(String[] args) throws FileNotFoundException
{
		/*
		* The main function is read a file and add to customized linked 
		* list to find the searched word
		*/int v=0;
    String csvFile = "/home/admin1/Desktop/vasa.txt";
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
         
            DataStructureUtility.printList(Li); //split function use to split the words in the line by commas
           do {
        	   System.out.println("Enter the key element to be searched");
           
            String key=DataStructureUtility.readString();
            int k=DataStructureUtility.delete(Li, key);
            if(k==0)
            {
                DataStructureUtility.insert(Li, key);
            }
          
            String fName="/home/admin1/Desktop/vasa.txt";
            String[] str=DataStructureUtility.toStrinConv(Li);
            
            DataStructureUtility.FileWriter(Li,str,fName);
            DataStructureUtility.dispFile(fName);
        v++;
    }
    while(v<=20);}
    catch (IOException e) {
        e.printStackTrace();
    }}}
   