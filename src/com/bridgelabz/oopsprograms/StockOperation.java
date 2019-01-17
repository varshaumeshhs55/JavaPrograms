package com.bridgelabz.oopsprograms;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.LinkedList;
import com.bridgelabz.util.MyGenericsStack;
import com.bridgelabz.util.NewQueue;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.Stock;
import com.bridgelabz.util.StockPerPerson;
import com.bridgelabz.util.StockPortfolio;
import com.bridgelabz.util.Transactions;

public class StockOperation {
	 private static StockPortfolio stockPortfolio = new StockPortfolio();
	    private static StockOperation stockOperation = new StockOperation();
	    private static StockPerPerson stockPerPerson = null;
	    private static LinkedList<String> linkedList = new LinkedList<String>();
	    private static NewQueue<String> queueLinkedList = new NewQueue<String>();
	    private static MyGenericsStack<String> stackLinkedList = new MyGenericsStack<String>(0);
	    private static MyGenericsStack<String> stackLinkedList2 = new MyGenericsStack<String>(0);
	    public static StockPerPerson buyStock() throws JsonGenerationException, JsonMappingException, IOException {
	        stockOperation = new StockOperation();
	        stockPortfolio = new StockPortfolio();
	        StockPortfolio.displayStock();
	        System.out.println("Select the stock name which has to be bought");
	        String name = OopsUtility.readString();
	        int flag = 0;
	        for (Stock stock : StockPortfolio.liOfStock) {
	            if (name.equals(stock.getStockNames())) {
	                System.out.println("Stock found");
	                System.out.println("adding to your account");
	                stockPerPerson = new StockPerPerson();
	                stockPerPerson.setStockNames(stock.getStockNames());
	                boolean yes = true;
	                while (yes == true) {
	                    System.out.println("Select number of shares");
	                    int share = OopsUtility.readInteger();
	                    if (stock.getNumberOfShare() >= share) {
	                        stockPerPerson.setNumberOfShare(share);
	                        stock.setNumberOfShare(stock.getNumberOfShare() - share);
	                        yes = false;
	                        String json = OopsUtility.userWriteValueAsString(StockPortfolio.liOfStock);
	                        OopsUtility.writeFile(json, StockPortfolio.str);
	                        break;
	                    } else {
	                        System.out.println("That amount of shares doesnot exist!!!");
	                        yes = true;
	                    }
	                }
	                System.out.println("number of stocks setted");
	                stockPerPerson.setSharePrice(stock.getSharePrice());
	                Transactions transactions = new Transactions();
	                transactions.setDate(OopsUtility.currentDate());
	                transactions.setStatus("purchased");
	                stockPerPerson.setTransactions(transactions);
	                flag = 1;
	                return stockPerPerson;
	            }
	        }
	        if (flag == 0) {
	            System.out.println("Stock name not found");
	        }
	        return null;
	    }

	    public static void sellStock() throws JsonGenerationException, JsonMappingException, IOException {
	        displayPerPersonStock();
	        System.out.println("Enter the name to the stack to be sold");
	        String sellStockName = OopsUtility.readString();
	        int flag = 0;
	        if (!StockPersonManagement.liOfStockPerPerson.isEmpty()) {
	            for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
	                if (sellStockName.equals(stockPerPerson.getStockNames())) {
	                    System.out.println("Enter how many number of shares has to be sold");
	                    int share = OopsUtility.readInteger();
	                    boolean run = true;
	                    while (run == true) {
	                        if (stockPerPerson.getNumberOfShare() >= share) {
	                            stockPerPerson.setNumberOfShare(stockPerPerson.getNumberOfShare() - share);
	                            run = false;
	                        } else {
	                            System.out.println("enter valid number of shares");
	                            run = true;
	                        }
	                    }
	                    for (Stock stock : StockPortfolio.liOfStock) {
	                        if (stock.getStockNames().equals(stockPerPerson.getStockNames())) {
	                            stock.setNumberOfShare(stock.getNumberOfShare() + stockPerPerson.getNumberOfShare());
	                        }
	                        String json = OopsUtility.userWriteValueAsString(StockPortfolio.liOfStock);
	                        OopsUtility.writeFile(json, StockPortfolio.str);
	                    }
	                    sold(stockPerPerson, share);
	                    System.out.println("Stock has been removed from account ");
	                    break;
	                }
	                flag = 1;
	            }

	        } else {
	            System.out.println("There are no stocks in account...!");
	        }
	        if (flag == 0) {
	            System.out.println("Entered stock doesnot exist in account!!!");
	        }
	    }

	    public static void sold(StockPerPerson stockPerPerson, int share) {
	        StockPerPerson stockPerPerson2 = new StockPerPerson();
	        stockPerPerson2.setStockNames(stockPerPerson.getStockNames());
	        stockPerPerson2.setSharePrice(stockPerPerson.getSharePrice());
	        stockPerPerson2.setNumberOfShare(share);
	        Transactions transactions = new Transactions();
	        transactions.setDate(OopsUtility.currentDate());
	        transactions.setStatus("sold");
	        stockPerPerson2.setTransactions(transactions);
	        StockPersonManagement.liOfStockPerPerson.add(stockPerPerson2);
	    }

	    public static void displayPerPersonStock() throws FileNotFoundException {
	        String string = OopsUtility.readFile(StockPersonManagement.getAccountName());
	        try {
	            StockPersonManagement.liOfStockPerPerson = OopsUtility.userReadValue(string, Stock.class);
	        } catch (Exception e) {
	            System.out.println("File is empty!!! Nothing in data to display");
	        }
	        for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
	            System.out.println("Stock            : " + stockPerPerson.getStockNames());
	            System.out.println("Number of shares   : " + stockPerPerson.getNumberOfShare());
	            System.out.println("Stock price        : " + stockPerPerson.getSharePrice());
	            System.out.println("Date             :" + stockPerPerson.getTransactions().getDate());
	            System.out.println("Transaction status :" + stockPerPerson.getTransactions().getStatus());
	            System.out.println("----------------------------------------------------");
	        }
	    }

	    public void storeDynamic() throws FileNotFoundException {
	        String string = OopsUtility.readFile(StockPersonManagement.getAccountName());
	        try {
	            StockPersonManagement.liOfStockPerPerson = OopsUtility.userReadValue(string, Stock.class);
	        } catch (Exception e) {
	            System.out.println("File is empty!!! Nothing in data to display");
	        }
	        for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
	            linkedList.add(stockPerPerson.getStockNames());
	            queueLinkedList.enqueue(stockPerPerson.getTransactions().getDate());
	            stackLinkedList.push(stockPerPerson.getTransactions().getStatus());
	        }

	    }

	    public void displayDynamic() throws Exception {
	        storeDynamic();
	        System.out.println("Stock Name Bought with Date and Time and Transaction report is below :");
	        System.out.print("Stock Name : ");
	        linkedList.getValue();
	        System.out.println();
	        System.out.print("Date       : ");
	        for (int i = 0; i < NewQueue.getSize(); i++) {
	            System.out.print(queueLinkedList.dequeue() + "\t");
	        }
	        System.out.println();
	        while (!stackLinkedList.isStackEmpty()) {
	            stackLinkedList2.push(stackLinkedList.pop());
	        }
	        System.out.print("Status     : ");
	        while (!stackLinkedList2.isStackEmpty()) {
	            System.out.print(stackLinkedList2.pop() + "\t\t\t");
	        }
	        System.out.println(
	                "\n---------------------------------------------------------------------------------------------------------");
	    }
	}


		


