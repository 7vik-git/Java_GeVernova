package com.gevernova.strings.levelthree;
import java.util.Scanner;

public class Palindrome {
    public static void isPalindromeUsingLoop(String string) {
        int start=0,end=string.length()-1;
        boolean isPalindrome=true;
        while(start<end)
        {
            if(string.charAt(start)!=string.charAt(end))
            {
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome)
            System.out.println("The given string is Palindrome using loop method");
        else
            System.out.println("The given string is not a palindrome using loop method");
    }
    public static void isPalindromeUsingRecursion(String string,int start,int end) {
        if (start>=end) {
            System.out.println("The given string is Palindrome using recursion method");
            return;
        }
        else if(string.charAt(start)!=string.charAt(end)){
            System.out.println("The given string is not a palindrome using recursion method");
            return;
        }
        isPalindromeUsingRecursion(string,start+1,end-1);
    }
    public static void isPalindromeUsingReversal(String string) {
        char[] reversedArray=new char[string.length()];
        int j=0;
        for(int i=string.length()-1;i>=0;i--)
        {
            reversedArray[j++]=string.charAt(i);
        }
        char[] originalArray=string.toCharArray();
        boolean isPalindrome=true;
        for(int i=0;i<originalArray.length;i++){
            if(originalArray[i]!=reversedArray[i]){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("The given string is Palindrome using reversing string method");
        else
            System.out.println("The given string is not a palindrome using reversing string method");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string=sc.nextLine();
        isPalindromeUsingLoop(string);
        isPalindromeUsingRecursion(string,0,string.length()-1);
        isPalindromeUsingReversal(string);
        sc.close();
    }
}


