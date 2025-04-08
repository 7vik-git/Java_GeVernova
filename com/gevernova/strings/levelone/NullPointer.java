package com.gevernova.strings.levelone;

import java.lang.*;
public class NullPointer {
    public static void generateException(){
        String text=null;
        System.out.println(text.length());
    }
    public static void handleException(){
        String text=null;
        try{
            generateException();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        handleException();

    }
}

