package com.gevernova.strings.leveltwo;
import java.util.Arrays;
import java.util.Scanner;

public class SplitTheString {
    public static int[] countTheLetters(String string) {
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ')
                count++;
        }
        int[] spacesIndex = new int[count];
        int index=0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ')
                spacesIndex[index++] = i;
        }
        return spacesIndex;
    }

    public static String[] splitString(String string,int[] spacesIndex ) {
        int length=spacesIndex.length+1,i,start=0;
        String[] characterArray=new String[length];
        for(i=0;i<length-1;i++){
            characterArray[i]=string.substring(start,spacesIndex[i]);
            start=spacesIndex[i]+1;
        }
        characterArray[length-1]=string.substring(start);
        System.out.println("Without using inbuilt split() method: ");
        for(i=0;i<length;i++)
            System.out.println(characterArray[i]);
        return characterArray;
    }
    public static boolean compare(String[] characterArray,String[] split){
        return Arrays.equals(characterArray, split);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        String[] split = string.split(" ");
        System.out.println("Using split() method:");
        for (String s : split) {
            System.out.println(s);
        }
        int[] count=countTheLetters(string);
        String[] characterArray=splitString(string,count);
        boolean check=compare(characterArray,split);
        if(check){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not same");
        }
        input.close();
    }
}

