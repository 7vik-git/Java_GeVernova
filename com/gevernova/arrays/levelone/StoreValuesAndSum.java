package com.gevernova.arrays.levelone;

import java.util.*;

class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total = total + numbers[i];
        }
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total = " + total);
    }
}

