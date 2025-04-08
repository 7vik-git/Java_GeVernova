package com.gevernova.methods.levelone;
import java.util.Scanner;

public class NumberOfRounds {
    public static int numberOfRounds(int side1, int side2, int side3){
        int perimeter = side1+side2+side3;
        int rounds = 0;
        int distTravelled = 0;
        while(distTravelled<=5000){
            distTravelled+=perimeter;
            rounds++;
        }
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Side 1 : ");
        int side1 = sc.nextInt();
        System.out.println("Enter Length of Side 2 : ");
        int side2 = sc.nextInt();
        System.out.println("Enter Length of Side 3 : ");
        int side3 = sc.nextInt();

        int rounds = numberOfRounds(side1, side2, side3);
        System.out.println("Number of Rounds is : " + rounds);
    }
}
