package com.gevernova.strings.levelthree;
import java.util.*;

public class DeckOfCards {
    public static void initializeDeck(){
        String[] suits={ "Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numberOfCards=suits.length*ranks.length;
        createDeck(numberOfCards, suits, ranks);
    }
    public static void createDeck(int numberOfCards,String[] suits,String[] ranks) {
        String[] deck = new String[numberOfCards];
        int i=0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[i++] = rank + " of " + suit;
            }
        }
        shuffleDeck(deck);
    }
    public static void shuffleDeck(String[] deck) {
        String temp;
        int n=deck.length,randomCardNumber;
        Random random=new Random();
        for(int i=0;i<n;i++){
            temp=deck[i];
            randomCardNumber=random.nextInt(0,n);
            if(i==randomCardNumber){
                randomCardNumber=random.nextInt(0,n);
            }
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
        distributeCards(deck);
    }
    public static void distributeCards(String[] deck) {
        int n=deck.length;
        System.out.println("Enter number of players: ");
        Scanner scanner=new Scanner(System.in);
        int numberOfPlayers=scanner.nextInt();
        int numberOfCardsDistributed=(n/numberOfPlayers)*numberOfPlayers;
        String[][] playersAndCards=new String[numberOfCardsDistributed][2];
        int j=0;
        if(numberOfPlayers<n) {
            System.out.println("Each player will get: "+(n/numberOfPlayers)+" cards");
            System.out.println("Total distributed cards: "+numberOfCardsDistributed);
            for (int i = 0; i < numberOfCardsDistributed; i++) {
                j++;
                playersAndCards[i][0] = "player" + (j);
                if(j==numberOfPlayers){
                    j=0;
                }
                playersAndCards[i][1] =deck[i];
            }
            for (int i = 0; i < numberOfCardsDistributed; i++) {
                System.out.println((i+1)+" : "+playersAndCards[i][0]+" has "+playersAndCards[i][1]);
            }
        }
        else{
            System.out.println("The cards cant be distributed equally");
        }
    }
    public static void main(String[] args) {
        initializeDeck();
    }
}

