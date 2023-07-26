
package poo;

import java.util.Scanner;


public class Poo {


    public static void main(String[] args) {
        
        Scanner recibirNumero = new Scanner(System.in);
        Scanner recibirNumero2 = new Scanner(System.in);
            
        Operaciones instanciaOperaciones = new Operaciones();
        
        
        System.out.println("Ingresa numero a " );
        instanciaOperaciones.a =  recibirNumero.nextInt();
        
        System.out.println("Ingresa numero b ");
        instanciaOperaciones.b =  recibirNumero2.nextInt();
        
        instanciaOperaciones.sumar();
        instanciaOperaciones.multiplicar();
        instanciaOperaciones.restar();
        instanciaOperaciones.divison();
        instanciaOperaciones.OperadorAsignacionSuma();
        instanciaOperaciones.OperadorAsignacionResta();
        instanciaOperaciones.OperadorAsignacionMultiplicar();
        instanciaOperaciones.OperadorAsignacionDivision();
        instanciaOperaciones.Preincremento();
        instanciaOperaciones.Posincremento();
        instanciaOperaciones.Predecremento();
        instanciaOperaciones.Posdecremento();
        instanciaOperaciones.OperadoresIgualdad();
        instanciaOperaciones.OperadorTernario();
    }
    
}
