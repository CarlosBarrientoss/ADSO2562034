package poo;

import java.util.Scanner;

public class Poo {

    public static void main(String[] args) {
     
        Scanner recibirNumero = new Scanner(System.in);
    
        Operadores instanciaOperadores = new Operadores();
    
        System.out.println("Ingrese el valor de a: ");
        
        instanciaOperadores.a = recibirNumero.nextInt();
        
        System.out.println("Ingrese el valor de b: ");
        
        instanciaOperadores.b = recibirNumero.nextInt();
        
        instanciaOperadores.sumar();
        instanciaOperadores.multiplicar();
        instanciaOperadores.division();
        instanciaOperadores.booleano();
        instanciaOperadores.operadoresAsignacion();
        instanciaOperadores.preincremento();
        instanciaOperadores.postincremento();
        instanciaOperadores.comparacion();
        instanciaOperadores.OperadorTernario();
    }
    
}
