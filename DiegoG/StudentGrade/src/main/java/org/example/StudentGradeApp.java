package org.example;

import java.util.Scanner;

public class StudentGradeApp extends GradeModel {
    public static void main(String[] args) {

        Scanner askAmount = new Scanner(System.in);
        Scanner askGrade = new Scanner(System.in);
        Scanner askFinal = new Scanner(System.in);

        finalGrade(studentSum(studentGrade(askAmount,askGrade)),examPercentage(examGrade(askFinal)));
    }
}