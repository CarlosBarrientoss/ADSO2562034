/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author SENA
 */
import java.util.Scanner;
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese el primer numero: ");
            int numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero: ");
            int numero2 = entrada.nextInt();
        int totalDiv1 = 0;
        int totalDiv2 = 0;
        String resultadoFinal = null;

        for ( int base = numero1-1 ; base >= 0 ; base--){
           if (numero1 % base == 0){
               totalDiv1 += base;
           }
        }
        for ( int base = numero2-1 ; base >= 0 ; base--){
            if (numero2 % base == 0){
                totalDiv2 += base;
            }
        }

        if (numero1 == totalDiv2 && numero2 == totalDiv1){
            resultadoFinal = "Los valores ingresados son numeros amigos ";
        }
            else {
                resultadoFinal = "Los valores ingresados no son numeros amigos";
        }
    }
    
}
