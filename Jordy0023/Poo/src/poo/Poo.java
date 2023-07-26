package poo;

import java.util.Scanner;

public class Poo {

    public static void main(String[] args) {

        Scanner recibirNumero = new Scanner(System.in);

        Operadores instanciaOperadores = new Operadores();

        System.out.println("ingrese el numero A");

        instanciaOperadores.a = recibirNumero.nextInt();

        System.out.println("ingrese un numero B ");
        
        instanciaOperadores.b= recibirNumero.nextInt();
        
        
        instanciaOperadores.sumar();
        instanciaOperadores.multiplicar();
        instanciaOperadores.division();
        instanciaOperadores.boleano();
        instanciaOperadores.operadoresAsignacion();
        instanciaOperadores.preincremento();
        instanciaOperadores.postincremento();
        instanciaOperadores.comparacion();
        instanciaOperadores.operadorTernario();
        
        
      
        
        

    }

}
