
package operadores;

import java.util.Scanner;


public class Poo {
        public static void main(String[] args) {
    
        Scanner recibirNumero = new Scanner(System.in);
        
        Operadores instanciaOperadores = new Operadores();
        
        System.out.println("Ingrese un numero a :");
        instanciaOperadores.a = recibirNumero.nextInt();
        
        System.out.println("Ingrese un numero b :");
        instanciaOperadores.b = recibirNumero.nextInt();
        
        instanciaOperadores.sumar();
        instanciaOperadores.restar();
        instanciaOperadores.multiplicar();
        instanciaOperadores.dividir();
        instanciaOperadores.Asignacionsuma();
        instanciaOperadores.Asignacionresta();
        instanciaOperadores.Asigancionmultiplicar();
        instanciaOperadores.Asignaciondividir();
        instanciaOperadores.AsignacionMod();
        instanciaOperadores.dividir();
    } 
    
}
