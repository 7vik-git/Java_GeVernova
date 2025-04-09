package com.gevernova.methods.leveltwo;
import java.util.Arrays;
import java.util.Scanner;

public class FindFactors {

    public static int countFactors(int num){
        int count = 2;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }

    public static int[] findFactors(int num){
        int size = countFactors(num);
        int[] factors = new int[size];
        factors[0]=1;
        int index = 1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                factors[index]=i;
                index++;
            }
        }
        factors[index] = num;
        return factors;
    }
    public static int findSquares(int[]factors){
        int sum = 0;
        for (int factor : factors) {
            sum += (int) Math.pow(factor, 2);
        }
        return sum;
    }

    public static int findCubes(int[]factors){
        int sum = 0;
        for (int factor : factors) {
            sum += (int) Math.pow(factor, 3);
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.println(Arrays.toString(factors));
        int sumOfSquares = findSquares(factors);
        System.out.println("Sum of Squares of all factors : " + sumOfSquares);
        int sumOfCubes = findCubes(factors);
        System.out.println("Sum of Cubes of all factors : " + sumOfCubes);
    }
}
