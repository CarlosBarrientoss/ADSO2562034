package operadores;

import java.util.Scanner;

public class Poo {
    public static void main(String[] args) {
       
        Scanner recibirNumero = new Scanner(System.in);
        
        Operadores instanciaOperadores = new Operadores();
        
        System.out.println("Ingrese un numero a : ");
        instanciaOperadores.a =  recibirNumero.nextInt();
        
        System.out.println("Ingrese un numero b : ");
        instanciaOperadores.b =  recibirNumero.nextInt();
        
        instanciaOperadores.sumar();
        instanciaOperadores.resta();
        instanciaOperadores.multiplicar();
        instanciaOperadores.divicion();
        instanciaOperadores.asignacionSuma();
        instanciaOperadores.asignacionResta();
        instanciaOperadores.asignacionMulti();
        instanciaOperadores.asignacionDivi();
        instanciaOperadores.preIncrementoSum();
        instanciaOperadores.preIncrementoRes();
        instanciaOperadores.postIncrementoSum();
        instanciaOperadores.postIncrementoRes();
        instanciaOperadores.igualdad();
        instanciaOperadores.ternario();
        instanciaOperadores.ternarioPar();
    }
}