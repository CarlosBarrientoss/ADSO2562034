
package poo;

import java.util.Scanner;

public class Poo {
    public static void main(String[] args) {
        
        Scanner recibirNumero = new Scanner(System.in);
        
        Operadores instancia = new Operadores();
        
        System.out.println("ingrese el numero a: ");
        
        instancia.a = recibirNumero.nextInt();
        
        System.out.println("ingrese el numero b: ");
        instancia.b = recibirNumero.nextInt();
        
        instancia.sumar();
        instancia.multiplicar();
        instancia.division();
        instancia.boleano();
        instancia.asignacionSumar();
        instancia.preincremento();
        instancia.metodoTernario();
                
    }
    
}
