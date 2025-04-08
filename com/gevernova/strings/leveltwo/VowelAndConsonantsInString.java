package com.gevernova.strings.leveltwo;
import java.util.Scanner;

public class VowelAndConsonantsInString {
    public static void findVowelsAndConsonants(String string) {
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

        String vowelsAndConsonants[][]=new String[string.length()][2];
        for(int i=0;i<string.length();i++) {
            if (newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || newString.charAt(i) == 'i' || newString.charAt(i) == 'o' || newString.charAt(i) == 'u') {
                vowelsAndConsonants[i][0]=String.valueOf(string.charAt(i));
                vowelsAndConsonants[i][1]="Vowel";
            }
            else if(!Character.isLetter(newString.charAt(i))){
                vowelsAndConsonants[i][0]=String.valueOf(string.charAt(i));
                vowelsAndConsonants[i][1]="Not a letter";
            }
            else{
                vowelsAndConsonants[i][0]=String.valueOf(string.charAt(i));
                vowelsAndConsonants[i][1]="Consonant";
            }
        }
        for(int i=0;i<string.length();i++){
            System.out.println(vowelsAndConsonants[i][0]+" "+vowelsAndConsonants[i][1]+"\n");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string=input.nextLine();
        findVowelsAndConsonants(string);
        input.close();
    }
}

