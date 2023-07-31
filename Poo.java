
package poo;

import java.util.Scanner;

public class Poo {

    public static void main(String[] args) {
        
     Scanner recibirNumero = new Scanner (System.in); 
        Operadores instanciaOperadores = new Operadores();
    
        System.out.println("Ingrese un numero A: ");
        instanciaOperadores.a = recibirNumero.nextInt();
        System.out.println("Ingrese el numero B:");
        instanciaOperadores.b = recibirNumero.nextInt();
        instanciaOperadores.sumar();
        instanciaOperadores.restar();
        instanciaOperadores.multiplicar();
        instanciaOperadores.dividir();
        System.out.println("Ingrese en numero D: ");
        instanciaOperadores.d = recibirNumero.nextInt();
        instanciaOperadores.asignacionSuma();
        instanciaOperadores.asignacionSumar();
        instanciaOperadores.asignacionRestar();
        instanciaOperadores.asignacionMultiplicar();
        instanciaOperadores.asignacionDividir();
        instanciaOperadores.asignacionMod();
        instanciaOperadores.preIncremento();
        instanciaOperadores.postIncremento();
        instanciaOperadores.preIncremento();
        instanciaOperadores.postIncremento();
        instanciaOperadores.igualdad();
        instanciaOperadores.cadena();
        instanciaOperadores.ternario();

        
        
        
    }
    
    
}
