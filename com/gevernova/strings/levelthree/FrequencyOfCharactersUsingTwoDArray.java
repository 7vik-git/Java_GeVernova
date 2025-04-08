package com.gevernova.strings.levelthree;
import java.util.Scanner;

public class FrequencyOfCharactersUsingTwoDArray {
    public static void findUniqueCharacters(String string) {
        int length=string.length();
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = string.charAt(i);
            int count=0;

            for (int j = 0; j < length; j++) {
                if (string.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count==1) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }
    }
    public static void findCharacterFrequencies(String string) {
        int[] frequency = new int[256];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            frequency[ch]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] == 1) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] == 1) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        System.out.println("Unique character Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((char)result[i][0] + "  " + result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string=sc.nextLine();
        findUniqueCharacters(string);
        findCharacterFrequencies(string);
    }
}

