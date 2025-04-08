package com.gevernova.strings.levelone;
import java.util.Scanner;
public class ArrayIndexException {
    public static void generateException(){
        Scanner input=new Scanner(System.in);
        String[] names=new String[5];
        System.out.println("Enter 5 names: " );
        for(int i=0;i<5;i++){
            names[i]=input.nextLine();
        }
        System.out.println(names[8]);
    }
    public static void handleException(){
        try{
            generateException();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}

