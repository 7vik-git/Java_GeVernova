package com.gevernova.strings.levelone;
import java.util.*;
public class CreateSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringOne = input.nextLine();
        System.out.println("Enter start and end index for substring: ");
        int startIndex = input.nextInt();
        int endIndex = input.nextInt();
        String subString="";
        for(int i=startIndex;i<endIndex;i++){
            subString+=stringOne.charAt(i);
        }
        System.out.println("The substring is : "+subString);
        System.out.println("The substring using the method substring()");
        System.out.println(stringOne.substring(startIndex, endIndex));
    }
}


