package com.gevernova.strings.leveltwo;
import java.util.*;
public class RockPaperScissors {
    static Scanner input=new Scanner(System.in);

    static String[] moves(int numberOfGames){
        Random random=new Random();
        int i=0;
        String[] results=new String[numberOfGames];
        while(numberOfGames-->0) {
            int choiceOfComputer = random.nextInt(3);
            System.out.println("Enter the player choice among 1:rock,2:paper or 3:scissors: ");
            int choiceOfPlayer=input.nextInt();
            System.out.println("Computer choice is :"+(choiceOfComputer+1)+"\n");
            choiceOfPlayer=choiceOfPlayer-1;
            if(choiceOfPlayer==choiceOfComputer) {
                results[i]="Tie";
                i++;
            }
            else if(choiceOfPlayer==0 && choiceOfComputer==2||choiceOfPlayer==1 && choiceOfComputer==0||choiceOfPlayer==2 && choiceOfComputer==1) {
                results[i] = "Player wins";
                i++;
            }
            else {
                results[i]="Computer wins";
                i++;
            }
        }
        return results;
    }
    static double[][] findResults(String[] results,int numberOfGames) {
        double[][] stats=new double[results.length][2];
        int countOfPlayer=0;
        int countOfComputer=0;
        System.out.println("The results of each match in order is: ");
        for (String result : results) {
            if (result.equals("Player wins")) {
                countOfPlayer+=1;
            }
            else if (result.equals("Computer wins")) {
                countOfComputer+=1;
            }
        }
        stats[0][0]=countOfPlayer;
        stats[0][1]=(double)countOfPlayer/numberOfGames*100;
        stats[1][0]=countOfComputer;
        stats[1][1]=(double)countOfComputer/numberOfGames*100;
        return stats;
    }
    static void printResults(String[] results,double[][] stats) {
        for(String result:results) {
            System.out.println(result);
        }
        System.out.println();
        System.out.println("Number of wins of player"+"  \t"+"Percentage of wins of player");
        System.out.println(stats[0][0]+"\t\t\t\t\t\t\t"+String.format("%.3f",stats[0][1]));
        System.out.println("Number of wins of computer"+"  "+"Percentage of wins of computer");
        System.out.println(stats[1][0]+"\t\t\t\t\t\t\t"+String.format("%.3f",stats[1][1]));
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of games to be played: ");
        int numberOfGames=input.nextInt();
        String[] results=moves(numberOfGames);
        printResults(results,findResults(results,numberOfGames));
    }
}

