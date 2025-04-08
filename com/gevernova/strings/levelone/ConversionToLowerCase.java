package com.gevernova.strings.levelone;
import java.util.Scanner;
public class ConversionToLowerCase {
    public static boolean compareResults(String stringOne,String stringTwo){
        return stringOne.equals(stringTwo);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string in uppercase: ");
        String string=input.nextLine();
        StringBuilder lowerCaseString= new StringBuilder();
        for(int i=0;i<string.length();i++){
            char ch=(char)(string.charAt(i)+32);
            lowerCaseString.append(ch);
        }
        System.out.println(lowerCaseString);
        System.out.println("Uppercase to Lowercase using to.LowerCase() method");
        System.out.println(string.toLowerCase());
        boolean compareResults=compareResults(lowerCaseString.toString(),string.toLowerCase());
        if(compareResults){
            System.out.println("Both strings are equal and same using both methods");
        }
        else{
            System.out.println("Both strings are not same using both methods");
        }
        input.close();
    }
}

