package com.gevernova.strings.levelone;
import java.util.*;
public class ReturnCharactersInAString {
    public static char[] returnCharacterArray(String stringOne){
        char[] characterArray=new char[stringOne.length()];
        for(int i=0;i<stringOne.length();i++){
            characterArray[i]=stringOne.charAt(i);
        }
        return characterArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringOne = input.nextLine();
        char[] characterArray=returnCharacterArray(stringOne);
        System.out.println("The characters in the string are  :");
        for (char c : characterArray) {
            System.out.println(c);
        }
        System.out.println("The characters in the string are using toCharArray() method is :");
        characterArray=stringOne.toCharArray();
        for (char c : characterArray) {
            System.out.println(c);
        }
        input.close();
    }
}

