package org.example.estructurasDeControl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Conditionals {

    public void conditionIf() {

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        if (number1 > number2) {
            System.out.println("Biggest number is: " + number1);
        } else if (number2 > number3) {
            System.out.println("Biggest number is: " + number2);
        } else {
            System.out.println("Biggest number is: " + number3);
        }
    }

    public void elseIf() {

        Scanner askNumber = new Scanner(System.in);
        System.out.println("Please introduce a number:\n(From 1 to 4 or else, it won't be available)");
        Integer numberIf = askNumber.nextInt();

        if (numberIf == 1) {
            System.out.println("Number one");
        } else if (numberIf == 2) {
            System.out.println("Number two.");
        } else if (numberIf == 3) {
            System.out.println("Number three.");
        } else if (numberIf == 4) {
            System.out.println("Number four.");
        } else {
            System.out.println("Number not found.");
        }
    }

    public void stations() {

        Scanner askStation = new Scanner(System.in);
        System.out.println("Welcome, do you want to introduce the month as a number or get the month from your local date?" +
                "\n(Introduce number or date.)");
        String answerStation = askStation.nextLine();
        Month stationDateMonth = LocalDate.now().getMonth();
        String stationDateString = stationDateMonth.toString();

        if (answerStation.equalsIgnoreCase("Date")) {
            int stationDate = LocalDateTime.now().getMonthValue();
            if (stationDate == 12 || stationDate == 1 || stationDate == 2 ) {
                System.out.println("Your month is: " + stationDateString + " so you are on Winter.");
            } else if (stationDate == 3 || stationDate == 4 || stationDate == 5) {
                System.out.println("Your month is: " + stationDateString + ", so you are on Spring.");
            } else if (stationDate == 6 || stationDate == 7 || stationDate == 8) {
                System.out.println("Your month is: " + stationDateString + ", so you are on Summer.");
            } else {

            }
        } else {
            int stationDateAsk = askStation.nextInt();
            switch (stationDateAsk) {
                case 12, 1, 2 -> System.out.println("Your month is: " + stationDateString + " so you are on Winter.");
                case 3, 4, 5 -> System.out.println("Your month is: " + stationDateString + ", so you are on Spring.");
                case 6, 7, 8 -> System.out.println("Your month is: " + stationDateString + ", so you are on Summer.");
                case 9, 10, 11 -> System.out.println("Your month is: " + stationDateString + ", so you are on Autumn.");
                default -> System.out.println("Not a valid date has been introduced.");

            }
        }
    }

    public void fruits(){

        System.out.println("Welcome, introduce a month (in number) and i'll recommend you a fruit.");
        Scanner askMonth = new Scanner(System.in);
        int answerMonth = askMonth.nextInt();

        switch (answerMonth) {
            case 1, 2, 3, 4 -> System.out.println("Fruit recommended: Apple.");
            case 5, 6, 7, 8 -> System.out.println("Fruit recommended: Watermelon.");
            case 9, 10, 11, 12 -> System.out.println("Fruit recommended: Pear.");
            default -> System.out.println("Not a valid data has been introduced.");
        }

    }

    public void password(){

        System.out.println("Welcome user, please introduce the correct password to enter the system.");
        Scanner askPassword = new Scanner(System.in);
        String correctPassword = "password123";
        String passwordUser;
        int attempt = 0;

        do {
            attempt = 1 + attempt;
            System.out.println("Attempt n°: " + attempt);
            passwordUser = askPassword.nextLine();
            System.out.println("Password introduced: " + passwordUser);
        } while (!passwordUser.equalsIgnoreCase(correctPassword));
        System.out.println("Congratulations, you've introduced the correct password.");

    }

}