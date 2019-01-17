package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.AddressBookManager;
import com.bridgelabz.util.OopsUtility;

public class AddressBookApplication {
	
	    public static void main(String[] args) throws IOException {

	        AddressBookManager addressBookApplication = new AddressBookManager();
	  int c=0;
	  do
	      {
	            System.out.println("1.Create Book 2.Open Book 3.Save Book 4.Save As Book 5.Close Book 6.exit");
	            int choice = OopsUtility.readInteger();
	            switch (choice) {
	            case 1:
	                addressBookApplication.createBook();
	             
	                break;
	            case 2:
	                addressBookApplication.openBook();
	                
	                break;
	            case 3:
	                addressBookApplication.saveBook();
	              
	                break;
	            case 4:
	                addressBookApplication.saveAsBook();
	              
	                break;
	            case 5:
	                addressBookApplication.closeBook();
	             
	                System.out.println("Book Closed");
	                break;
	            case 6:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Please select correct choice");
	            }
	        }while(c<=20);

	    }}
	
		


