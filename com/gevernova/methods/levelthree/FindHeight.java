package com.gevernova.methods.levelthree;
import java.util.Scanner;

public class FindHeight {
     public static int sumOfHeights(int[] heights){
         int totalHeights = 0;
         for(int i=0;i<11;i++){
             totalHeights+=heights[i];
         }
         return totalHeights;
     }

    public static double meanHeights(int[] heights){
         double mean = 0;
         mean = (double) sumOfHeights(heights) /11;
         return mean;
    }

    public static int tallest(int[] heights){
         int max = Integer.MIN_VALUE;
         for(int i=0;i<11;i++){
             max = Math.max(max,heights[i]);
         }
         return max;
    }

    public static int smallest(int[] heights){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<11;i++){
            min = Math.min(min,heights[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Heights of All Students : ");
        int[] heights = new int[11];
        for(int i=0;i<11;i++){
            heights[i] = sc.nextInt();
        }
        int totalHeights = sumOfHeights(heights);
        System.out.println("Total Height of All Studenst is : " + totalHeights);

        double meanHeights = meanHeights(heights);
        System.out.println("Mean Height of All Students is : " + meanHeights);

        int smallest = smallest(heights);
        System.out.println("Shortest Height Among the Full Team is: " + smallest );

        int tallest = tallest(heights);
        System.out.println("Tallest Height Among the Full Team is: " + tallest);
    }

}
