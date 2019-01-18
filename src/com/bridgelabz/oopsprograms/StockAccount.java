package com.bridgelabz.oopsprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.LinkedList;
import com.bridgelabz.util.NewQueue;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.StackLinkedList;
import com.bridgelabz.util.Stock;
import com.bridgelabz.util.StockPerPerson;
import com.bridgelabz.util.StockPortfolio;
import com.bridgelabz.util.Transactions;

public class StockAccount {
static final String path="/home/admin1/Documents/Programs/JavaPrograms/";
static String chooseAccount;
static List<StockPerPerson> listOfStockPerPerson=new ArrayList<StockPerPerson>();
static NewQueue<String> newqueue=new NewQueue<String>();
static StackLinkedList<String> stack=new StackLinkedList<String>();
static StackLinkedList<String>  stack1=new StackLinkedList<String>();
static LinkedList<String> linkedlist=new LinkedList<String>();
static File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();



public static String getChooseAccount() {
	return chooseAccount;
}
public static void setChooseAccount(String chooseAccount) {
	StockAccount.chooseAccount = chooseAccount;
}
public static void createAccount() throws IOException {
	System.out.println("enter name of person account which has to be creadted");
    String name=OopsUtility.readString();
    File file=new File(path+name);
    boolean rs=file.createNewFile();
    if(rs)
    {
    	System.out.println("Account is created\n Restart and Open your account with your account name given.!");
    	
    }else
    {
    	System.out.println("Account name already exists");
    }
}
public static void openAccount() throws IOException {
	System.out.println("Accounts available are");
	File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
	for (File file : arrayOfFiles) {
        if (file.getName().endsWith(".json"))
            System.out.println(file.getName());
    }
    System.out.println("Choose the account");
    String chooseAccount = OopsUtility.readString();
    setChooseAccount(chooseAccount);
    for (File file : arrayOfFiles) {
        String filename = file.getName();
        if (chooseAccount.equals(filename)) {
            if (file.length() > 0) {
                System.out.println("Account is not empty");
                String string = OopsUtility.readjsonFile(filename);
                listOfStockPerPerson= OopsUtility.userReadValue(string, StockPerPerson.class);

                // Function that performs various operations after opening the account
                stockOperation();

            } else {
                System.out.println("Account has no data");
                stockOperation();
            }
        }
    }
}

**
 * Static function to read from the file and call the function to buy stock
 *
 * @throws IOException
 */
public static void buyStock() throws IOException {
    System.out.println("These are the stocks available:");

    // Static function that displays the stock details that are available
    StockPortfolio.displayStock();

    System.out.println("Enter the stock name you wish to buy");
    String stockName = OopsUtility.readString();
    System.out.println("Enter the number of shares you want to buy");
    int noOfShares = OopsUtility.readInteger();
   
	String string1 = OopsUtility.readjsonFile(path + chooseAccount);
    String string = OopsUtility.readjsonFile(StockPortfolio.str);
    StockPortfolio.liOfStock = OopsUtility.userReadValue(string, Stock.class);
    try {
        listOfStockPerPerson = OopsUtility.userReadValue(string1, StockPerPerson.class);

        // Function that buys stock
        StockPerPerson stockPerPerson= newData(stockName, noOfShares);

        listOfStockPerPerson.add(stockPerPerson);
    } catch (Exception e) {
    	 StockPerPerson stockCustomer = newData(stockName, noOfShares);
        listOfStockPerPerson.add(stockCustomer);
    }
    String json = OopsUtility.userWriteValueAsString(StockPortfolio.liOfStock);
    OopsUtility.writeFile(json, StockPortfolio.str);
}

/**
 * Static function that buys the stock
 *
 * @param stockName  the name of stock to be bought
 * @param noOfShares the number of shares the customer wishes to buy
 * @return object of STockCustomer class
 */
public static StockPerPerson newData(String stockName, int noOfShares) {
    for (Stock stock : StockPortfolio.liOfStock) {
        if (stockName.equals(stock.getStockNames())) {
            int numOfShares = stock.getNumberOfShare() - noOfShares;
            stock.setNumberOfShare(numOfShares);
            StockPerPerson stockperperson = new StockPerPerson();
            stockperperson.setStockNames(stockName);
            stockperperson.setNumberOfShare(noOfShares);
            stockperperson.setSharePrice(stock.getSharePrice());
            Transactions transaction = new Transactions();
            String date = OopsUtility.getDate();
            transaction.setDate(date);
            transaction.setStatus("Purchase");
            stockperperson.setTransactions(transaction);
            return stockperperson;
        }
    }
    return null;
}

**
 * Static function to write the details of the transaction of an account holder
 * onto the json file
 */
public static void saveStock() {
   
	System.out.println("Saving " + chooseAccount + " account");
    File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
    for (File file : arrayOfFiles) {
        String filename = file.getName();
        if (chooseAccount.equals(filename)) {
            try {
                String json = OopsUtility.userWriteValueAsString(listOfStockPerPerson);
                OopsUtility.writeFile(json, filename);
                System.out.println("Account details saved");
            } catch (Exception e) {
                System.out.println("Cannot write to file");
            }
        }
    }
}

**
 * Static Function to display the account details
 *
 * @throws IOException
 */
public static void displayStockAccount() throws IOException {

	String string = OopsUtility.readjsonFile(path + chooseAccount);
    File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
    for (File file : arrayOfFiles) {
        String filename = file.getName();
        if (chooseAccount.equals(filename)) {
            try {
                listOfStockPerPerson = OopsUtility.userReadValue(string, StockPerPerson.class);
                System.out.println("Displaying " + chooseAccount + "  account");
                for (StockPerPerson stock : listOfStockPerPerson) {
                    System.out.println("Stock Name: " + stock.getStockNames());
                    System.out.println("Number of Shares: " + stock.getNumberOfShare());
                    System.out.println("Share price: " + stock.getSharePrice());
                    System.out.println("Transaction date: " + stock.getTransactions().getDate());
                    System.out.println("Transaction status: " + stock.getTransactions().getStatus());
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Empty!");
            }
        }
    }
}

**
 * Static function to call the function that sells the stock
 *
 * @throws IOException
 */
public static void sellStock() throws IOException {
    displayStockAccount();
    System.out.println("Enter the name of the stock you wish to sell");
    String stockName = OopsUtility.readString();
    System.out.println("Enter the number of shares you wish to sell");
    int numOfShares = OopsUtility.readInteger();

	String string = OopsUtility.readjsonFile(path + chooseAccount);

    try {
        listOfStockPerPerson = OopsUtility.userReadValue(string, StockPerPerson.class);
       
        //Static function call to sell the stock
        StockPerPerson newStock = newSoldData(stockName, numOfShares);

        listOfStockPerPerson.add(newStock);
       
        //Function call to update the number of shares in the stock file
        updateStock(stockName, numOfShares);
       
    } catch (Exception e) {
        System.out.println("Buy stock before selling it");
    }

}

**
 * Static function to update the stock file
 *
 * @param stockName the name of the stock the customer wishes to sell
 * @param noOfShares the number of shares he wishes to sell
 *
 * @throws IOException
 */
public static void updateStock(String stockName, int noOfShares) throws IOException {
    String string1 = OopsUtility.readjsonFile(StockPortfolio.str);
    try {
        StockPortfolio.liOfStock = OopsUtility.userReadValue(string1, Stock.class);
        for (Stock stock : StockPortfolio.liOfStock) {
            if (stockName.equals(stock.getStockNames())) {
                int newNum = stock.getNumberOfShare() + noOfShares;
                stock.setNumberOfShare(newNum);
            }
        }
    } catch (Exception e) {

    }
}

/**
 * Static function to sell the stock
 *
 * @param stockName the name of the stock the customer wishes to sell
 * @param numOfShares the number of shares the customer wishes to sell
 * @return the object of the StockCustomer class
 */
public static StockPerPerson newSoldData(String stockName, int numOfShares) {
    for (StockPerPerson stock : listOfStockPerPerson) {
        if (stockName.equals(stock.getStockNames())) {
        	StockPerPerson  newStock = new StockPerPerson ();
            newStock.setStockNames(stockName);
            newStock.setNumberOfShare(numOfShares);
            newStock.setSharePrice(stock.getSharePrice());
            Transactions transaction = new Transactions();
            String date = OopsUtility.getDate();
            transaction.setDate(date);
            transaction.setStatus("Sold");
            newStock.setTransactions(transaction);
            return newStock;
        }
    }
    return null;

}

**
 * Static function to perform operations like buying and selling stock
 *
 * @throws IOException
 */
public static void stockOperation() throws IOException {
   int c=0;
    do {
        System.out.println("Enter choice: 1-Buy Stock  2-Sell Stock  3-Save Stock  4-Print Report  5-Quit");
        int choice = OopsUtility.readInteger();
        switch (choice) {
        case 1:
            buyStock();
            break;
        case 2:
            sellStock();
            break;
        case 3:
            saveStock();
            break;
        case 4:
            printReport();
            break;
        default:
            System.out.println("Invalid choice");
            System.exit(0);
            break;
        }
    }while(c<30);
}

**
 * Static function to add the stock name, date and transaction status into
 * linked list,queue and stack respectively
 *
 * @throws IOException
 */
public static void addPrintReport() throws IOException {
    String chooseAccount = null;
	String string = OopsUtility.readjsonFile(path + chooseAccount);
    try {
        listOfStockPerPerson = OopsUtility.userReadValue(string, StockPerPerson.class);
        for (StockPerPerson stockperperson: listOfStockPerPerson) {
        	linkedlist.add(stockperperson.getStockNames());
            newqueue.enqueue(stockperperson.getTransactions().getDate());
            stack.push(stockperperson.getTransactions().getStatus());
        }
    } catch (Exception e) {
        System.out.println("File is empty");
    }
}

**
// * Static Function to print the report
// *
// * @throws IOException
// */
//public static void printReport() throws IOException {
//    addPrintReport();
//    System.out.println("----Stock Purchase and Sold Details---");
//    System.out.print("Stock Name : ");
//    linkedlist.getLinkedList();
//    System.out.println();
//    System.out.print("Date       : ");
//    for (int i = 0; i < NewQueue.getSize(); i++) {
//        System.out.print(newqueue.dequeue() + "\t");
//    }
//    System.out.println();
//    while (!stack.isEmpty()) {
//        stack1.push(stack.pop());
//    }
//    System.out.print("Status     : ");
//    while (!stack1.isEmpty()) {
//        System.out.print(stack1.pop() + "\t\t\t");
//    }
//    System.out.println("----------------------------------------------------");
//}
//
//
//
//
//
//
//}
//
