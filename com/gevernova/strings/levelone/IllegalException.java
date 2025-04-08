package com.gevernova.strings.levelone;
import java.util.Scanner;
public class IllegalException {
    public static void generateException(String text, int startIndex, int endIndex){
        System.out.println(text.substring(startIndex, endIndex));
    }
    public static void handleException(String text, int startIndex, int endIndex){
        try{
            if(startIndex>endIndex){
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            generateException(text, startIndex, endIndex);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text=input.nextLine();
        System.out.println("Enter start index and end index: ");
        int startIndex=input.nextInt();
        int endIndex=input.nextInt();
        handleException(text, startIndex, endIndex);
    }
}

