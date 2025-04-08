package com.gevernova.strings.levelthree;
import java.util.Scanner;

public class BmiOfPeople {
    static String[][] findWeightStatus(double[][] personData,int number){
        double bmi;
        int i;
        String weightStatus[][] = new String[number][2];
        for (i = 0; i < number; i++) {
            weightStatus[i][0] = String.valueOf(personData[i][0] / (personData[i][1] * personData[i][1] / 10000));
            bmi = Double.parseDouble(weightStatus[i][0]);
            if (bmi <= 18.4)
                weightStatus[i][1] = "Person is underweight";
            else if (bmi >= 18.5 && bmi <= 24.9)
                weightStatus[i][1] = "Person is normalweight";
            else if (bmi >= 25.0 && bmi <= 39.9)
                weightStatus[i][1] = "Person is overweight";
            else
                weightStatus[i][1] = "Person is obese";
        }
        return weightStatus;
    }
    public static void displayResults(double[][] personData,int number,String[][] weightStatus){
        int i;
        double bmi;
        System.out.println("Weight \t\tHeight \t\tBmi \t\t\tWeight Status");
        for (i = 0; i < number; i++) {
            bmi = Double.parseDouble(weightStatus[i][0]);
            System.out.print("\n"+personData[i][0] +"\t\t"+ personData[i][1]+"\t\t"+String.format("%.3f",bmi)
                    + " \t\t\t" + weightStatus[i][1]);
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons : ");
        int number = input.nextInt();
        int i, j;
        double personData[][] = new double[number][2];
        for (i = 0; i < number; i++) {
            for (j = 0; j < 2; j++) {
                if (j == 0)
                    System.out.print("\nEnter weight of " + (i + 1) + " persons : ");
                else
                    System.out.print("\nEnter height of " + (i + 1) + " persons : ");

                personData[i][j] = input.nextDouble();
            }
        }
        String[][] weightStatus=findWeightStatus(personData,number);
        displayResults(personData,number,weightStatus);
    }
}

