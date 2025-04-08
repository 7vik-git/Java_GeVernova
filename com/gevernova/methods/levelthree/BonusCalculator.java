package com.gevernova.methods.levelthree;
import java.util.Arrays;
import java.util.Scanner;

public class BonusCalculator {
    static int empDetails[][] = new int[6][2];
    static int[][] newEmpSalaries = new int[6][2];

//    Method to print all salaries & bonus
    public static void printAllSalaries(){
        int oldSalary = 0;
        int newSalary = 0;
        int bonus = 0;
        int service = 0;
        System.out.printf("%-5s %-10s %-10s %-10s%n","OldSal", "Service", "Bonus", "NewSal");
        for(int i=0;i<6;i++){

            oldSalary = empDetails[i][0];
            service = empDetails[i][1];
            newSalary = newEmpSalaries[i][0];
            bonus = newEmpSalaries[i][1];
            System.out.println("----------------------------------------------------------");
            System.out.printf("%-10d %-10s %-5d %-5d%n", oldSalary, service,bonus, newSalary);

        }
    }


//  Method for Bonus Calculation
    public static void bonusCalculator(){
        int bonus = 0;
        for(int i =0;i<6;i++){
//            for(int j =1;j<2;j++){
                int serv = empDetails[i][1];
                int sal = empDetails[i][0];
                if(serv <5){
                    bonus = (sal*2)/100;
                    newEmpSalaries[i][0] = sal+bonus;
                    newEmpSalaries[i][1] = bonus;
                }else{
                    bonus = (sal*5)/100;
                    newEmpSalaries[i][0] = sal+bonus;
                    newEmpSalaries[i][1] = bonus;
                }
//            }
        }
    }


//    Generate Random Values for Employees Salary & Service
    public static void genEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salaries & Service of Employees : ");
        for(int i=0;i<6;i++){
                empDetails[i][0] = (int)(10000+Math.random()*90000);
                empDetails[i][1] = (int)(1+Math.random()*9);
            }
        }



    public static void main(String[] args) {
        genEmployeeDetails();
        bonusCalculator();
        for(int i =0;i<6;i++){
            System.out.println(Arrays.toString(empDetails[i]));
        }

        System.out.println("New Salaries with Bonus : ");

        for(int i =0;i<6;i++){
            System.out.println(Arrays.toString(newEmpSalaries[i]));
        }

        printAllSalaries();

    }
}
