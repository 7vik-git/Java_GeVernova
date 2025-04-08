package com.gevernova.strings.levelone;
import java.util.Scanner;
public class ConversionToUpperCase {
    public static boolean compareResults(String stringOne,String stringTwo){
        return stringOne.equals(stringTwo);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string in lowercase: ");
        String string=input.nextLine();
        StringBuilder upperCaseString= new StringBuilder();
        for(int i=0;i<string.length();i++){
            char ch=(char)(string.charAt(i)-32);
            upperCaseString.append(ch);
        }
        System.out.println(upperCaseString);
        System.out.println("Lowercase to Uppercase using to.UpperCase() method");
        System.out.println(string.toUpperCase());

        boolean results=compareResults(upperCaseString.toString(),string.toUpperCase());
        if(results){
            System.out.println("Both strings are equal and same using both methods");
        }
        else{
            System.out.println("Both strings are not same using both methods");
        }
        input.close();
    }
}
