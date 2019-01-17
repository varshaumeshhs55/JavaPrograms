package com.bridgelabz.util;

public class StockPerPerson {
	private String StockNames;
	private int NumberOfShare;
	private double SharePrice;
	private Transactions transactions;

	public StockPerPerson() {
		 StockNames = null;
		 NumberOfShare = 0;
		 SharePrice = 0.0;
		transactions = null;
	}

	public String getStockNames() {
		return StockNames;
	}

	public void setStockNames(String stockNames) {
		StockNames = stockNames;
	}

	public int getNumberOfShare() {
		return NumberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		NumberOfShare = numberOfShare;
	}

	public double getSharePrice() {
		return SharePrice;
	}

	public void setSharePrice(double sharePrice) {
		SharePrice = sharePrice;
	}

	public Transactions getTransactions() {
		return transactions;
	}

	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}
}