package com.gevernova.arrays.leveltwo;
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();

        double[][] studentMarks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                double mark;
                do {
                    System.out.print("Enter marks in " + subject + " for student " + (i + 1) + ": ");
                    mark = scanner.nextDouble();
                } while (mark < 0 || mark > 100);
                studentMarks[i][j] = mark;
            }
        }

        for (int i = 0; i < number; i++) {
            double total = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2];
            percentages[i] = total / 3.0;
            if (percentages[i] >= 90) grades[i] = "A";
            else if (percentages[i] >= 80) grades[i] = "B";
            else if (percentages[i] >= 70) grades[i] = "C";
            else if (percentages[i] >= 60) grades[i] = "D";
            else grades[i] = "F";
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s\n",
                    studentMarks[i][0], studentMarks[i][1], studentMarks[i][2], percentages[i], grades[i]);
        }
    }
}
