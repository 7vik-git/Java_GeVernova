package com.gevernova.strings.levelthree;
import java.util.Scanner;

public class UniqueCharacters {
    public static int findLengthOfString(String string){
        int length=0;
        for(char ch:string.toCharArray()){
            length++;
        }
        return length;
    }
    static void findUniqueCharacters(String string,int length) {
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

        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(uniqueChars[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string=sc.nextLine();
        int lengthOfString=findLengthOfString(string);
        findUniqueCharacters(string,lengthOfString);
    }
}

