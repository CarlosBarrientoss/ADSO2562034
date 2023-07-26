package poo;

import java.util.Scanner;

public class Poo {
    public static void main(String[] args) {
        Scanner recibirNumero = new Scanner(System.in);
        Operadores instanciaOperadores = new Operadores();
        System.out.println("Ingrese el primer numero: ");
        instanciaOperadores.a = recibirNumero.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        instanciaOperadores.b = recibirNumero.nextInt();
        instanciaOperadores.sumar();
        instanciaOperadores.resta();
        instanciaOperadores.multiplicar();
        instanciaOperadores.dividir();
        instanciaOperadores.asignacionMod();
        instanciaOperadores.asignacionDividir();
        instanciaOperadores.asignacion();
        instanciaOperadores.asignacionSuma();
        instanciaOperadores.asignacionResta();
        instanciaOperadores.asignacionMultiplicar();
        instanciaOperadores.igualdadCadena();
        instanciaOperadores.preincremento();
        instanciaOperadores.postincremento();
        instanciaOperadores.preDecremento();
        instanciaOperadores.postDecremento();
        instanciaOperadores.igualdadEnteros();
        instanciaOperadores.ternario();
    }
}