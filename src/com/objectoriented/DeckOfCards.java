package com.objectoriented;
public class DeckOfCards {
    public static void main(String[] args) {
        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        int result = SUITS.length * RANKS.length;
        String[] cards = new String[result];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                cards[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        for (int i = 0; i < result; i++) {
            int r = i + (int) (Math.random() * (result-i));
            String temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;
        }

        // print shuffled deck
        for (int i = 0; i < result; i++) {
            System.out.println(cards[i]);
        }
        //print shuffled deck
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++)
                System.out.println(cards[i]);
        }
    }
}
