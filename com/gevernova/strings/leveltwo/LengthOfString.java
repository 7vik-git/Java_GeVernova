package com.gevernova.strings.leveltwo;
import java.util.Scanner;
public class LengthOfString {
    public static int FindLengthOfString(String string) {
        int count=0;
        try{
            while(true){
                string.charAt(count);
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return count;
        }
    }
    public static int LengthOfStringUsingBuiltInMethod(String string){
        return string.length();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String string=sc.nextLine();
        System.out.println("Using iteration: "+FindLengthOfString(string));
        System.out.println("Using built-in method: "+LengthOfStringUsingBuiltInMethod(string));
        sc.close();
    }
}

