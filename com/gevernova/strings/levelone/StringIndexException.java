package com.gevernova.strings.levelone;
import java.util.Scanner;
public class StringIndexException {
    public static void generateException(String text, int length){
        System.out.println(text.charAt(length+2));
    }
    public static void handleException(String text, int length){
        try{
            generateException(text, length);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text=input.nextLine();
        int length=text.length();
        handleException(text, length);

    }
}

