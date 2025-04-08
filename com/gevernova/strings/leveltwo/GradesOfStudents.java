package com.gevernova.strings.leveltwo;
import java.util.*;
public class GradesOfStudents {

    public static void generateScores( int numberOfStudents) {
        int i, j;
        Random random = new Random();
        int[][] studentMarks = new int[numberOfStudents][3];
        for (i = 0; i < numberOfStudents; i++) {
            System.out.print("\nEnter three subjects marks of " + (i + 1) + " students : ");
            for (j = 0; j < 3; j++) {
                studentMarks[i][j] = random.nextInt(10, 99);
                System.out.print(studentMarks[i][j] + " ");


            }
        }
        double[][] results=generateStats(studentMarks,numberOfStudents);
        displayProgressReport(studentMarks,results,numberOfStudents);
    }
    public static double[][] generateStats(int[][] studentMarks,int numberOfStudents){
        double[][] results = new double[numberOfStudents][2];
        int i,j;
        double total;
        for (i = 0; i < numberOfStudents; i++) {
            total = 0;
            for (j = 0; j < 3; j++) {
                total += studentMarks[i][j];
            }
            results[i][0] = total;
            results[i][1] = total / 300;
        }
        return results;
    }


    public static void displayProgressReport(int[][] studentMarks,double[][] results,int numberOfStudents ){
        int i, j;
        String[][] grade=new String[numberOfStudents][2];
        for(i=0;i<numberOfStudents;i++) {
            if (results[i][1]*100 >= 80) {
                grade[i][0] = String.valueOf(results[i][1] * 100);
                grade[i][1] = "Level 4, above agency-normalized standards";
            }
            else if (results[i][1]*100 >= 70) {
                grade[i][0] = String.valueOf(results[i][1] * 100);
                grade[i][1] = "Level 3, at agency-normalized standards";
            }
            else if (results[i][1] >= 60) {
                grade[i][0] = String.valueOf(results[i][1] * 100);
                grade[i][1] = "Level 2, below, but approaching agency-normalized standards";
            }
            else if (results[i][1] >= 50) {
                grade[i][0] = String.valueOf(results[i][1] * 100);
                grade[i][1] = "Level 1, well below agency-normalized standards";
            }
            else if (results[i][1] >= 40) {
                grade[i][0] = String.valueOf(results[i][1] * 100);
                grade[i][1] = "Level 1-, too below agency-normalized standards";
            }
            else {
                grade[i][0] = String.valueOf(results[i][1] * 100);
                grade[i][1] = "Remedial standard";
            }
        }
        System.out.println("\nProgress Report:");
        System.out.println("Student\t\tSubject1\tSubject2\tSubject3\tTotal\t\tAverage\t\tPercentage\t\tGrade");
        for (i = 0; i < numberOfStudents; i++) {
            System.out.print("\n"+(i + 1) + "\t");
            for (j = 0; j < 3; j++) {
                System.out.printf("%12d",studentMarks[i][j] );
            }
            System.out.println("\t\t "+Math.round(results[i][0])+"\t\t "+String.format("%.2f",results[i][1])+"\t\t  "+String.format("%.3f",Double.parseDouble(grade[i][0]))+"\t\t"+grade[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int numberOfStudents = input.nextInt();
        generateScores(numberOfStudents);
        input.close();
    }
}

