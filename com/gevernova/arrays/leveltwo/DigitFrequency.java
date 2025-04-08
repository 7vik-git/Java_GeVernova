package com.gevernova.arrays.leveltwo;

public class DigitFrequency {

    public static void main(String[] args){
        String str = "aabcddef";
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                System.out.print((char)(i+'a'));
                break;
            }

        }
    }
}

