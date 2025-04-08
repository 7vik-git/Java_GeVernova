package com.gevernova.methods.levelone;

import java.util.Scanner;


public class SimpleInterest {

    public static double calcInterest(int interest , int principal , int time){
        double SI = interest*principal*time;
        return SI/100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount : ");
        int principal = sc.nextInt();
        System.out.println("Enter Interest Percentage  : ");
        int interest = sc.nextInt();
        System.out.println("Enter Time : ");
        int time = sc.nextInt();
        double SI = calcInterest(interest, principal, time);
        System.out.println("The Simple Interest is" + SI + " for Principal" + principal +", Rate of Interest" + interest + "and Time" + time);
    }
}
