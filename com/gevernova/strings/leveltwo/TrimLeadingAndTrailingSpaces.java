package com.gevernova.strings.leveltwo;
import java.util.*;
public class TrimLeadingAndTrailingSpaces {
    static int[] trimSpaces(String string){
        int start=0,end=string.length()-1;
        while(start<string.length() && string.charAt(start)==' ')
            start++;
        while(end>0 && string.charAt(end)==' ')
            end--;
        return new int[]{start,end};
    }
    static String createString(String oldString,int[] trimSpaces){
        String newString;
        newString = oldString.substring(trimSpaces[0],trimSpaces[1]+1);
        System.out.println("Using charAt() method: "+newString);
        return newString;
    }
    static String usingTrimMethod(String string){
        string=string.trim();
        System.out.println("Using trim() method: "+string);
        return string;
    }
    static void compareTwoStrings(String stringOne,String stringTwo){
        if(stringOne.equals(stringTwo)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not same");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string=sc.nextLine();
        int[] indexes=trimSpaces(string);
        compareTwoStrings(createString(string,indexes),usingTrimMethod(string));
    }
}

