package com.gevernova.strings.levelone;
import java.util.Scanner;
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String stringOne = input.nextLine();
        System.out.println("Enter second string: ");
        String stringTwo = input.nextLine();
        boolean isEqual = true;
        if(stringOne.length()!=stringTwo.length()) isEqual = false;
        else {
            for (int i = 0; i < stringOne.length(); i++) {
                if (stringOne.charAt(i) != stringTwo.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        if (isEqual)
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");

        System.out.println("Checking the results using equal() method:");
        if(stringOne.equals(stringTwo))
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");

        input.close();
    }
}
