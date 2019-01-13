package com.bridgelabz.oopsprograms;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
//		        String[] players= new String[13];

		        String[] RANKS = {
		                "2", "3", "4", "5 ", "6", "7", "8", "9", "10",
		                "Jack", "Queen", "King", "Ace"};
		        // initialize deck
		        int n = SUITS.length * RANKS.length;
		        String[] deck = new String[n];
		        for (int i = 0; i < RANKS.length; i++) {
		            for (int j = 0; j < SUITS.length; j++) {
		                deck[SUITS.length*i + j] = RANKS[i]+ " " + SUITS[j];
		            }
		        }
		        // shuffle
		        for (int i = 0; i < n; i++) {
		            int r = i + (int) (Math.random() * (n-i));
		            String temp = deck[r];
		            deck[r] = deck[i];
		            deck[i] = temp;
		        }
		        // print shuffled deck
//		        for (int i = 0; i < n; i++) {
//		            System.out.println(deck[i]);
//		        }
//		        for(int k=0;k<4;k++) {
//		            for (int i = 0; i < n; i++) {
//		                players[k]=deck[i];
//		            }
//		        }
		        //System.out.println("Player 1 cards are");
		        for (int i = 0; i < 4; i++) {
		            System.out.println("** Person " + (i + 1) + " **");
		            for (int j = 0; j < 9; j++) {
		                System.out.println(deck[i + j * 4] );
		                        //+ " (Card " + (i + j * 4) + ")");
		            }
		            System.out.println();
		        }
		    }
}
		


			
