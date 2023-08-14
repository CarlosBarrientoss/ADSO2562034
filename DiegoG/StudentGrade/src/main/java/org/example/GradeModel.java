package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class GradeModel {

    public static double[] studentGrade(Scanner askAmount, Scanner askGrade) {
        System.out.println("Welcome user, please introduce the amount of grades you have: ");
        int gradeAmount = askAmount.nextInt();
        double[] studentGrade = new double[gradeAmount];

        for (int i = 0; i < gradeAmount; i++) {
            System.out.println("Please introduce a number: " + (i+1)  );
            studentGrade[i] = askGrade.nextDouble();

            System.out.println("You introduced the number: " + studentGrade[i] + ". \n");
        }

        return studentGrade;
    }

    public static double studentSum(double[] studentGrade){
        double sumGrade = Arrays.stream(studentGrade).sum();
        sumGrade = (sumGrade/studentGrade.length);
        sumGrade = (sumGrade * 70)/100;
        System.out.println("Your grade is: " + sumGrade);
        return sumGrade;
    }

    public static double examGrade(Scanner askFinal){

        System.out.println("Please introduce the grade of your final exam: ");
        double examAsk = askFinal.nextDouble();
        System.out.println("The grade you introduced is: " + examAsk);

        return  examAsk;
    }

    public static double examPercentage(double finalExam){

        System.out.println("The grade you are getting from your final exam is: ");
        finalExam = (finalExam*30)/100;

        return finalExam;
    }

    public static void finalGrade(double sumGrade, double finalExam){
        System.out.println("Your final grade is: " + (sumGrade + finalExam));
    }

}
