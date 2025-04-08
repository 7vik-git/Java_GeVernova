package com.gevernova.methods.levelone;
import java.util.Scanner;

public class MaximumHandShakes {
//    Maximum Number of Handshakes :
    public static int maxHandShakes(int students){
        int max = (students * (students - 1))/2;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number of Students : ");
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int max = maxHandShakes(students);
        System.out.println("Maximum Number of HandShakes among " + students + " is : " + max);
    }
}
