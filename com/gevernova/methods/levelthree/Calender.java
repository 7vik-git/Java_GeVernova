package com.gevernova.methods.levelthree;
import java.util.Scanner;

public class Calender {

    public static String monthName(int month){
        String[] months = {"January", "February" , "March" , "April" , "May" , "June" , "July" ,
                "August" , "September" ,"October" ,"November" ,"December"};
        return(months[month-1]);
    }

    public static int daysInMonth(int month ,int year ){
        int[] numOfDays = {31 , 28 , 31 , 30, 31 ,30, 31 ,31, 30, 31, 30, 31};
        int days =  numOfDays[month-1];
        if(month-1 == 1){
            if(year%4==0){
                days++;
            }
        }
        return days;
    }

    public static String firstDay(int m, int y){
        int d = 1;
        int y0 = y-(14-m)/12;
        int x = y0 + y0/4-y0/100 + y0/400;
        int m0 = m + 12 * ((14-m) / 12)-2;
        int d0 = (d + x + 31*m0 / 12)%7;

        String[] daysOfWeek = { "Sunday" , "Monday" , "Tuesday" , "Wednesday",
                        "Thursday", "Friday" , "Saturday"};
        return daysOfWeek[d0];

    }

    public static int dat(int m,int y){
        int d = 1;
        int y0 = y-(14-m)/12;
        int x = y0 + y0/4-y0/100 + y0/400;
        int m0 = m + 12 * ((14-m) / 12)-2;
        int d0 = (d + x + 31*m0 / 12)%7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        String Month  = monthName(month);
        System.out.println("Name of the Month is : " + Month);

        int days = daysInMonth(month , year);
        System.out.println("Number of Days in " + Month +" is " + days );

        String first_day = firstDay(month,year);
        System.out.println(Month + " 1st of " + year + " falls on a " + first_day + ".");

        System.out.println();
        System.out.println();

        System.out.println(Month + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

// Print leading spaces for the first day
        int d0 = dat(month, year);
        for (int i = 0; i < d0; i++) {
            System.out.print("    ");
        }

        int day = 1;
        while (day <= days) {
            for (int i = d0; i < 7 && day <= days; i++) {
                System.out.printf("%3d ", day);
                day++;
            }
            System.out.println();
            d0 = 0; // Reset to 0 after first week
        }

    }
}
