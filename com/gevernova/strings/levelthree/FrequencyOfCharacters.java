package com.gevernova.strings.levelthree;
import java.util.Scanner;
public class FrequencyOfCharacters {
    public static void findCharacterFrequencies(String string) {
        int[] frequency = new int[256];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            frequency[ch]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((char)result[i][0] + "  " + result[i][1]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        sc.close();
        findCharacterFrequencies(string);
    }
}

