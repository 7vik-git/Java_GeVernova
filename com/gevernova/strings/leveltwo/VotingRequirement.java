package com.gevernova.strings.leveltwo;
import java.util.*;
public class VotingRequirement {
    static int[] findAges(){
        Random random =new Random();
        int[] ages=new int[10];
        for(int i=0;i<10;i++){
            ages[i]=random.nextInt(30);
        }
        return ages;
    }
    static Object[][] checkAge(int[] ages){
        Object[][] result=new Object[ages.length][2];
        for(int i=0;i<ages.length;i++){
            if(ages[i]<0){
                result[i][0]=String.valueOf(ages[i]);
                result[i][1]="Invalid age";
            }
            else{
                result[i][0]=ages[i];
                result[i][1]=ages[i]>18;
            }
        }
        return result;
    }
    static void displayResult(Object[][] result){
        for(int i=0;i<10;i++){
            System.out.println(result[i][0]+" "+" "+result[i][1]);
        }
    }
    public static void main(String[] args) {
        displayResult(checkAge(findAges()));
    }
}

