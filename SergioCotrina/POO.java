
package PooOperadores;
import java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        Scanner recibirNumero = new Scanner (System.in);
                
        Operadores instanciaOperadores = new Operadores();
        
        System.out.println("Ingrese el numero a: ");
        instanciaOperadores.a = recibirNumero.nextInt();
        System.out.println("Ingrese el numero b: ");
        instanciaOperadores.b = recibirNumero.nextInt();
        
        instanciaOperadores.sumar();
        instanciaOperadores.restar();
        instanciaOperadores.multiplicar();
        instanciaOperadores.dividir();
        instanciaOperadores.Asignacionsuma();
        instanciaOperadores.Asignacionresta();
        instanciaOperadores.Asignacionmultiplicacion();
        instanciaOperadores.Asignaciondividir();
        instanciaOperadores.AsignacionMod();
    }
}