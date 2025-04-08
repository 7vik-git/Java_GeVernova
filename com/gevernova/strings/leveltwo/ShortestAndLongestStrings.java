package com.gevernova.strings.leveltwo;
import java.util.Scanner;

public class ShortestAndLongestStrings {
    public static int findTheLength(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ')
                count++;
        }
        return count;
    }

    public static int[] findTheSpaces(String string, int count) {
        int[] spacesIndex = new int[count];
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ')
                spacesIndex[index++] = i;
        }
        return spacesIndex;
    }

    public static String[] splitString(String string, int[] spacesIndex) {
        int length = spacesIndex.length + 1, i, start = 0;
        String[][] characterArray = new String[length][2];
        for (i = 0; i < length - 1; i++) {
            characterArray[i][0] = string.substring(start, spacesIndex[i]);
            characterArray[i][1] = String.valueOf(characterArray[i][0].length());
            start = spacesIndex[i] + 1;
        }
        characterArray[length - 1][0] = string.substring(start);
        characterArray[length - 1][1] = String.valueOf(characterArray[length - 1][0].length());
        System.out.println("Without using inbuilt split() method: ");
        int longest = 0, shortest = Integer.MAX_VALUE;
        String longestString = "", shortestString = "";
        for (i = 0; i < length; i++) {
            System.out.print(characterArray[i][0] + " " + Integer.parseInt(characterArray[i][1]) + "\n");
            if (Integer.parseInt(characterArray[i][1]) > longest) {
                longest = Integer.parseInt(characterArray[i][1]);
                longestString = characterArray[i][0];
            }
            if (Integer.parseInt(characterArray[i][1]) < shortest) {
                shortest = Integer.parseInt(characterArray[i][1]);
                shortestString = characterArray[i][0];
            }

        }
        return new String[]{longestString, shortestString};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        int length = findTheLength(string);
        int[] spacesIndex = findTheSpaces(string, length);
        String results[] = splitString(string, spacesIndex);
        System.out.println("The longest string is: " + results[0] + " and the shortest string is: " + results[1]);
    }
}


