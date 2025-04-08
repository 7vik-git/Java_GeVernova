package com.gevernova.strings.levelthree;
import java.util.*;
public class FrequencyOfCharactersUsingNestedLoops {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string=sc.nextLine();
        int[] frequency=new int[string.length()];
        char[] characterArray=string.toCharArray();
        String[] result=new String[string.length()];
        int index=0;
        for(int i=0;i<string.length();i++) {
            if (characterArray[i] != '0') {
                frequency[i] = 1;
                for (int j = i+1; j < characterArray.length; j++) {
                    if (characterArray[i] == characterArray[j]) {
                        frequency[i]++;
                        characterArray[j] = '0';
                    }
                }
                result[index++] = characterArray[i] + "  " + frequency[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(result[i]);
        }
        sc.close();
    }
}

