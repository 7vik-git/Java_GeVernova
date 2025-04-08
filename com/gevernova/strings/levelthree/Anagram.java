package com.gevernova.strings.levelthree;
import java.util.*;
public class Anagram {
    public static void checkAnagram(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return;
        }
        int[] characterArray = new int[256];
        for (int i = 0; i < stringOne.length(); i++) {
            char ch = stringOne.charAt(i);
            characterArray[ch]++;
            ch = stringTwo.charAt(i);
            characterArray[ch]--;
        }
        boolean isAnagram = true;
        for (int i : characterArray) {
            if (i != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("Two strings are anagrams");
        else
            System.out.println("Two strings are not anagrams");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String stringOne = sc.nextLine();
        System.out.println("Enter second string: ");
        String stringTwo = sc.nextLine();
        checkAnagram(stringOne, stringTwo);
    }
}
