package com.bridgelabz.oopsprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.AddressBook;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.Person;
import com.bridgelabz.util.StockPerPerson;

public class StockPersonManagement {
StockOperation stockOperation=null;
	static List<StockPerPerson> liOfStockPerPerson=new ArrayList<StockPerPerson>();
	private File[] arrayOfFiles=new File(System.getProperty("user.dir")).listFiles();
	private final static String str="/home/admin1/Documents/Programs/JavaPrograms/";
	static String accountName=null;
	
	public static String getAccountName() {
		return accountName;
	}

	public static void setAccountName(String accountName) {
		StockPersonManagement.accountName = accountName;
	}

	public static void createPersonalAccount() throws IOException
	{
		System.out.println("enter the name of the person account which has to be created");

	        String account = OopsUtility.readString();
	        File file = new File(str + account);
	        boolean rs = file.createNewFile();
	        if (rs) {
	            System.out.println("account is created");
	        } else {
	            System.out.println("account of that name already exists");
	        }
	}

public void openPersonnelAccount() throws IOException {
    
    System.out.println("enter your account name ");
    String account = OopsUtility.readString();
    setAccountName(account);
    int flag=0;
    for (File file : arrayOfFiles) {
        String filename = file.getName();
        if (account.equals(filename)) {
            if (file.length() > 0) {
                System.out.println("Account Details");
                String string = OopsUtility.readFile(filename);
                liOfStockPerPerson = OopsUtility.userReadValue(string, StockPerPerson.class);
                insertDetails();
               } else {
                System.out.println("Account is empty");
                System.out.println("Add new data onto the Account");
                insertDetails();
            }
            flag=1;
        }
    }
    if(flag==0)
    {
        System.out.println("Account doesnot exist or u have not given extention(.json)");
    }}
public void insertDetails()
{
	StockOperation stockOperation=new StockOperation();
	int r=0;
	do
	{
		System.out.println("1.Buy Stock\n 2.Sell Stock\n 3.Save\n 4.Dispaly Account\n 5.Transaction Status\n 6.exit");
	int choice=OopsUtility.readInteger();
	switch(choice)
	{case 1:
        StockOperation.buyStock();
        
        break;
    case 2:
    	 StockOperation.sellStock();

        break;
    case 3:
    	 int flag=0;
    	 String acc=getAccountName();
    	 for(File file:arrayOfFiles)
    	 {
    		 String filename=file.getName();
    		 if(acc.equals(filename)) {
    			 try
    			 {
    				 String json=OopsUtility.userWriteValueAsString(liOfStockPerPerson);
    				 OopsUtility.writeFile(json, filename);
    				 System.out.println("Account Updated");
    				 flag=1;
    				 
    			 }catch(Exception e) {
    				 System.out.println("cannot write to file");
    			 
    				 
    			 }
    		 }}
    	 if(flag==0) {
    		 System.out.println("file doesnot exist");
    	 }
    	 
        break;
    case 4:
    	StockOperation.();
      
        break;
    case 5:
        addressBook.sortByLastName();
       
        break;
    case 6:
        addressBook.sortByZipCode();
        
        break;
    case 7:addressBookApplication.main(null);
  
    break;
    default:
        System.out.println("no choice");
        break;
    }
}while(c<=20);
liOfStockPerPerson.add(accountName);
}
	
	}
	}

}
