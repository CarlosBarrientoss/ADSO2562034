package org.example.ciclofor;

import java.util.Scanner;

public class AppFor {

    public static void main(String[] args) {

        ClassFor classfor = new ClassFor();
        Scanner askLimit = new Scanner(System.in);
        System.out.println("Welcome, please introduce the limit number.");
        classfor.limit = askLimit.nextInt();
        classfor.numbersPair();

    }

}
