package com.gevernova.strings.levelone;
import java.util.Scanner;
public class FormatException {
    public static void generateException(String text){
        System.out.println(Integer.parseInt(text));
    }
    public static void handleException(String text){
        try{
            generateException(text);
        }
        catch(NumberFormatException e){
            System.out.println("Entered an invalid number");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text=input.nextLine();
        handleException(text);
    }
}

