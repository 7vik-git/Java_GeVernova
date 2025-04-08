package com.gevernova.strings.leveltwo;
import java.util.Scanner;

public class VowelsAndConsonantsCountInString {
    public static void findVowelsAndConsonants(String string) {
        string = string.replaceAll("[^a-zA-Z]", "");
        StringBuilder newString = new StringBuilder(string);

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 65 && ch <= 90) {
                newString.append(ch + 32);
            } else
                newString.append(ch);
        }
        findCount(string,newString);
    }
    public static void findCount(String string,StringBuilder newString){

        int countOfVowels=0,countOfConsonants=0;
        for(int i=0;i<string.length();i++) {
            if (newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || newString.charAt(i) == 'i' || newString.charAt(i) == 'o' || newString.charAt(i) == 'u') {
                countOfVowels++;
            }
        }
        countOfConsonants=string.length()-countOfVowels;

        System.out.println("The number of vowels in the string are "+countOfVowels);
        System.out.println("The number of consonants in the string are "+countOfConsonants);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string=input.nextLine();
        findVowelsAndConsonants(string);
        input.close();
    }
}
