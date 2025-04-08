package com.gevernova.methods.levelthree;


import java.util.Arrays;
import java.util.Scanner;

class NumberChecker {
//    to count number of digits
    public static int numOfDigits(int num){
        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }

//    digits in a number
    public static int[] digitsInNums(int num){
        int size = numOfDigits(num);
        int index = size-1;
        int[] digits = new int[size];
        while(num>0){
            int digit = num%10;
            num/=10;
            digits[index] = digit;
            index--;
        }
        return digits;
    }
//  Method to check if a number is DuckNumber
    public static boolean isDuckNumber(int num){
        int[] digits = digitsInNums(num);
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int num){
        int[] digits = digitsInNums(num);
        int numOfDig = digits.length;
        int sum = 0;
        for(int i =0;i<digits.length;i++){
            sum = sum + (int)(Math.pow(digits[i], numOfDig));
        }
        if(sum==num) return true;
        return false;
    }

    public static void findSmallest(int num){
        int[] digits = digitsInNums(num);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]<smallest){
                secondSmallest = smallest;
                smallest = digits[i];
            }else if(digits[i]>smallest && digits[i]<secondSmallest){
                secondSmallest = digits[i];
            }
        }
        System.out.println("Smallest Digit is : " + smallest + " Second Smallest Digit is : " + secondSmallest);

    }

    public static void findLargest(int num){
        int[] digits = digitsInNums(num);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]> largest){
                secondLargest = largest;
                largest = digits[i];
            }else if(digits[i]<largest && digits[i]>secondLargest){
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest Digit is : " + largest + " Second Largest Digit is : " + secondLargest);
    }


}

public class NumberClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int count  =  NumberChecker.numOfDigits(num);
        System.out.println(count);
        int[] digits = NumberChecker.digitsInNums(num);
        System.out.println(Arrays.toString(digits));
        if(NumberChecker.isDuckNumber(num)){
            System.out.println("is a duck number !!");
        }else{
            System.out.println("is not a duck number :(");
        }
        if(NumberChecker.isArmstrong(num)){
            System.out.println("is an armstrong number !!");
        }else{
            System.out.println("is not an armstrong number :(");
        }
        NumberChecker.findSmallest(num);
        NumberChecker.findLargest(num);


    }
}
