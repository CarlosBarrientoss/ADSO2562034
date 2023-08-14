

package com.mycompany.calcularnotas;

import java.util.Scanner;


public class CalcularNotas {

    public static void main(String[] args) {
        double notaParcial1;
        double notaParcial2;
        double notaParcial3;
        double notaExamenFinal;
       
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Ingresa la nota del primer examen parcial:");
            notaParcial1 = scanner.nextDouble();
            System.out.println("Ingresa la nota del segundo examen parcial:");
            notaParcial2 = scanner.nextDouble();
            System.out.println("Ingresa la nota del tercer examen parcial:");
            notaParcial3 = scanner.nextDouble();
   
            System.out.println("Ingresa la nota del examen final:");
            notaExamenFinal = scanner.nextDouble();
    
        }

       
        double porcentaje70 = 0.7;
        double sumaNotasParciales = notaParcial1 + notaParcial2 + notaParcial3;
        double nota70 = porcentaje70 * (sumaNotasParciales / 3.0);

    
        double porcentaje30 = 0.3;
        double nota30 = porcentaje30 * notaExamenFinal;

        
        System.out.println("70% de las notas parciales: " + nota70);
        System.out.println("30% del examen final: " + nota30);
    }
}
    

