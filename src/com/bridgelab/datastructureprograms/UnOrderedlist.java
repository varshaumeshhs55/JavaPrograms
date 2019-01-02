package com.bridgelab.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.DataStructureUtility;

public class UnOrderedlist
{ 
	public static void main(String[] args) throws FileNotFoundException
{int v=0;
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
   