package com.gevernova.strings.levelthree;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingCharacter(String string){
        int[] frequency=new int[256];
        for(char ch:string.toCharArray()){
            frequency[ch]++;
        }
        for(char ch:string.toCharArray()) {
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string;
        string=sc.nextLine();
        char result=findFirstNonRepeatingCharacter(string);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

