package operadores;

import java.util.Scanner;

public class Poo {
    
    public static void main(String[]args) {
        
        Scanner recibirNumero = new Scanner(System.in);
    
        Operadores instanciaOperadores = new Operadores();
    
        System.out.println("Ingresa el numero a:");
        instanciaOperadores.a = recibirNumero.nextInt();
        
        System.out.println("Ingresa el numero b:");
        instanciaOperadores.b = recibirNumero.nextInt();

        instanciaOperadores.sumar();
        instanciaOperadores.resta();
        instanciaOperadores.multiplicar();
        instanciaOperadores.dividir();
        instanciaOperadores.asignacionSuma();
        instanciaOperadores.asignacionResta();
        instanciaOperadores.asignacionMultiplicar();
        instanciaOperadores.asignacionDividir();
        instanciaOperadores.preincrementoSuma();
        instanciaOperadores.preincrementoResta();
        instanciaOperadores.posincrementoSuma();
        instanciaOperadores.posincrementoResta();
        instanciaOperadores.igualdad();
        instanciaOperadores.ternario();
        instanciaOperadores.ternarioPar();
        
    }
   
}
