package com.gevernova.strings.levelthree;
import java.util.Scanner;

public class Calender {
    public static String getMonth(int month) {
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
    }
    public static int checkLeapYear(int year) {
        if(year%4==0&&year%100!=0||year%400==0) {
            return 29;
        }
        else {
            return 28;
        }
    }
    public static int getDaysInMonth(int month,int year) {
        int[] numberOfDays={31,checkLeapYear(year),31,30,31,30,31,31,30,31,30,31};
        return numberOfDays[month-1];
    }
    public static int firstDayOfMonth(int month,int year) {
        int y0=year- (14 - month) /12;
        int x=y0+y0/4-y0/100+y0/400;
        int m=month+12*((14 - month) /12)-2;
        int firstDay=(1+x+(31*m)/12)% 7;
        return firstDay;
    }
    static void displayCalendar(int firstDay,int month,int year){
        String monthName=getMonth(month);
        int numberOfDays=getDaysInMonth(month,year);
        System.out.println(" "+monthName+" "+year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<firstDay;i++) {
            System.out.print("    ");
        }
        for(int i=1;i<=numberOfDays;i++) {
            System.out.printf("%4d",i);
            if((i+firstDay)%7==0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int year=sc.nextInt();
        int firstDay=firstDayOfMonth(month,year);
        displayCalendar(firstDay,month,year);
    }
}

