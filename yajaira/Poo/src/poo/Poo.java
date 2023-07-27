package poo;

import java.util.Scanner;

public class Poo {

    public static void main(String[] args) {
        
        Scanner recibirNumero = new Scanner(System.in);
        
        Operadores instanciaOperadores = new Operadores();
        
        System.out.println("ingrese el numero a: ");
        instanciaOperadores.a = recibirNumero.nextInt();
        
        System.out.println("ingrese el numero b: ");
        instanciaOperadores.b = recibirNumero.nextInt();

        instanciaOperadores.sumar();
        instanciaOperadores.multiplicar();
        instanciaOperadores.restar();
        instanciaOperadores.dividir();
        instanciaOperadores.operadorDeAsignacionSuma();
        instanciaOperadores.operadorDeAsignacionResta();
        instanciaOperadores.operadorDeAsignacionMultiplicacion();
        instanciaOperadores.operadorDeAsignacionModulo();
        instanciaOperadores.operadorDeAsignacionDivision();
        instanciaOperadores.preincremento();
        instanciaOperadores.postincremento();
        instanciaOperadores.igualdad();
        instanciaOperadores.operadorTernario();
        instanciaOperadores.operadorTernarioPar();
        
        
    }
    
}
