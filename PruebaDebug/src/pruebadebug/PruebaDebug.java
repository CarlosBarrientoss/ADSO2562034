/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadebug;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class PruebaDebug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner askStation = new Scanner(System.in);
        System.out.println("Welcome, do you want to introduce the month(as number) or get the month from your local date?");
        String answerStation = askStation.nextLine();

        if (answerStation.equalsIgnoreCase("Date")) {
            Month stationDateTime = LocalDateTime.now().getMonth();
            String stationDate = stationDateTime.toString();
            String stationDateNumber = String.valueOf(stationDate);
            if (stationDateNumber.equals("12") || stationDateNumber.equals("1") || stationDateNumber.equals("2")) {
                System.out.println("Your month is: " + stationDateNumber + " so you are on Spring.");
            } else if (stationDateNumber.equals("3") || stationDateNumber.equals("4") || stationDateNumber.equals("5") || stationDateNumber.equals("6")) {
                System.out.println("Your month is: " + stationDateNumber + " so you are on Summer.");
            }
        }
    }
  }
    
